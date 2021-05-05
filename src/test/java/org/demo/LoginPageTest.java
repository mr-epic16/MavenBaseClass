package org.demo;

import java.util.List;

import javax.swing.text.Element;

import org.bassclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest extends BaseClass{
	public LoginPageTest() {
		PageFactory.initElements(driver, this);
	}
// @FindAll	
	@FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")}) private List<WebElement> UserName;
	
	public List<WebElement> getUserName() {
		return UserName;
	}
	
//  @FindBys 	
	@FindBys({@FindBy(id="pass"),@FindBy(xpath="//input[@name='pas']")}) private List<WebElement> PassWord;
    
	public List<WebElement> getPassWord() {
		return PassWord;
	}

//  @findBy    
//	@FindBy(id="email") private WebElement TxtUserName;
//	@FindBy(xpath="//input[@name='pass']") private WebElement PassWord;
   
//	public WebElement getTxtUserName() {
//		return TxtUserName;
//	}

//	public WebElement getPassWord() {
//		return PassWord;
//	}

	

	

}
