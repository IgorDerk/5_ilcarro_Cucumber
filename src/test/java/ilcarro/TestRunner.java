package ilcarro;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "ilcarro.stepDefinitions")
@ConfigurationParameter(key = "cucumber.plugin", value = "html:target/cucumber-reports.html, json:target/cucumber-reports.json")
// Комментируем эту строку если запускаем тесты командой
// gradle clean test -Dcucumber.filter.tags=@AddCar
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@LoginWitString")
public class TestRunner {
}

