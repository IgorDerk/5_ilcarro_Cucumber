package ilcarro.stepDefinitions;

import ilcarro.pages.AddCarPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static ilcarro.core.BasePage.driver;

public class AddCarPageSteps {
    @Given("Пользователь переходит на страницу Let the car work")
    public void userGoesToPageCLetTheCarWork() {
        new AddCarPage(driver).goesToPageCLetTheCarWork();
    }

    @When("Пользователь заполняет валидные данные автомобиля")
    public void userFillsCarDetails(DataTable table) {
        new AddCarPage(driver).enterValidCarDetails(table);
    }
}
