package ilcarro.stepDefinitions;

import ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ilcarro.core.BasePage.driver;

public class LoginPageSteps {
    @And("Пользователь вводит валидные данные")
    public void userEnterValidCredentials() {
        new LoginPage(driver).enterCredentials("derk.i26252@gmail.com", "Password@1");
    }

    @And("Пользователь нажимает на кнопку Yalla")
    public void userClickOnYallaButton() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("Пользователь проверяет отображение сообщения об успешном логине")
    public void userVerifySuccessLoginMessage() {
        new LoginPage(driver).verifyTextMessage("Logged in success");
    }

    @And("Пользователь вводит валидный email и невалидный password")
    public void userEntersInvalidPassword(DataTable table) {
        new LoginPage(driver).enterInValidCredentials(table);
    }

    @Then("Пользователь проверяет отображение сообщения об неуспешном логине")
    public void userCheckErrorMessage() {
        new LoginPage(driver).verifyTextMessage("\"Login or Password incorrect\"");
    }

    @And("Пользователь вводит валидные данные {string} и {string}")
    public void userEnterCredentials(String email, String password) {
        new LoginPage(driver).enterCredentials(email, password);
    }

    @And("Пользователь нажимает на кнопку Ok")
    public void userClickOnOk() {
        new LoginPage(driver).clickOnOk();
    }


}

