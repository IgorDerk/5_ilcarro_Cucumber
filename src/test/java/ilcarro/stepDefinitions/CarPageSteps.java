package ilcarro.stepDefinitions;

import ilcarro.pages.CarPage;
import ilcarro.utils.PropertiesLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarPageSteps {

    @When("Пользователь вводит данные автомобиля")
    public void userEnterCarData() {
        // Извлекаем данные автомобиля из properties
        String location = PropertiesLoader.loadProperty("car.location");
        String manufacture = PropertiesLoader.loadProperty("car.manufacture");
        String model = PropertiesLoader.loadProperty("car.model");
        String year = PropertiesLoader.loadProperty("car.year");
        String fuel = PropertiesLoader.loadProperty("car.fuel");
        String seats = PropertiesLoader.loadProperty("car.seats");
        String classCar = PropertiesLoader.loadProperty("car.classCar");
        String price = PropertiesLoader.loadProperty("car.price");
        String about = PropertiesLoader.loadProperty("car.about");
        String photo = PropertiesLoader.loadProperty("car.photo");

        // Заполнение данных на странице
        new CarPage().enterCarDataToForm(location, manufacture, model, year, fuel, seats, classCar, price, about, photo);
    }

    @And("Пользователь нажимает кнопку Submit")
    public void userClickOnSubmitButton() {
        new CarPage().clickOnSubmitButton();
    }

    @Then("Пользователь проверяет сообщение {string}")
    public void userVerifySuccessMessage(String text) {
        new CarPage().verifySuccessMessage(text);
    }
}