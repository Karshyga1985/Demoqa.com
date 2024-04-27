package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftNavBar {

    public LeftNavBar(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='header-wrapper'])[1]")
    public WebElement elementsModule;

    @FindBy(xpath = "//span[.='Text Box']")
    public WebElement textBox;

    @FindBy(xpath = "//span[.='Check Box']")
    public WebElement checkBox;

    @FindBy(xpath = "//span[.='Radio Button']")
    public WebElement radioBtn;

    @FindBy(xpath = "//span[.='Web Tables']")
    public WebElement webTables;

    @FindBy(xpath = "//span[.='Buttons']")
    public WebElement buttons;

    @FindBy(xpath = "//span[.='Links']")
    public WebElement links;

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    public WebElement brokenLinks;

    @FindBy(xpath = "//span[.='Upload and Download']")
    public WebElement uploadAndDownload;

    @FindBy(xpath = "//span[.='Dynamic Properties']")
    public WebElement dynamicProperties;


    @FindBy (xpath = "(//div[@class='header-wrapper'])[2]")
    public WebElement formsModule;

    @FindBy (xpath = "//span[.='Practice Form']")
    public WebElement practiceForm;

    @FindBy (xpath = "(//div[@class='header-wrapper'])[3]")
    public WebElement alertsModule;

    @FindBy (xpath = "//span[.='Browser Windows']")
    public WebElement browserWindows;

    @FindBy (xpath = "//span[.='Alerts']")
    public WebElement alerts;

    @FindBy (xpath = "//span[.='Frames']")
    public WebElement frames;

    @FindBy (xpath = "//span[.='Nested Frames']")
    public WebElement nestedFrames;

    @FindBy (xpath = "//span[.='Modal Dialogs']")
    public WebElement modalDialogs;


    @FindBy (xpath = "(//div[@class='header-wrapper'])[4]")
    public WebElement widgetsModule;

    @FindBy (xpath = "//span[.='Accordian']")
    public WebElement accordian;

    @FindBy (xpath = "//span[.='Auto Complete']")
    public WebElement autoComplete;

    @FindBy (xpath = "//span[.='Date Picker']")
    public WebElement datePicker;

    @FindBy (xpath = "//span[.='Slider']")
    public WebElement slider;

    @FindBy (xpath = "//span[.='Progress Bar']")
    public WebElement progressBar;

    @FindBy (xpath = "//span[.='Tabs']")
    public WebElement tabs;

    @FindBy (xpath = "//span[.='Tool Tips']")
    public WebElement toolTips;

    @FindBy (xpath = "//span[.='Menu']")
    public WebElement menu;

    @FindBy (xpath = "//span[.='Select Menu']")
    public WebElement selectMenu;


    @FindBy (xpath = "(//div[@class='header-wrapper'])[5]")
    public WebElement interactionsModule;

    @FindBy (xpath = "//span[.='Sortable']")
    public WebElement sortable;

    @FindBy (xpath = "//span[.='Selectable']")
    public WebElement selectable;

    @FindBy (xpath = "//span[.='Resizable']")
    public WebElement resizable;

    @FindBy (xpath = "//span[.='Droppable']")
    public WebElement droppable;

    @FindBy (xpath = "//span[.='Dragabble']")
    public WebElement dragabble;


    @FindBy (xpath = "(//div[@class='header-wrapper'])[6]")
    public WebElement bookStoreApplicationModule;

    @FindBy (xpath = "//span[.='Login']")
    public WebElement login;

    @FindBy (xpath = "//span[.='Book Store']")
    public WebElement bookStore;

    @FindBy (xpath = "//span[.='Profile']")
    public WebElement profile;

    @FindBy (xpath = "//span[.='Book Store API']")
    public WebElement bookStoreApi;


    public void navigateLeftNavElements(WebElement webElement){
        List<WebElement> elementsOptions = new ArrayList<>(Arrays.asList(this.textBox, this.checkBox, this.radioBtn,
                this.webTables, this.buttons, this.links, this.brokenLinks, this.uploadAndDownload, this.dynamicProperties));
        for (WebElement eachElement : elementsOptions) {
            if(eachElement.equals(webElement)){
                eachElement.click();
                break;
            }
        }
    }
}
