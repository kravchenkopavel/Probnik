package com.probnik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 13.05.2015.
 */
public class GoogleStart {

    WebDriver driver;

    // fields
    @FindBy /*(css = ".gb_ga.gb_2")*/(xpath="//*[@id='gbwa']/div[1]/a")
    private WebElement options;

    @FindBy (xpath = "//*[@id='gb49']/span[1]")
    private WebElement GoogleDiskButton;

    //driver
    public GoogleStart(WebDriver driver){
        PageFactory.initElements(driver, this); this.driver = driver;}

    //press options
    public void pressOptions(){
        options.click();
    }

    //press GoogleDiskButton
    public void pressGoogleDiskButton(){
        GoogleDiskButton.click();
    }

    //this method use in the test
    public void firststep(){
        this.pressOptions();
    }
    public void secondstep(){
        //this.pressOptions();
        this.pressGoogleDiskButton();
    }

    /*
         //set firstname in textbox
    public void setFirstName(String strfirstname){driver.findElement(firstname).sendKeys(strfirstname);}

    //select birthmonth in listbox
    public void setBirthmonth(String monthnumber){
        driver.findElement(birthmonth).click();
        driver.findElement(By.id(":"+monthnumber)).click();
    }

    //set capthaskip
    public void setCapthaskip(){driver.findElement(capthaskip).click();}

    //this method use in the test TestRegistrationUser
    public void registrationUser(String strfirstname, String strlastname, String strgmailaddress, String strpasswd,
                                 String strpasswdagain, String strbirthday, String monthnumber, String strbirthyear,
                                 Boolean man){
        this.setFirstName(strfirstname);        //fill firstname
        this.setLastName(strlastname);          //fill lastname
        this.setGmailaddress(strgmailaddress);  //fill gmailaddress
        this.setPasswd(strpasswd);              //fill passwd
        this.setPasswdagain(strpasswdagain);    //fill passwdagain
        this.setBirthday(strbirthday);          //fill birthday
        this.setBirthmonth(monthnumber);        //fill monthnumber
        this.setBirthyear(strbirthyear);        //fill strbirthyear
        this.setGender(man);                    //fill gender
        this.setCapthaskip();                   //set capthaskip
        this.setTermsofservise();               //set allow termsofservise
        this.setSubmitbutton();                 //click submitbutton
    }*/
}
