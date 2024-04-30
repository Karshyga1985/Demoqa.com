package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends MainPage{

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@title='Toggle']")
    public WebElement toggleBtn;

    @FindBy(xpath = "(//button[@title='Toggle'])[3]") // (//button[@title='Toggle'])[3]
    public WebElement toggleDocument;

    @FindBy(xpath = "(//button[@title='Toggle'])[4]")
    public WebElement toggleWorkSpace;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[6]")
    public WebElement angular; //      (//li[@class='rct-node rct-node-leaf'])[2]

    @FindBy(xpath = "//div[@id='result']/span[1]")
    public WebElement messageCheckBox;
    @FindBy(xpath = "//div[@id='result']/span[2]")
    public WebElement secMsgCheckBox;
}
