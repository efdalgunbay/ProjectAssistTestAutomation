package com.projectassist.step_definitions;

import com.projectassist.pages.*;
import com.projectassist.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class HomeStepDefinitions {

    HomePage homePage=new HomePage();
    ProjectTemplatesPage projectTemplatesPage=new ProjectTemplatesPage();
    LanguageMappingPage languageMappingPage=new LanguageMappingPage();
    ExtraCustomPage extraCustomPage=new ExtraCustomPage();
    XTRFProjectsPage xtrfProjectsPage=new XTRFProjectsPage();
    XTRFProjectsDeliveryCalendarPage xtrfProjectsDeliveryCalendarPage=new XTRFProjectsDeliveryCalendarPage();
    memoQPage memoQpage=new memoQPage();
    ClientPreferredLanguagesPage clientPreferredLanguagesPage=new ClientPreferredLanguagesPage();
    IntegrationsPage integrationsPage=new IntegrationsPage();
    UsersPage usersPage=new UsersPage();
    StatsPage statsPage=new StatsPage();
    LogsPage logsPage=new LogsPage();

    @Given("Click on Project Templates Nav Bar")
    public void projectTemplatesNavBar () {
        homePage.projectTemplatesNavButton.click();
    }

    @Given("Project Templates Page appears to be opened")
    public void projectTemplatesPageOpened () {
        ReusableMethods.waitFor(2);
        projectTemplatesPage.tamplateNameField.isDisplayed();
        ReusableMethods.waitFor(2);
    }


    @Given("Language Mapping Hamburger Menu Button Click")
    public void hamburgerMenuButtonClick () {
        homePage.languageMappingNavButton.click();
        ReusableMethods.waitFor(2);


    }

    @Given("The Language Mapping page appears")
    public void languageMappingPageAppears () {
        ReusableMethods.waitFor(2);
        languageMappingPage.newMappingButton.isDisplayed();
        ReusableMethods.waitFor(2);
    }


    @Given("XTRF Projects Hamburger Menu Button Click")
    public void XTRFProjectsMenuButtonClick () {
        ReusableMethods.waitFor(2);
        homePage.XTRFProjectsNavButton.click();
    }

    @Given("The XTRF Projects page appears")
    public void XTRFProjectsPageAppears () {
        xtrfProjectsPage.projectNameField.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("XTRF Projects Delivery Calendar Hamburger Menu Button Click")
    public void XTRFProjectsDeliveryMenuButtonClick () {
        homePage.XTRFProjectsDeliveryCalendarNavButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("The XTRF Projects Delivery page appears")
    public void XTRFProjectsDeliveryPageAppears () {
        xtrfProjectsDeliveryCalendarPage.deleveryPeriodfield.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("memoQ Hamburger Menu Button Click")
    public void memoQMenuButtonClick () {
        homePage.memoQNavButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("The memoQ page appears")
    public void memoQPageAppears () {
        memoQpage.memeqProjectField.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("Client Preferred Languages Hamburger Menu Button Click")
    public void ClientPreferredLanguagesMenuButtonClick () {
        homePage.clientPreferredLanguagesNavButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("The Client Preferred Languages page appears")
    public void ClientPreferredPageAppears () {
        clientPreferredLanguagesPage.Preferredlanguagebundlebutton.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("Logs Hamburger Menu Button Click")
    public void logsMenuButtonClick () {
        homePage.logsNavButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("The Logs page appears")
    public void logsPageAppears () {
        logsPage.logsPeriodField.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Extra Custom Fields Configuration Menu Button Click")
    public void extraCustomFieldsMenuButton () {
        ReusableMethods.waitFor(2);
        homePage.extraCustomFieldsConfigurationNavButton.click();

    }

    @Given("The Extra Custom Fields Configuration page appears")
    public void extraCustomFieldsPageControl () {
        ReusableMethods.waitFor(2);
        extraCustomPage.extraCustomConfıgutrationButton.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Integrations Hamburger Menu Button Click")
    public void integrationsHamburgerMenu () {
        homePage.integrationsNavButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("The Integrations page appears")
    public void integrationsPageControl () {
        integrationsPage.newIntegrationButton.isDisplayed();
        ReusableMethods.waitFor(2);
    }


    @Given("Users Hamburger Menu Button Click")
    public void usersMenuButton () {
        homePage.usersNavButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("The Users page appears")
    public void usersPageControl () {
        usersPage.newServicesAccountButton.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("Stats Hamburger Menu Button Click")
    public void statsMenuButton () {
        homePage.statsNavButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("The Stats page appears")
    public void statsPageControl () {
        statsPage.periodField.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @Given("Vendor Mapping Hamburger Menu Button Click")
    public void vendorMappingButton () {
        ReusableMethods.waitFor(2);
        homePage.vendorMappingNavButton.click();
    }

    @Given("The Vendor Mapping page appears")
    public void vendorMappingPageControl () {
        ReusableMethods.waitFor(2);
        languageMappingPage.newMappingButton.isDisplayed();
        ReusableMethods.waitFor(2);
    }




}
