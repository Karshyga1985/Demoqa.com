package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{

    @FindBy (tagName = "h1")
    public WebElement webTableHeader;

    @FindBy (id = "addNewRecordButton")
    public WebElement addBtn;

    @FindBy (css = "div.modal-content")
    public WebElement registrationForm;

    @FindBy (id = "firstName-label")
    public WebElement formsFirstNameHeader;

    @FindBy (id = "lastName-label")
    public WebElement formsLastNameHeader;

    @FindBy (id = "firstName-label")
    public WebElement formsEmailHeader;

    @FindBy (id = "firstName-label")
    public WebElement formsAgeHeader;

    @FindBy (id = "firstName-label")
    public WebElement formsSalaryHeader;

    @FindBy (id = "firstName-label")
    public WebElement formsDepartmentHeader;

    @FindBy (css = "button#submit")
    public WebElement formsSubmitBtn;

    @FindBy (css = "button.close")
    public WebElement formsCloseBtn;

    @FindBy (css = "input#firstName")
    public WebElement formsFirstNamePlaceholder;

    @FindBy (css = "input#lastName")
    public WebElement formsLastNamePlaceholder;

    @FindBy (css = "input#userEmail")
    public WebElement formsEmailPlaceholder;

    @FindBy (css = "input#age")
    public WebElement formsAgePlaceholder;

    @FindBy (css = "input#salary")
    public WebElement formsSalaryPlaceholder;

    @FindBy (css = "input#department")
    public WebElement formsDepartmentPlaceholder;

    @FindBy (id = "searchBox")
    public WebElement searchBar;

    @FindBy (xpath = "(//div[@class='rt-resizable-header-content'])[1]")
    public WebElement tableFirstNameHeader;

    @FindBy (xpath = "(//div[@class='rt-resizable-header-content'])[2]")
    public WebElement tableLastNameHeader;

    @FindBy (xpath = "(//div[@class='rt-resizable-header-content'])[3]")
    public WebElement tableAgeHeader;

    @FindBy (xpath = "(//div[@class='rt-resizable-header-content'])[4]")
    public WebElement tableEmailHeader;

    @FindBy (xpath = "(//div[@class='rt-resizable-header-content'])[5]")
    public WebElement tableSalaryHeader;

    @FindBy (xpath = "(//div[@class='rt-resizable-header-content'])[6]")
    public WebElement tableDepartmentHeader;

    @FindBy (xpath = "(//div[@class='rt-resizable-header-content'])[7]")
    public WebElement tableActionHeader;

    @FindBy (id = "edit-record-4")
    public WebElement tableRowEditBtn;

    @FindBy (id = "delete-record-4")
    public WebElement tableRowDeleteBtn;




}
