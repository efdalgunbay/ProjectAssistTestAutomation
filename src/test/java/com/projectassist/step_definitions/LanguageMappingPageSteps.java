package com.projectassist.step_definitions;

import com.projectassist.pages.LanguageMappingPage;
import com.projectassist.utilities.ConfigReader;
import com.projectassist.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

public class LanguageMappingPageSteps {
    LanguageMappingPage languageMappingPage=new LanguageMappingPage();

    @Given("Filter sentence All is entered in the filter field")
    public void filterFieldLanguageMapping() {
        languageMappingPage.typeFilterfieldLanguageMapping.clear();
        ReusableMethods.waitFor(2);
        languageMappingPage.typeFilterfieldLanguageMapping.sendKeys(ConfigReader.getProperty("LanguageMapping_type_filter_All"));

    }

    @Given("It is seen that a filter Client Exceptions has been made")
    public void filterHasBeenMadeLanguageMapping() {
        languageMappingPage.languageMappingClientType.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Filter Client Exceptions Clicked")
    public void filterClickedLanguageMapping() {
        languageMappingPage.typeFiltertypes.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Filter All Clicked")
    public void filterClickedAllLanguageMapping() {
        languageMappingPage.typeFiltertypes.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is seen that a filter All has been made")
    public void filterHasBeenMadeAllLanguageMapping() {
        languageMappingPage.languageMappingAllType.isDisplayed();
        ReusableMethods.waitFor(2);
    }


    @Given("Filter sentence Client Exceptions is entered in the filter field")
    public void filterFieldClientExceptionsLanguageMapping() {
        languageMappingPage.typeFilterfieldLanguageMapping.clear();
        ReusableMethods.waitFor(2);
        languageMappingPage.typeFilterfieldLanguageMapping.sendKeys(ConfigReader.getProperty("LanguageMapping_type_filter_Client_Exceptions"));

    }

    @Given("Click on the Tool Language Button")
    public void theToolButtonLanguageMapping() {
        languageMappingPage.languageMappingToolLanguage.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is seen that the sorting is done according to the tool language")
    public void doneAccordingtoTheTool() {
            languageMappingPage.languageMappingToolLanguageType.isDisplayed();
            ReusableMethods.waitFor(1);
    }

    @Given("Click on the XTRF Client Button")
    public void doneAccordingtoTheXTRFClient() {
        languageMappingPage.languageMappingXTRFClientLanguageType.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is seen that the sorting is done according to the XTRF Client language")
    public void doneXTRFClient() {
        languageMappingPage.languageMappingXTRFClientLanguageTypeSorting.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Click on the Tool Button")
    public void doneToolButton() {
        languageMappingPage.languageMappingToolSortingLanguageType.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is seen that the sorting is done according to the Tool language")
    public void accordingtheToolLanguage() {
        languageMappingPage.languageMappingToolLanguageTypeSorting.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Keyword is entered in the XTRF Client filter field")
    public void XTRFClientFilterField() {
        languageMappingPage.languageMappingXTRFClientFilterField.sendKeys(ConfigReader.getProperty("LanguageMapping_XTRF_Client"));
        ReusableMethods.waitFor(8);
        languageMappingPage.typeFiltertypes.click();
        ReusableMethods.waitFor(1);
    }

    @Given("It is seen that XTRF Client is filtered according to the entered keyword")
    public void XTRFClientFilteredAccording() {
        languageMappingPage.XTRFCeridianFilterType.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @Given("Click on the Cross Button that appears next to the XTRF Client Filter Field")
    public void XTRFClientCrossButton() {
        languageMappingPage.XTRFFilterTypeClearButton.click();
        ReusableMethods.waitFor(5);
    }

    @Given("XTRF Client Filter Area is Seen as Cleaned")
    public void XTRFClientFilter() {
        languageMappingPage.XTRFFilterTypeClearVerfy.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Keyword is entered in the XTRF Language filter field")
    public void XTRFLanguageFilterField() {
        languageMappingPage.languageMappingXTRFLanguageFilterField.sendKeys(ConfigReader.getProperty("LanguageMapping_XTRF_Language"));
        ReusableMethods.waitFor(8);
        languageMappingPage.typeFiltertypes.click();
        ReusableMethods.waitFor(1);
    }

    @Given("It is seen that XTRF Language is filtered according to the entered keyword")
    public void XTRFLanguageFilteredAccording() {
        languageMappingPage.XTRFLanguageFilterTypeVerfy.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @Given("Click on the Cross Button that appears next to the XTRF Language Filter Field")
    public void XTRFLanguageCrossButton() {
        languageMappingPage.XTRFLanguageFilterTypeClearButton.click();
        ReusableMethods.waitFor(5);
    }

    @Given("XTRF Language Filter Area is Seen as Cleaned")
    public void XTRFLanguageFilter() {
        languageMappingPage.XTRFLanguageFilterTypeClearVerfy.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Keyword is entered in the Tool filter field")
    public void XTRFToolFilterField() {
        languageMappingPage.languageMappingToolFilterField.sendKeys(ConfigReader.getProperty("LanguageMapping_Tool"));
        ReusableMethods.waitFor(8);
        languageMappingPage.typeFiltertypes.click();
        ReusableMethods.waitFor(1);
    }

    @Given("It is seen that Tool is filtered according to the entered keyword")
    public void XTRFToolFilter() {
        languageMappingPage.XTRFToolFilterTypeVerfy.isDisplayed();
        ReusableMethods.waitFor(3);
    }


    @Given("Click on the Cross Button that appears next to the Tool Filter Field")
    public void toolFilterField() {

    }

    @Given("Tool Filter Area is Seen as Cleaned")
    public void toolFilterArea() {

    }

    @Given("Keyword is entered in the Tool Language filter field")
    public void keywordEnteredToolLanguage() {

    }

    @Given("It is seen that Tool Language is filtered according to the entered keyword")
    public void toolFilterAreaeEnteredKeyword() {

    }
    @Given("Click on the Cross Button that appears next to the Tool Language Filter Field")
    public void toolLanguageFilterField() {

    }

    @Given("Tool Language Filter Area is Seen as Cleaned")
    public void toolLanguageFilterArea() {

    }



}
