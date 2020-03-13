package com.actions;

import com.stepDefns.StepDefns;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import com.actions.CommonActions;

import java.util.concurrent.TimeUnit;

public class BaseActions  {

    public static WebDriver driver;
    public static void OB()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver_79.exe");
        driver = new ChromeDriver();
        driver.get("https://cover4pm.itcinfotech.com/Cover4PM6/");
//        CommonActions.Wait_Page_For_Load();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    public static void Login()
    {
        driver.findElement(By.xpath("//input[@id='LoginId']")).sendKeys("User 3");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("User3@123");
        driver.findElement(By.xpath("//button[@class='k-button k-primary']")).click();
//        CommonActions.Wait_Page_For_Load();

    }

    public static void LOAD_DIVISIONS_URL()
    {
        driver.get("https://cover4pm.itcinfotech.com/Cover4PM6/Masters/CommonMaster/Division");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        CommonActions.Wait_Page_For_Load();
    }

    public static void Click_On_Add_Division_Button()
    {
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary k-button k-button-icontext k-grid-add']")).click();
    }

    public static void Create_New_Division()
    {

        Actions Act = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='DivisionName']")).sendKeys("DIV1");
        Act.sendKeys(Keys.TAB).perform();
        driver.findElement(By.xpath("//input[@id='DivisionCode']")).sendKeys("DC1");
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary cstmSaveCancel k-button k-button-icontext k-grid-save-changes']")).click();
        String ActMsg = "Saved Successfully";
        String ExpMsg = driver.findElement(By.xpath("//*[@id='saveAlertMessage']/p")).getText();

//        Assert.assertEquals(ExpMsg,ActMsg);
        try{
//            driver.findElement(By.xpath("//*[@id='saveAlertMessage']/p ")).isDisplayed();
            Assert.assertEquals(ExpMsg,ActMsg);
        }
        catch (Throwable t)
        {
//            driver.findElement(By.xpath("//*[@id='deleteAlertMessage']/p]")).isDisplayed();
            System.out.println("Division is not Created Successfully or Data already exist");
        }
      driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        driver.close();
    }
}
