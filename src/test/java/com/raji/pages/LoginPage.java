package com.raji.pages;

import com.raji.config.AppConfiguration;
import com.raji.pages.base.BasePage;
import com.raji.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(css="#Email")
	private WebElement EmailTextbox;

	@FindBy(css="#Password")
	private WebElement PasswordTextbox;

	@FindBy(css=".login-button")
	private WebElement SignInSubmitButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void AtChecker() throws Exception{
		DriverHelper.AssertPageTitleContains("LTTM. Login");
		DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
        DriverHelper.AssertPageUrlContains("/login");
		EmailTextbox.isDisplayed();
		PasswordTextbox.isDisplayed();
		SignInSubmitButton.isDisplayed();
	}


	public void EnterEmail(String Email) {
		EmailTextbox.sendKeys(Email);
	}

	public void EnterPassword(String Password){
		PasswordTextbox.sendKeys(Password);
	}

	public void ClickOnSignInSubmitButton() {
		SignInSubmitButton.click();
	}
}
