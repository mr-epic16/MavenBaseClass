package org.bassclass;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver =new ChromeDriver();
	    }
		
	else if (browser.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver =new FirefoxDriver();
	                                      }
		
	else {
			System.setProperty("webdriver.ie.driver", "./driver/IEserverDriver.exe");
			driver = new InternetExplorerDriver();
                    	}
	                        }
	
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static String getTheTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public static String getTheCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}
	
	public static void fillTheTexBox(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void clickTheButton(WebElement e) {
		e.click();
	}
	
	static Select s;
	public static void selectTheValue(WebElement e,String value) {
		s= new Select(e);
		s.selectByValue(value);

	}
	public static void selectTheVisibleText(WebElement e,String value) {	
		s= new Select(e);
		s.selectByVisibleText(value);
	}
	
	static TakesScreenshot tk;
	public static void getTheScreenShot() throws Exception {
		tk=(TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screen/screenshot"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(temp, perm);

	}
	
}
