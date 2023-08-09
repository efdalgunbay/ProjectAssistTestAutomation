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


    @Given("Email Button Click")
    public void email_button() {
       loginPage.emailButton.click();
       ReusableMethods.waitFor(3);

    }



    }



