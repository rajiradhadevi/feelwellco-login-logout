package com.raji.pages;

import com.raji.config.AppConfiguration;
import com.raji.pages.base.BasePage;
import com.raji.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {



    @FindBy (css="a.ico-login")
    private WebElement signInButton;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void AtChecker() throws Exception{
		DriverHelper.AssertPageTitleContains("LTTM");
		DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
	}

	public void ClickOnSignIn() {
        signInButton.click();
    }

}
