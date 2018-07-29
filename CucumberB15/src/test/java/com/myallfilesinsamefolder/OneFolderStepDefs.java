package com.myallfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class OneFolderStepDefs {
	
	WebDriver driver;
	
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page(){
		System.setProperty("webdriver.chrome.driver","C:\\Radical\\2nd selenium setup\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Given("^enter username \"([^\"]*)\"$")
	public void enter_username(String userName){
		driver.findElement(By.id("email")).sendKeys(userName);
	}
	
	@Given("^enter psw \"([^\"]*)\"$")
	public void enter_psw(String psw){
		driver.findElement(By.id("pass")).sendKeys(psw);
	}
	

}
