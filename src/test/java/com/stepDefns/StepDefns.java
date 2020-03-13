package com.stepDefns;

import com.actions.BaseActions;
//import com.actions.CommonActions;
import io.cucumber.java.en.*;
import org.apache.commons.lang.ObjectUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import javax.print.attribute.standard.NumberUp;
import java.util.concurrent.TimeUnit;


public class StepDefns {

    WebDriver driver;
    @Given("Navigate to the C44PM URL")
    public void navigate_to_the_C44PM_URL() {
        BaseActions.OB();

    }

    @And("Enter Username , Password and Click on Login")
    public void enter_Username_Password_and_Click_on_Login()  {

        BaseActions.Login();
    }

    @And("Navigate to Masters and Click on Divisions")
    public void navigate_to_Masters_and_Click_on_Divisions()  {

        BaseActions.LOAD_DIVISIONS_URL();

    }

    @Then("Add Division Button")
    public void Add_Division_Button() {
        BaseActions.Click_On_Add_Division_Button();
    }

    @And("Enter all required fields and click on Save Changes")
    public void enter_all_required_fields_and_click_on_Save_Changes() {

        BaseActions.Create_New_Division();

    }
}
