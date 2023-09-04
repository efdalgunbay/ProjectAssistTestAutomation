package com.projectassist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogsPage extends BasePage{

    @FindBy(xpath = "//*[contains(text(),'Current month')]")
    public WebElement logsPeriodField;
}
