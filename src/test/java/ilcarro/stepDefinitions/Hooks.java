package ilcarro.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.selenide.videorecorder.core.VideoRecorder;

/**
 * 🔍 <strong>Hook (хук)</strong> — это "крючок", который "цепляет" выполнение кода до или после теста.
 */
public class Hooks {
    private final VideoRecorder videoRecorder = new VideoRecorder();

    /**
     * 🎥 Начинает запись видео перед сценарием.
     *
     * @param scenario Текущий сценарий теста
     */
    @Before
    public void beforeScenario(Scenario scenario) {
        scenario.log("🎥 Начинаем запись видео: " + scenario.getName());
        videoRecorder.start(); // Запускаем запись видео
    }

    @After
    public void afterScenario(Scenario scenario) {
        String videoPath = String.valueOf(videoRecorder.videoUrl().orElse(null)); // Переменная для пути к видео
        videoRecorder.finish(); // Завершаем запись
        scenario.log("🎥 Видео теста: " + videoPath);
    }
}
