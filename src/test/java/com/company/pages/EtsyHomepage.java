package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomepage {

    public EtsyHomepage() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }


    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchEditbox;

}
