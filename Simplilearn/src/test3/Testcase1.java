package test3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;

public class Testcase1 {
	WebDriver driver;
	
	 @BeforeMethod
	 public void LaunchBrowser() {
		 System.setProperty("webdriver.chromedriver", "/home/lavanyamstecnot/Downloads/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/home/lavanyamstecnot/Downloads/geckodriver");
		
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.simplilearn.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	 }
	 
	 @Test
	 public void LoginTest() {
		 
		 Loginpage obj=new Loginpage(driver);
		 obj.Login("ccc@ddd.com", "uu88");
	 }
	 
	 @AfterMethod
	 public void closeBrowser() {
		 driver.quit();
	 }
	 

}
