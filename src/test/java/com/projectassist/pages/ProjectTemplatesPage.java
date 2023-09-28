package com.projectassist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectTemplatesPage extends BasePage{

    @FindBy(xpath = "//label[contains(text(),'Template Name')]")
    public WebElement tamplateNameField;


    @FindBy(xpath = "//input[@placeholder='Select Created By']")
    public WebElement createdByFilterField;

    @FindBy(xpath = "//div[@class='MuiAutocomplete-popper']")
    public WebElement createdByFilterName;

    @FindBy(xpath = "(//*[contains(text(),'Ahmet Simsek')])[1]")
    public WebElement createdByFilterVerfy;

    @FindBy(xpath = "//input[@placeholder='Select Visibility']")
    public WebElement visibilityFilterField;

    @FindBy(xpath = "(//div[@class='MuiAutocomplete-popper'])[1]")
    public WebElement visibilityPrivateFilter;


    @FindBy(xpath = "(//*[contains(text(),'Private')])[1]")
    public WebElement visibilityPrivateFilterVerfy;

    @FindBy(xpath = "(//*[contains(text(),'Description')])[1]")
    public WebElement descriptionSortingField;

    @FindBy(xpath = "(//*[contains(text(),'test template 2 - langs added manulally')])[1]")
    public WebElement descriptionSortingVerfy;

    @FindBy(xpath = "//span[@class='MuiBadge-root jss341']")
    public WebElement nameSortingField;

    @FindBy(xpath = "//p[contains(text(),'111')]")
    public WebElement nameSortingVerfy;

    @FindBy(xpath = "//div[contains(text(),'Updated By')]")
    public WebElement updateSortingField;

    @FindBy(xpath = "(//p[contains(text(),'Jaime Zuniga')])[2]")
    public WebElement updateSortingVerfy;

}
