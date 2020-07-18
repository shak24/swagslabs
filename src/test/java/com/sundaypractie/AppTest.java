package com.sundaypractie;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    
{
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "/Users/shakirchowdhury/Desktop/selenium_workspace/notWorkingProject/driver/ChromeDriverNew");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(3000);
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(3000);
	
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(3000);
	
	
	
	driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("shopping_cart_container")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
	Thread.sleep(3000);
	
	//a[text()='CHECKOUT']
	
	driver.quit();
	

	
	}
}
