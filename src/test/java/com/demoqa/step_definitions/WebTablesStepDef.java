package com.demoqa.step_definitions;

import com.demoqa.pages.LeftNavBar;
import com.demoqa.pages.WebTablesPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import com.google.common.base.Verify;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.*;

import static org.junit.Assert.*;

public class WebTablesStepDef {

    LeftNavBar leftNavBar;
    WebTablesPage webTablesPage = new WebTablesPage();

    //****************************First Scenario**********************************************
    //Scenario: Verify that Add button is clickable and Registration Form displays on the screen
    @When("User selects the Web Tables option")
    public void user_selects_the_web_tables_option() {
        leftNavBar = new LeftNavBar();
        leftNavBar.navigateLeftNavElements(leftNavBar.webTables);
    }

    @When("User clicks the Add button")
    public void user_clicks_the_add_button() {
       webTablesPage.addBtn.click();
    }

    @Then("User see that Registration Form modal window displays on the screen")
    public void user_see_that_registration_form_modal_window_displays_on_the_screen() {
        assertTrue(webTablesPage.registrationForm.isDisplayed());
    }

    @Then("The Registration Form has list of the fields below")
    public void the_registration_form_has_list_of_the_fields_below(List<String> expectedRegFormFields) {
        BrowserUtils.verifyElementDisplayed(webTablesPage.registrationForm);
       List<String> actualRegFormFields = new ArrayList<>();
       actualRegFormFields.add(webTablesPage.formsFirstNameHeader.getText());
       actualRegFormFields.add(webTablesPage.formsLastNameHeader.getText());
       actualRegFormFields.add(webTablesPage.formsEmailHeader.getText());
       actualRegFormFields.add(webTablesPage.formsAgeHeader.getText());
       actualRegFormFields.add(webTablesPage.formsSalaryHeader.getText());
       actualRegFormFields.add(webTablesPage.formsDepartmentHeader.getText());

       assertEquals(expectedRegFormFields, actualRegFormFields);
    }
//****************************Second Scenario**********************************************
    //Scenario Outline: Verify that the user can submit registration form successfully

    @And("User enters {string} in the form's first name placeholder")
    public void userEntersInTheFormSFirstNamePlaceholder(String firstName) {
        webTablesPage.formsFirstNamePlaceholder.sendKeys(firstName);
    }

    @And("User enters {string} in the form's last name placeholder")
    public void userEntersInTheFormSLastNamePlaceholder(String lastName) {
        webTablesPage.formsLastNamePlaceholder.sendKeys(lastName);
    }

    @And("User enters {string} in the form's email placeholder")
    public void userEntersInTheFormSEmailPlaceholder(String email) {
        webTablesPage.formsEmailPlaceholder.sendKeys(email);
    }

    @And("User enters {int} in the form's age placeholder")
    public void userEntersInTheFormSAgePlaceholder(int age) {
        webTablesPage.formsAgePlaceholder.sendKeys(String.valueOf(age));
    }

    @And("User enters {int} in the form's salary placeholder")
    public void userEntersInTheFormSSalaryPlaceholder(int salary) {
        webTablesPage.formsSalaryPlaceholder.sendKeys(String.valueOf(salary));
    }

    @And("User enters {string} in the form's department placeholder")
    public void userEntersInTheFormSDepartmentPlaceholder(String department) {
        webTablesPage.formsDepartmentPlaceholder.sendKeys(department);
    }

    @And("User clicks the forms Submit button")
    public void userClicksTheFormsSubmitButton() {
        webTablesPage.formsSubmitBtn.click();
    }

    @Then("User sees the new record on the table as below")
    public void userSeesTheNewRecordOnTheTableAsBelow(List<String> expectedRecord) {
        List<String> actualRecord = new ArrayList<>();
        actualRecord.add(webTablesPage.forthRowFirstName.getText());
        actualRecord.add(webTablesPage.forthRowLastName.getText());
        actualRecord.add(webTablesPage.forthRowEmail.getText());
        actualRecord.add(webTablesPage.forthRowAge.getText());
        actualRecord.add(webTablesPage.forthRowSalary.getText());
        actualRecord.add(webTablesPage.forthRowDepartment.getText());

        assertEquals(expectedRecord, actualRecord);
    }

    //****************************Second Scenario**********************************************
   // Scenario: Verify that the close button on the Registration form works as expected
    @And("User clicks the close button on the registration form")
    public void userClicksTheCloseButtonOnTheRegistrationForm() {
        webTablesPage.formsCloseBtn.click();
    }

    @Then("The registration form disappears on the screen")
    public void theRegistrationFormDisappearsOnTheScreen() {
        boolean modalAreaClosed = false;
        try{
            Driver.getDriver().findElement(By.cssSelector("div[aria-modal='true']"));
        }catch (NoSuchElementException e){
            modalAreaClosed = true;
        }

        assertTrue("The modal window should be closed", !modalAreaClosed);
    }

    //Scenario: Verify that user can search and retrieve info by the first name successfully
    @And("User enters {string} first name in the search box")
    public void userEntersFirstNameInTheSearchBox(String firstName) {
        webTablesPage.searchBox.sendKeys(firstName);
    }

    @Then("User sees searched info info in the table as below")
    public void userSeesSearchedInfoInfoInTheTableAsBelow(Map<String, Object> expectedSearchResult) {
        Map<String, Object> actualSearchResult = new LinkedHashMap<>();
        actualSearchResult.put(webTablesPage.tableFirstNameHeader.getText(), webTablesPage.firstRowFirstName.getText());
        actualSearchResult.put(webTablesPage.tableLastNameHeader.getText(), webTablesPage.firstRowLastName.getText());
        actualSearchResult.put(webTablesPage.tableAgeHeader.getText(), webTablesPage.firstRowAge.getText());
        actualSearchResult.put(webTablesPage.tableEmailHeader.getText(), webTablesPage.firstRowEmail.getText());
        actualSearchResult.put(webTablesPage.tableSalaryHeader.getText(), webTablesPage.firstRowSalary.getText());
        actualSearchResult.put(webTablesPage.tableDepartmentHeader.getText(), webTablesPage.firstRowDepartment.getText());
//        System.out.println(actualSearchResult);
//        System.out.println(expectedSearchResult);

        assertEquals(expectedSearchResult, actualSearchResult);

    }
}
