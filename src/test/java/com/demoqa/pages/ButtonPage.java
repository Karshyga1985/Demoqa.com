package com.demoqa.pages;

import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {

    public ButtonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button#doubleClickBtn")
    public WebElement doubleClick;

    @FindBy(css = "button[id='rightClickBtn']")
    public WebElement rightClick; // button#rightClickBtn

    @FindBy(xpath = "//div/button[text()='Click Me']")
    public WebElement clickMe; // button#U73qg

    @FindBy(id = "doubleClickMessage")
    public WebElement msgDouble;

    @FindBy(id = "rightClickMessage")
    public WebElement msgRight;

    @FindBy(id="dynamicClickMessage")
    public WebElement msgClickMe;

public void setClick(WebElement click){
    Actions actions = new Actions(Driver.getDriver());
    if (click.equals(doubleClick)) {
        actions.doubleClick(click).build().perform();
    } else if (click.equals(rightClick)) {
        actions.contextClick(click).perform();
    } else if (click.equals(clickMe)) {
        actions.click(click).perform();
    }
}
}
