package com.projectassist.step_definitions;

import com.projectassist.pages.HomePage;
import com.projectassist.utilities.ConfigReader;
import com.projectassist.utilities.Driver;
import com.projectassist.pages.LoginPage;
import com.projectassist.pages.RegisterPage;
import com.projectassist.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class LoginStepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Given("Gmail Button Click")
    public void gmail_button() {
        loginPage.emailButton.click();
        ReusableMethods.waitFor(3);

    }

    @Given("new tab is passed")
    public void TabisPassed() {
        ReusableMethods.waitFor(2);
        ReusableMethods.tabpassed();

    }

    @Given("new tab is passed two")
    public void TabisPassedtwo() {
        ReusableMethods.waitFor(2);
        ReusableMethods.tabpassedtwo();

    }


    @Given("Username field is filled")
    public void userNameField_button() {
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys(ConfigReader.getProperty("username"));
        ReusableMethods.waitFor(3);
    }


    @Given("Password field is filled")
    public void password_field() {
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(3);
    }


    @Given("forward Button Click")
    public void nextButtonClick() {
        loginPage.forward.click();
        ReusableMethods.waitFor(3);
    }

    @Given("Click the Sign In Button")
    public void signButtonClick() {
        loginPage.singinbutton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Click the Email No In Button")
    public void emailNoClick() {
        loginPage.emailPopupNoButton.click();

    }


    @Given("The Home page appears")
    public void homePageAppears() {
        ReusableMethods.waitFor(2);
        homePage.homePageTitle.isDisplayed();
        ReusableMethods.waitFor(2);
    }


}



