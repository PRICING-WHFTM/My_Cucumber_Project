package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryHomepage {

    public MercuryHomepage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

    @FindBy(linkText = "SIGN-ON")
    public WebElement signOn;
    @FindBy(linkText = "REGISTER")
    public WebElement register;




}
