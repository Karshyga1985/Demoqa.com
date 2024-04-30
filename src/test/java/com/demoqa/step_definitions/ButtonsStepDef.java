package com.demoqa.step_definitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.ButtonPage;
import com.demoqa.pages.LeftNavBar;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sql.rowset.BaseRowSet;
import java.time.Duration;

public class ButtonsStepDef {

    ButtonPage buttons = new ButtonPage();

    @Given("User clicks to the Buttons")
    public void user_clicks_to_the_buttons() {
       LeftNavBar leftNavBar=new LeftNavBar();
        leftNavBar.buttons.click();
    }

    @Given("user clicks to  Double Click Me")
    public void user_clicks_to_double_click_me() {
        BrowserUtils.sleep(2);
        buttons.setClick( buttons.doubleClick);
    }

    @Then("user sees {string}")
    public void user_sees(String message1) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(message1, buttons.msgDouble.getText());
        System.out.println(buttons.msgDouble.getText());
    }

    @Given("user clicks to  Right Click Me button")
    public void user_clicks_to_right_click_me_button() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", buttons.rightClick);
        buttons.setClick( buttons.rightClick);
    }

    @Then("user should be able to see {string}")
    public void user_should_be_able_to_see(String message2) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(message2, buttons.msgRight.getText());
        System.out.println(buttons.msgRight.getText());
    }

    @Given("user clicks to the  Click Me")
    public void user_clicks_to_the_click_me() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", buttons.clickMe);
        buttons.setClick( buttons.clickMe);
    }

    @Then("user sees another {string}")
    public void user_sees_another(String message3) {
        Assert.assertEquals(message3, buttons.msgClickMe.getText());
        System.out.println(buttons.msgClickMe.getText());
    }


}
