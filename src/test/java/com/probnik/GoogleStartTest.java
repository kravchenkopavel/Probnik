package com.probnik;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by admin on 13.05.2015.
 */
public class GoogleStartTest {

    WebDriver driver;

    GoogleStart obj;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/?gfe_rd=cr&ei=Rg5TVZGeGYSu8wfxs4DYBw&gws_rd=ssl");
    }

    @Test
    public void clickOptionsTest() {
        obj = new GoogleStart(driver);
        obj.firststep();
        obj.secondstep();
    }
    /*

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/SignUp");
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }

    @Test
    public void TestFullRightRegistration(){
        objRegistration = new PageRegistrationUser(driver);
        objRegistration.registrationUser("Pavel", "Nevajno", "rrrooopppopop", "hj,jnsikt,fns", "hj,jnsikt,fns",
                "23", "7", "1990", true);
        Assert.assertTrue(objRegistration.getResult().contains("Подтвердите аккаунт"));
    }*/



}
