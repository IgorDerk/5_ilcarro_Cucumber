package ilcarro.stepDefinitions;

import ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static ilcarro.core.BasePage.driver;

public class HomePageSteps {
    @Given("Пользователь запускает браузер")
    public void userLaunchesBrowser() {
        new HomePage(driver).launchBrowser();
    }

    @When("Пользователь открывает домашнюю страницу ilcarro")
    public void userOpensHomePage() {
        new HomePage(driver).openHomePage();
    }

    @Then("Проверить что заголовок домашней страницы отображается")
    public void verifyHomePageTitle() {
        Assert.assertTrue(new HomePage(driver).isHomePageTitlePresent());
    }

    @And("Пользователь закрывает браузер")
    public void userQuitBrowser() {
        new HomePage(driver).quitBrowser();
    }

    @And("Пользователь нажимает на ссылку Login")
    public void userClickOnLoginLink() {
        new HomePage(driver).clickOnLoginLink();
    }
}
