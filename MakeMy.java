package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMy {
	
	public static void main(String[] args) throws AWTException {
		
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");
			
			driver.manage().window().maximize();
			
			WebElement train = driver.findElement(By.xpath("//span[text()='Trains']"));
			train.click();
			
//			Actions a=new Actions(driver);
//			a.moveToElement(train).perform();
//			
//			WebElement sea = driver.findElement(By.xpath("//a[text()='Search']"));
//			sea.click();
//			
//			Set<String> all = driver.getWindowHandles();
//			for(String str:all) {
//				driver.switchTo().window(str);
			}
			
		
		
	}


