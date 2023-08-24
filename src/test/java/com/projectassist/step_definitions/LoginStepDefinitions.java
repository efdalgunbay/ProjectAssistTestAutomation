package com.projectassist.step_definitions;
import com.projectassist.utilities.Driver;
import com.projectassist.pages.LoginPage;
import com.projectassist.pages.RegisterPage;
import com.projectassist.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class LoginStepDefinitions {


    LoginPage loginPage=new LoginPage();


    @Given("Gmail Button Click")
    public void gmail_button() {
       loginPage.emailButton.click();
       ReusableMethods.waitFor(3);

    }


    @Given("Username field is filled")
    public void userNameField_button() {

    }


    @Given("Password field is filled")
    public void password_field () {

    }


    @Given("forward Button Click")
    public void nextButtonClick () {

    }

    @Given("Click the Sign In Button")
    public void signButtonClick () {

    }

    @Given("Click the Email No In Button")
    public void emailNoClick () {

    }

    @Given("The Home page appears")
    public void homePageAppears () {

    }



    }



