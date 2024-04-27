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

    @FindBy (id = "userEmail-label")
    public WebElement formsEmailHeader;

    @FindBy (id = "age-label")
    public WebElement formsAgeHeader;

    @FindBy (id = "salary-label")
    public WebElement formsSalaryHeader;

    @FindBy (id = "department-label")
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

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[1]/div/div)[1] ")
    public WebElement firstRowFirstName;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[1]/div/div)[2] ")
    public WebElement firstRowLastName;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[1]/div/div)[3] ")
    public WebElement firstRowAge;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[1]/div/div)[4] ")
    public WebElement firstRowEmail;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[1]/div/div)[5] ")
    public WebElement firstRowSalary;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[1]/div/div)[6] ")
    public WebElement firstRowDepartment;

    @FindBy (id = "edit-record-1")
    public WebElement firstRowEditBtn;

    @FindBy (id = "delete-record-1")
    public WebElement firstRowDeleteBtn;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[4]/div/div)[1] ")
    public WebElement forthRowFirstName;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[4]/div/div)[2] ")
    public WebElement forthRowLastName;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[4]/div/div)[3] ")
    public WebElement forthRowAge;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[4]/div/div)[4] ")
    public WebElement forthRowEmail;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[4]/div/div)[5] ")
    public WebElement forthRowSalary;

    @FindBy (xpath = "((//div[@class='rt-tr-group'])[4]/div/div)[6] ")
    public WebElement forthRowDepartment;

    @FindBy (id = "searchBox")
    public WebElement searchBox;

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
