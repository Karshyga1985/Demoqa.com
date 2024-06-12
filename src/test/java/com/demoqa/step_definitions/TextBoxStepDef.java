package com.demoqa.step_definitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.LeftNavBar;
import com.demoqa.pages.TextBoxPage;
import com.demoqa.utilities.BrowserUtils;
import com.google.common.base.Verify;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TextBoxStepDef {

    BasePage basePage;
    LeftNavBar leftNavBar;
    TextBoxPage textBoxPage = new TextBoxPage();

    //Scenario: Verify Text Box form headers display correctly
    @Given("User is on the Elements page")
    public void userIsOnTheElementsPage() {
        basePage = new BasePage();
        basePage.navigateHomePageElements(basePage.elementsModule);
    }

    @When("User selects Text Box option")
    public void user_selects_text_box_option() {
        leftNavBar = new LeftNavBar();
        leftNavBar.navigateLeftNavElements(leftNavBar.textBox);
    }

    @Then("User sees {string} header")
    public void user_sees_header(String expectedPageHeader) {
        assertEquals(expectedPageHeader, textBoxPage.TextBoxPageHeader.getText());
    }

    @Then("User sees the Text Box placeholders headers display correctly as below")
    public void user_sees_the_text_box_placeholders_headers_display_correctly_as_below(List<String> expectedHeaders) {
        List<String> actualHeaders = new ArrayList<>();
        actualHeaders.add(textBoxPage.fullNameFieldHeader.getText());
        actualHeaders.add(textBoxPage.emailFieldHeader.getText());
        actualHeaders.add(textBoxPage.currentAddressFieldHeader.getText());
        actualHeaders.add(textBoxPage.permanentAddressFieldHeader.getText());

        assertEquals(expectedHeaders, actualHeaders);
    }

    //Scenario Outline: Verify that the user can submit the Text Box form successfully
    @When("User enters {string} in the Full Name placeholder")
    public void userEntersInTheFullNamePlaceholder(String fullName) {
        textBoxPage.fullNamePlaceholder.sendKeys(fullName);
    }

    @And("User enters {string} in the Email placeholder")
    public void userEntersInTheEmailPlaceholder(String email) {
        textBoxPage.emailPlaceholder.sendKeys(email);
    }

    @And("User enters {string} in the Current Address placeholder")
    public void userEntersInTheCurrentAddressPlaceholder(String currentAddress) {
        textBoxPage.currentAddressPlaceholder.sendKeys(currentAddress);
    }

    @And("User enters {string} in the Permanent Address placeholder")
    public void userEntersInThePermanentAddressPlaceholder(String permanentAddress) {
        textBoxPage.permanentAddressPlaceholder.sendKeys(permanentAddress);
    }

    @And("User clicks the Submit button")
    public void userClicksTheSubmitButton() {
        BrowserUtils.scrollToElement(textBoxPage.submitBtn);
        textBoxPage.submitBtn.click();
    }

    @Then("User should see the output result")
    public void userShouldSeeTheOutputResult() {
        BrowserUtils.verifyElementDisplayed(textBoxPage.output);
    }
}
