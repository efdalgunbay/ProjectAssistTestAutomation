package com.projectassist.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguageMappingPage extends BasePage{

    @FindBy(xpath ="(//span[@class='MuiButton-label'])[2]")
    public WebElement newMappingButton;


    @FindBy(xpath ="//div[@class='MuiAutocomplete-endAdornment']")
    public WebElement typeFilterOpenButtonLanguageMapping;

    @FindBy(xpath ="//div[@class='MuiAutocomplete-popper']")
    public WebElement typeFiltertypes;

    @FindBy(xpath ="//input[@placeholder='Select Type is']")
    public WebElement typeFilterfieldLanguageMapping;

    @FindBy(xpath ="(//*[contains(text(),'Crowdin')])[1]")
    public WebElement languageMappingClientType;

    @FindBy(xpath ="(//*[contains(text(),'Smartling')])[1]")
    public WebElement languageMappingAllType;

    @FindBy(xpath ="(//*[@class='MuiSvgIcon-root MuiSvgIcon-colorPrimary'])[2]")
    public WebElement languageMappingToolLanguage;

    @FindBy(xpath ="(//*[contains(text(),'xx')])[1]")
    public WebElement languageMappingToolLanguageType;

    @FindBy(xpath ="(//*[@class='MuiSvgIcon-root MuiSvgIcon-colorPrimary'])[3]")
    public WebElement languageMappingXTRFClientLanguageType;

    @FindBy(xpath ="(//*[contains(text(),'Successful Industries, Inc (Demo)')])[1]")
    public WebElement languageMappingXTRFClientLanguageTypeSorting;

    @FindBy(xpath ="(//*[contains(text(),'Across')])[1]")
    public WebElement languageMappingToolLanguageTypeSorting;

    @FindBy(xpath ="(//*[@class='MuiSvgIcon-root MuiSvgIcon-colorPrimary'])[1]")
    public WebElement languageMappingToolSortingLanguageType;

    @FindBy(xpath ="//input[@placeholder='Select XTRF Client']")
    public WebElement languageMappingXTRFClientFilterField;

    @FindBy(xpath ="(//*[contains(text(),'Ceridian')])[1]")
    public WebElement XTRFCeridianFilterType;

    @FindBy(xpath ="(//span[@class='MuiTouchRipple-root'])[24]")
    public WebElement XTRFFilterTypeClearButton;

    @FindBy(xpath ="(//*[contains(text(),'Peakon')])[1]")
    public WebElement XTRFFilterTypeClearVerfy;

    @FindBy(xpath ="//input[@placeholder='Select XTRF Language']")
    public WebElement languageMappingXTRFLanguageFilterField;

    @FindBy(xpath ="(//span[@class='MuiTouchRipple-root'])[26]")
    public WebElement XTRFLanguageFilterTypeClearButton;

    @FindBy(xpath ="(//*[contains(text(),'Bulgarian')])[1]")
    public WebElement XTRFLanguageFilterTypeVerfy;

    @FindBy(xpath ="(//*[contains(text(),'Amharic')])[1]")
    public WebElement XTRFLanguageFilterTypeClearVerfy;

    @FindBy(xpath ="//input[@placeholder='Select Tool']")
    public WebElement languageMappingToolFilterField;

    @FindBy(xpath ="(//*[contains(text(),'Across')])[1]")
    public WebElement XTRFToolFilterTypeVerfy;


}

