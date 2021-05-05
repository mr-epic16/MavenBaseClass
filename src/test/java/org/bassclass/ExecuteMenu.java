package org.bassclass;

import org.demo.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecuteMenu extends BaseClass{
	public static void main(String[] args) throws Exception {
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
		String title = getTheTitle();
		System.out.println(title.contains("face"));
		
		WebElement user1 = driver.findElement(By.id("email"));
		fillTheTexBox(user1, "Muruga");
		
		
		WebElement login = driver.findElement(By.name("login"));
		clickTheButton(login);
	
    	WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    clickTheButton(create);
	
	    Thread.sleep(5000);
	    WebElement day = driver.findElement(By.id("day"));
	    selectTheValue(day, "5");
	
	    WebElement month = driver.findElement(By.id("month"));
	    selectTheVisibleText(month, "Dec");
	
	    WebElement year = driver.findElement(By.id("year"));
	    selectTheValue(year, "1996");
	    getTheScreenShot();
	    
		LoginPage l = new LoginPage();
		WebElement user = driver.findElement(By.id("email"));
		fillTheTexBox(l.getTxtUserName(), "Muruga");
		
		driver.navigate().refresh();
		
		fillTheTexBox(l.getTxtUserName(), "Sakthi");
		
		
	   }
          }
