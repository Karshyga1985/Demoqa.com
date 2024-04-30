package com.demoqa.step_definitions;

import com.demoqa.pages.LeftNavBar;
import com.demoqa.pages.RadioBtnPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class RadioBtnStepDef {
    RadioBtnPage radioPage = new RadioBtnPage();

    @Given("User clicks to the Radio Button")
    public void user_clicks_to_the_radio_button() {
        LeftNavBar leftNavBar = new LeftNavBar();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", leftNavBar.radioBtn);
        leftNavBar.radioBtn.click();
    }

    @When("User clicks to Yes button")
    public void user_clicks_to_yes_button() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", radioPage.yes);
    }

    @Then("User should see {string} message")
    public void user_should_see_message(String msg) {
        String actualMsg = radioPage.messageRdBtn.getText();
        Assert.assertEquals(msg, actualMsg);
    }
}
