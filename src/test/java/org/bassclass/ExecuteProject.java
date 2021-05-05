package org.bassclass;

import javax.security.auth.callback.LanguageCallback;

import org.demo.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecuteProject extends BaseClass {
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
		LoginPageTest l = new LoginPageTest();
		
		fillTheTexBox(l.getUserName().get(0), "Muruga");
		
		driver.navigate().refresh();
		 fillTheTexBox(l.getUserName().get(0), "Sakthi");
		
		fillTheTexBox(l.getPassWord().get(0), "123654");
		
		
	}

}
