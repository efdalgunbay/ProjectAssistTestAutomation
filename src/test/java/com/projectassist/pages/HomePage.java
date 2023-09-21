package com.projectassist.pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'ProjectAssist - Home')]")
    public WebElement homePageTitle;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[2]")
    public WebElement projectTemplatesNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[3]")
    public WebElement languageMappingNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[4]")
    public WebElement vendorMappingNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[5]")
    public WebElement extraCustomFieldsConfigurationNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[6]")
    public WebElement XTRFProjectsNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[7]")
    public WebElement XTRFProjectsDeliveryCalendarNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[8]")
    public WebElement memoQNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[9]")
    public WebElement clientPreferredLanguagesNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[10]")
    public WebElement integrationsNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[11]")
    public WebElement usersNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[13]")
    public WebElement statsNavButton;

    @FindBy(xpath = "(//div[@class='MuiListItemText-root'])[13]")
    public WebElement logsNavButton;








}
