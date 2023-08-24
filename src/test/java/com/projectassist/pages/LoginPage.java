package com.projectassist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
    public WebElement emailButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement userName;

    @FindBy(id = "i0118")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement forward;

    @FindBy(id = "idSIButton9")
    public WebElement singinbutton;

    @FindBy(xpath = "//input[@id='idBtn_Back']")
    public WebElement emailnobutton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body2 MuiTypography-displayBlock'])[1]")
    public WebElement HomeHamburgerMenuButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body2 MuiTypography-displayBlock'])[2]")
    public WebElement LanguageMappingHamburgerMenuButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body2 MuiTypography-displayBlock'])[3]")
    public WebElement XTRFProjectsHamburgerMenuButton;

    @FindBy(xpath = "//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body2 MuiTypography-displayBlock'])[4]")
    public WebElement XTRFProjectsDeliveryCalendarHamburgerMenuButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body2 MuiTypography-displayBlock'])[5]")
    public WebElement memoQHamburgerMenuButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body2 MuiTypography-displayBlock'])[6]")
    public WebElement ClientPreferredLanguagesHamburgerMenuButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body2 MuiTypography-displayBlock'])[7]")
    public WebElement LogsHamburgerMenuButton;




}

