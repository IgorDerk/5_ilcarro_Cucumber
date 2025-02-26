package ilcarro.pages;

import ilcarro.core.BasePage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(id = "email")
//    WebElement emailInput;
//
//    @FindBy(id = "password")
//    WebElement passwordInput;

    public void enterCredentials(String email, String password) {
//        type(emailInput, email);
//        type(passwordInput, password);
        $("#email").setValue(email);
        $("#password").setValue(password);
    }

    @FindBy(xpath = "//button[.='Y’alla!']")
    WebElement yallaButton;

    public void clickOnYallaButton() {
//        click(yallaButton);
        $(byXpath("//button[.='Y’alla!']")).click();
//        $(byXpath("//button[.='Y’alla!']")).click();
        // $("button").shouldHave(text("Y’alla!")).click();
//        $("button:contains('Y’alla!')").click();

    }

//    @FindBy(className = "message")
//    WebElement message;

    public void verifyTextMessage(String textToCheck) {
        pause(500);
//        Assert.assertEquals(text,message.getText());
        $(".message").shouldHave(text(textToCheck));

    }

    public void enterInValidCredentials(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");
        enterCredentials(email,password);
    }

    public void clickOnOk() {
        $(byXpath("//button[.='Ok']")).click();
    }
}
