package com.projectassist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntegrationsPage extends BasePage{
    @FindBy(xpath = "(//span[@class='MuiButton-label'])[2]")
    public WebElement newIntegrationButton;

}
