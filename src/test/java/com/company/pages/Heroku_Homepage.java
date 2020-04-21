package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Heroku_Homepage {

    public Heroku_Homepage() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }

    @FindBy(linkText = "Add/Remove Elements")
    public WebElement add_Remove_Elements;
    @FindBy(xpath = "//a[contains(text(),'Basic Auth')]")
    public WebElement basicAuth;
    @FindBy(linkText = "Checkboxes")
    public WebElement checkboxes;
    @FindBy(linkText = "Context Menu")
    public WebElement contextMenuModule;
    @FindBy(linkText = "Disappearing Elements")
    public WebElement disappearingElementsModule;
    @FindBy(linkText = "Drag and Drop")
    public WebElement dragAndDropModule;
    @FindBy(linkText = "Dropdown")
    public WebElement dropdownsModule;
    @FindBy(linkText = "Dynamic Controls")
    public WebElement dynamicControlsModule;
    @FindBy(linkText = "Entry Ad")
    public WebElement entryAd;
    @FindBy(linkText = "File Download")
    public WebElement downloadFile;
}
