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

public class Nykaa1 {
	
	 public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.nykaa.com/");
			
			driver.manage().window().maximize();
			
			Set<String> all = driver.getWindowHandles();
			for(String str:all)
			{
				String title = driver.switchTo().window(str).getCurrentUrl();
	       	}

			//1st hair
			WebElement app = driver.findElement(By.xpath("//a[text()='hair']"));
			
			Actions a=new Actions(driver);
		
			a.contextClick(app).build().perform();
			
			Robot r=new Robot();

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
						
			Set<String> all1 = driver.getWindowHandles();
			for(String str1:all1)
			{
				String title = driver.switchTo().window(str1).getCurrentUrl();
	       	}

			//2nd str
			WebElement stri = driver.findElement(By.xpath("//a[text()='Straighteners']"));
			Actions a1=new Actions(driver);
			
			a1.contextClick(stri).build().perform();
			
			Robot r1=new Robot();

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			Set<String> all2 = driver.getWindowHandles();
			for(String str2:all2)
			{
				String title = driver.switchTo().window(str2).getCurrentUrl();
	       	}
			
			
			
			
			//3rd str order
			
			WebElement bc = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
            
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.ScrollBy(0,4000)");
			
			bc.click();
			
//			Set<String> all3 = driver.getWindowHandles();
//			for(String str3:all3)
//			{
//				String title = driver.switchTo().window(str3).getCurrentUrl();
//	       	}
			
			
		 
			
		 
		 
	}

}
