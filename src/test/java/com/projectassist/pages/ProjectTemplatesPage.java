package com.projectassist.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectTemplatesPage extends BasePage{

    @FindBy(xpath = "//label[contains(text(),'Template Name')]")
    public WebElement tamplateNameField;


}
