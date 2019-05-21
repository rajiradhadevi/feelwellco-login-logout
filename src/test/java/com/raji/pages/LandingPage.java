package com.raji.pages;

import com.raji.config.AppConfiguration;
import com.raji.pages.base.BasePage;
import com.raji.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy (css = "a.ico-logout")
    WebElement SignOutButton;

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public void AtChecker() throws Exception{
		DriverHelper.AssertPageTitleContains("LTTM");
        DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
	}



    public void ClickSignOut(){
        SignOutButton.click();
    }

}
