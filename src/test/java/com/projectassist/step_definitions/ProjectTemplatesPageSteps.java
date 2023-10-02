package com.projectassist.step_definitions;

import com.projectassist.pages.ProjectTemplatesPage;
import com.projectassist.utilities.ConfigReader;
import com.projectassist.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.FindBy;

public class ProjectTemplatesPageSteps {
    ProjectTemplatesPage projectTemplatesPage=new ProjectTemplatesPage();

    @Given("An existing name is entered in the Create By section")
    public void createBySection(){
        projectTemplatesPage.createdByFilterField.sendKeys(ConfigReader.getProperty("create_by_filter"));
        ReusableMethods.waitFor(10);

    }

    @Given("The resulting name is filtered")
    public void nameisFiltered(){
        projectTemplatesPage.createdByFilterName.click();
        ReusableMethods.waitFor(5);
    }

    @Given("It is seen that the filter is made by name")
    public void madeByName(){
        projectTemplatesPage.createdByFilterVerfy.isDisplayed();
        ReusableMethods.waitFor(5);
    }

    @Given("Click on the Visibility Area")
    public void theVisibilityArea(){
        projectTemplatesPage.visibilityFilterField.sendKeys(ConfigReader.getProperty("visibility_filter"));
        ReusableMethods.waitFor(2);
    }

    @Given("Private Selection is made")
    public void selectionisMade(){
    projectTemplatesPage.visibilityPrivateFilter.click();
    ReusableMethods.waitFor(4);
    }

    @Given("It is seen that filtering is done by Private")
    public void  doneByPrivate(){
    projectTemplatesPage.visibilityPrivateFilterVerfy.isDisplayed();
    ReusableMethods.waitFor(2);
    }

    @Given("Click on the Description Field")
    public void  theDescriptionField(){
        projectTemplatesPage.descriptionSortingField.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is Seen that Sorting is Made According to Descriptions")
    public void  accordingToDescriptions(){
        projectTemplatesPage.descriptionSortingVerfy.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Click on the Name Field")
    public void  theNameField(){
    projectTemplatesPage.nameSortingField.click();
    ReusableMethods.waitFor(2);
    }

    @Given("It is Seen that Sorting is Made According to Name")
    public void  madeAccordingToName(){
        projectTemplatesPage.nameSortingVerfy.isDisplayed();
        ReusableMethods.waitFor(2);
    }


    @Given("Click on the Update Field")
    public void  theUpdateField(){
        projectTemplatesPage.updateSortingField.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is Seen that Sorting is Made According to Update")
    public void  madeAccordingToUpdate(){
        projectTemplatesPage.updateSortingVerfy.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Given("Click on the Visibility Field")
    public void  theVisibilityField(){
        projectTemplatesPage.visibilitySortingField.click();
        ReusableMethods.waitFor(2);
    }

    @Given("It is Seen that Sorting is Made According to Visibility")
    public void  madeAccordingToVisibility(){
        projectTemplatesPage.visibilitySortingField.isEnabled();
    }

    @Given("Keyword is entered in the Template name field on the Project Page")
    public void  nameFieldontheProjectPage(){
        projectTemplatesPage.tamplateNameField.sendKeys(ConfigReader.getProperty("tamplate_name"));
        ReusableMethods.waitFor(2);
    }


    @Given("You can see that the Project Page is sorted by keyword")
    public void  projectPageSortedbyKeyword(){
        projectTemplatesPage.tamplateNameSearchVerfy.isDisplayed();
        ReusableMethods.waitFor(1);
    }

}
