package com.projectassist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class memoQPage extends BasePage{
    @FindBy(xpath = "//input[@placeholder='memoQ Project Name']")
    public WebElement memeqProjectField;
}
