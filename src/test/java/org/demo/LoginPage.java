package org.demo;

import org.bassclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") private WebElement txtUserName;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

}
