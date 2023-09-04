package com.projectassist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XTRFProjectsPage extends BasePage{



    @FindBy(xpath = "//input[@placeholder='Project Name']")
    public WebElement projectNameField;
}
