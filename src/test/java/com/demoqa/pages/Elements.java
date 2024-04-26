package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//h5)[1]")
    public WebElement elementsBtn; // //div[@class='card-body']//h5[.='Elements']

    @FindBy(xpath = "//li[@class='btn btn-light active']/span[.='Check Box']")
    public WebElement checkBox;

//    @FindBy(className = "rct-collapse rct-collapse-btn")
//    public WebElement toggleBtn;

    @FindBy(xpath = "(//button[@title='Toggle'])[3]")
    public WebElement toggleDocument;

    @FindBy(xpath = "(//button[@title='Toggle'])[4]")
    public WebElement toggleWorkSpace;

    @FindBy(id = "tree-node-angular")
    public WebElement angular;

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[.='Radio Button']")
    public WebElement radioBtn;

    @FindBy(id = "result")
    public WebElement message;

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[.='Web Tables']")
    public WebElement webTables;

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[.='Buttons']")
    public WebElement buttons;

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[.='Links']")
    public WebElement links;

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[.='Broken Links - Images']")
    public WebElement brokenLinks;

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[.='Upload and Download']")
    public WebElement uploadDownload;

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[.='Dynamic Properties']")
    public WebElement dynamicProperties;

    @FindBy(xpath = "//li[@class='btn btn-light active']/span[.='Text Box']")
    public WebElement textBox;
}
