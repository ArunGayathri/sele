package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	
	 public static void main(String[] args) throws AWTException {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/droppable/");
			driver.manage().window().maximize();
			
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			
			
		 
		 
		 
		 
	}

}
