package ilcarro.core;

import org.openqa.selenium.Point;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BasePage {

    public void launchBrowser() {
        open("about:blank");
        getWebDriver().manage().window().setPosition(new Point(-1500, 0));
        getWebDriver().manage().window().maximize();
    }

    public void quitBrowser() {
        closeWebDriver();
    }
}
