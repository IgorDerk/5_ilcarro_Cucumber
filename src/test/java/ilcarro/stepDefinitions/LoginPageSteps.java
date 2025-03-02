package ilcarro.stepDefinitions;

import ilcarro.pages.LoginPage;
import ilcarro.utils.PropertiesLoader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class LoginPageSteps {
    @And("Пользователь вводит валидные данные")
    public void userEnterValidCredentials() {
        new LoginPage().enterCredentials("derk.i26252@gmail.com", "Password@1");
    }

    @And("Пользователь нажимает на кнопку Yalla")
    public void userClickOnYallaButton() {
        new LoginPage().clickOnYallaButton();
    }

    @Then("Пользователь проверяет отображение сообщения об успешном логине")
    public void userVerifySuccessLoginMessage() {
        new LoginPage().verifyTextMessage("Logged in success");
    }

    @And("Пользователь вводит валидный email и невалидный password")
    public void userEntersInvalidPassword(DataTable table) {
        new LoginPage().enterCredentials(table);
    }

    @Then("Пользователь проверяет отображение сообщения об неуспешном логине")
    public void userCheckErrorMessage() {
        new LoginPage().verifyTextMessage("\"Login or Password incorrect\"");
    }

    @And("Пользователь вводит валидные данные {string} и {string}")
    public void userEnterCredentials(String email, String password) {
        new LoginPage().enterCredentials(email,password);
    }

    @And("Пользователь вводит валидные данные email и password")
    public void userEnterValidCredentialsTable(DataTable table) {
        new LoginPage().enterCredentials(table);
    }


    @And("Пользователь вводит валидные данные email и password используя PropertiesLoader")
    public void enterCredentialsFromProperties() {
        String email = PropertiesLoader.loadProperty("valid.email");
        String password = PropertiesLoader.loadProperty("valid.password");
        new LoginPage().enterCredentials(email, password);
    }
}
