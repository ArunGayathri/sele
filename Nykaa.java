package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
				
		WebElement app = driver.findElement(By.xpath("//a[text()='hair']"));
		
		Actions a=new Actions(driver);
		a.contextClick(app).build().perform();
		
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
//		Set<String> all = driver.getWindowHandles();
//		for(String str:all)
//		{
//			String title = driver.switchTo().window(str).getTitle();
//		}
//			
		WebElement hair = driver.findElement(By.xpath("//a[text()='Dryers & Stylers']"));
		
		Actions a1=new Actions(driver);
		a.contextClick(hair).build().perform();
		
		Robot r1=new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> all1 = driver.getWindowHandles();
		for(String str:all1)
		{
			String title = driver.switchTo().window(str).getTitle();
		}

		
		WebElement dry = driver.findElement(By.xpath("//button[@type='button']"));
		
		
		
		Actions a2=new Actions(driver);
		a.click().build().perform();
		
		Set<String> all2 = driver.getWindowHandles();
		for(String str:all2)
		{
			String title = driver.switchTo().window(str).getTitle();
		}
		//JavascriptExecutor js=(JavascriptExecutor)dry;
		//js.executeScript("window.ScrollBy(0,4000)");
		
		

		
//		Robot r2=new Robot();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		
//		
//		 	
		
	  
				
		
		
		
	}
	
	
	
	
	
}
