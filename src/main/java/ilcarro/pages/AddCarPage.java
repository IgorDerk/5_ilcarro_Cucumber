package ilcarro.pages;

import ilcarro.core.BasePage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

public class AddCarPage extends BasePage {
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    public void goesToPageCLetTheCarWork() {
        $(By.id("1")).click();
    }

    public void enterValidCarDetails(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();

        String location = dataTable.get(0).get("Location ");
        String manufacture = dataTable.get(0).get("Manufacture");
        String model = dataTable.get(0).get("Model");
        String year = dataTable.get(0).get("Year");
        String fuel = dataTable.get(0).get("Fuel");
        String seats = dataTable.get(0).get("Seats");
        String carClass = dataTable.get(0).get("Car Class");
        String serialNumber = dataTable.get(0).get("Serial Number");
        String price = dataTable.get(0).get("Price");
        String about = dataTable.get(0).get("About");
        fillCarDetails(location,manufacture,model,year,fuel,seats,carClass,serialNumber,price,about);


    }

    private void fillCarDetails(String location, String manufacture, String model, String year, String fuel,
                                String seats, String carClass, String serialNumber, String price, String about) {
        $("#pickUpPlace").setValue(location);
        $("#make").setValue(manufacture);
        $("#model").setValue(model);
        $("#year").setValue(year);
        $("#fuel").selectOption(fuel);
        $("#seats").setValue(seats);
        $("#carClass").setValue(carClass);
        $("#serialNumber").setValue(serialNumber);
        $("#price").setValue(price);
        $("#about").setValue(about);
    }
}
