package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//div[@class='card-body'])[1]")
    public WebElement elementsModule;

    @FindBy (xpath = "(//div[@class='card-body'])[2]")
    public WebElement formsModule;

    @FindBy (xpath = "(//div[@class='card-body'])[3]")
    public WebElement alertsModule;

    @FindBy (xpath = "(//div[@class='card-body'])[4]")
    public WebElement widgetsModule;

    @FindBy (xpath = "(//div[@class='card-body'])[5]")
    public WebElement interactionsModule;

    @FindBy (xpath = "(//div[@class='card-body'])[6]")
    public WebElement bookStoreApplicationModule;

    public static void click(WebElement webElement){
        webElement.click();
    }




    public void navigateHomePageElements(WebElement webElement){
        List<WebElement> moduleWebelements = new ArrayList<>(Arrays.asList(this.elementsModule, this.formsModule, this.alertsModule,
                this.widgetsModule, this.interactionsModule, this.bookStoreApplicationModule));
        for (WebElement eachElement : moduleWebelements) {
            if(eachElement.equals(webElement)){
                eachElement.click();
                break;
            }
        }
    }

}
