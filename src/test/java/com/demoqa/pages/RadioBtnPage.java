package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioBtnPage {

    public RadioBtnPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[id='yesRadio'")
    public WebElement yes; //     //input[@id='yesRadio']

    @FindBy(className = "mt-3")
    public WebElement messageRdBtn;


}
