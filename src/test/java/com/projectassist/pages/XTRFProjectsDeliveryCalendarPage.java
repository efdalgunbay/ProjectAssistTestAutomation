package com.projectassist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.BitSet;

public class XTRFProjectsDeliveryCalendarPage extends BasePage {
    @FindBy(xpath = "//div[@id='period-menu']")
    public WebElement deleveryPeriodfield;
}
