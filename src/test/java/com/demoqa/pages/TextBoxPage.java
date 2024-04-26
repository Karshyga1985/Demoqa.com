package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends LeftNavBar{

    @FindBy (tagName = "h1")
    public WebElement TextBoxPageHeader;

    @FindBy (id = "userName-label")
    public WebElement fullNameFieldHeader;

    @FindBy (css = "input[placeholder='Full Name']")
    public WebElement fullNamePlaceholder;

    @FindBy (id = "userEmail-label")
    public WebElement emailFieldHeader;

    @FindBy (css = "input[placeholder='name@example.com']")
    public WebElement emailPlaceholder;

    @FindBy (id = "currentAddress-label")
    public WebElement currentAddressFieldHeader;

    @FindBy (css = "textarea[placeholder='Current Address'] ")
    public WebElement currentAddressPlaceholder;

    @FindBy (id = "permanentAddress-label")
    public WebElement permanentAddressFieldHeader;

    @FindBy (css = "textarea[id='permanentAddress']")
    public WebElement permanentAddressPlaceholder;

    @FindBy (css = "button[id='submit']")
    public WebElement submitBtn;

    @FindBy (xpath = "//div[@id='output']")
    public WebElement output;

    @FindBy (xpath = "(//div[@id = 'output']//p)[1]")
    public WebElement outputName;

    @FindBy (xpath = "(//div[@id = 'output']//p)[2]")
    public WebElement outputEmail;

    @FindBy (xpath = "(//div[@id = 'output']//p)[3]")
    public WebElement outputCurrentAddress;

    @FindBy (xpath = "(//div[@id = 'output']//p)[4]")
    public WebElement outputPermanentAddress;


}
