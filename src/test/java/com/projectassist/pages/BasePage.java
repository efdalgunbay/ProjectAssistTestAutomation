package com.projectassist.pages;

import com.projectassist.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

}