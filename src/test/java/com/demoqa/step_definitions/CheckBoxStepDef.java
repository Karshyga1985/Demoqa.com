package com.demoqa.step_definitions;

import com.demoqa.pages.CheckBoxPage;
import com.demoqa.pages.LeftNavBar;
import com.demoqa.pages.MainPage;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckBoxStepDef {

LeftNavBar leftNavBar = new LeftNavBar();
    CheckBoxPage checkBox = new CheckBoxPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("User clicks Elements button")
    public void user_clicks_elements_button() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i=0; i<1; i++){
            js.executeScript("window.scrollBy(0,350)");
        }

        checkBox.elementsBtn.click();
    }


    @Then("User is able to see list of modules")
    public void user_is_able_to_see_list_of_modules(List<String> list) {
        String textBoxStr = leftNavBar.textBox.getText();
        String checkBoxStr = leftNavBar.checkBox.getText();
        String radioStr = leftNavBar.radioBtn.getText();
        String webTabStr = leftNavBar.webTables.getText();
        String btnsStr = leftNavBar.buttons.getText();
        String linksStr = leftNavBar.links.getText();
        String brokenLinksStr = leftNavBar.brokenLinks.getText();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(leftNavBar.uploadAndDownload);
        String upldDwnldStr = leftNavBar.uploadAndDownload.getText();
        actions.moveToElement(leftNavBar.dynamicProperties);
        String dynamicStr = leftNavBar.dynamicProperties.getText();
        List<String> actualList = new ArrayList<>();
        actualList.addAll(Arrays.asList(textBoxStr,checkBoxStr, radioStr, webTabStr, btnsStr, linksStr, brokenLinksStr, upldDwnldStr, dynamicStr ));
        Assert.assertEquals(list, actualList);

    }

    @Then("User clicks to the Check Box button")
    public void user_clicks_to_the_check_box_button() {
        leftNavBar.checkBox.click();
    }

    @Then("User clicks to the Document button")
    public void user_clicks_to_the_document_button() {
        checkBox.toggleBtn.click();
        js.executeScript("arguments[0].scrollIntoView(true);", checkBox.toggleDocument);
        checkBox.toggleDocument.click();
    }

    @Then("User clicks to the Workspace button")
    public void user_clicks_to_the_workspace_button() {
        js.executeScript("arguments[0].scrollIntoView(true);",   checkBox.toggleWorkSpace);
        checkBox.toggleWorkSpace.click();
    }

    @Then("User clicks to the Angular button")
    public void user_clicks_to_the_angular_button() {
        js.executeScript("arguments[0].scrollIntoView(true);",   checkBox.angular);
        checkBox.angular.click();
    }
    @Then("user should be able to see the {string} message")
    public void user_should_be_able_to_see_the_message(String expectedMsg) {
        String actualMsg = checkBox.messageCheckBox.getText()+" "+checkBox.secMsgCheckBox.getText();
        Assert.assertEquals(expectedMsg, actualMsg );
    }

}
