package ilcarro.pages;

import ilcarro.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
//        driver.get("https://ilcarro.web.app/");
        open("https://ilcarro.web.app/");
    }

//    @FindBy(xpath = "//a[.=' Let the car work ']")
//    WebElement homePageTitle;
public boolean isHomePageTitlePresent() {
    // return isElementPresent(homePageTitle);
    return $("h1").shouldHave(text("Find your car now!")).isDisplayed();
}

//    @FindBy(xpath = "//a[.=' Log in ']")
//    WebElement loginLink;

    public void clickOnLoginLink() {
//        click(loginLink);
        $(byXpath("//a[.='Log in']")).click();
    }
}
