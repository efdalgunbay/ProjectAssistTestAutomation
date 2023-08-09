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
    RegisterPage registerPage=new RegisterPage();


    @Given("Gmail Button Click")
    public void gmail_button() {
       loginPage.emailButton.click();
       ReusableMethods.waitFor(3);

    }


    @Given("Mail field is filled")
    public void emailfield_button() {

    }


    @Given("Password field is filled")
    public void Password_field () {

    }

    @Given("Next Button Click")
    public void nextButtonClick () {

    }

    @Given("Click the Sign In Button")
    public void signButtonClick () {

    }



    }



