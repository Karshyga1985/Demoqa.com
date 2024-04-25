package com.demoqa.step_definitions;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.Scenario;

import java.time.Duration;

public class Hooks {
    @Before
    public void setupMethod(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardownMethod(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

}
