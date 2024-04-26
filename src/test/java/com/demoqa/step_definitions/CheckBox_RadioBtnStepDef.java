package com.demoqa.step_definitions;

import com.demoqa.pages.Elements;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckBox_RadioBtnStepDef {



    @Given("User clicks {string} button")
    public void user_clicks_button(String element) throws InterruptedException{
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Thread.sleep(1500);

        for (int i=0; i<1; i++){
           // Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,350)");
        }
        Elements elements = new Elements();
        elements.elementsBtn.click();
       // Driver.getDriver().findElement(By.xpath("(//h5)[1]")).click();
    }


    @Then("User is able to see list of modules")
    public void user_is_able_to_see_list_of_modules(List<String> list) {
        Elements elements = new Elements();
        String textBoxStr = elements.textBox.getText();
        String checkBoxStr = elements.checkBox.getText();
        String radioStr = elements.radioBtn.getText();
        String webTabStr = elements.textBox.getText();
        String btnsStr = elements.buttons.getText();
        String linksStr = elements.textBox.getText();
        String brokenLinksStr = elements.textBox.getText();


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(elements.uploadDownload);
        String upldDwnldStr = elements.uploadDownload.getText();

        actions.moveToElement(elements.brokenLinks);
        String brokenLinkStr = elements.brokenLinks.getText();

        List<String> actualList = new ArrayList<>();
        actualList.addAll(Arrays.asList(textBoxStr,checkBoxStr, radioStr, webTabStr, btnsStr, linksStr, brokenLinksStr, upldDwnldStr, brokenLinkStr ));
        Assert.assertEquals(list, actualList);

    }
//
//    @Then("User clicks to the {string} button")
//    public void user_clicks_to_the_button(String checkBox) {
//        elements.checkBox.click();
//    }
//
//    @Then("User click to the {string} button")
//    public void user_click_to_the_button(String documents) {
//        elements.toggleDocument.click();
//    }
//
//    @Then("User should see {string}")
//    public void user_should_see(String workSpace) {
//       elements.toggleWorkSpace.click();
//    }

}
