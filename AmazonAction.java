package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {
	
	public static void main(String[] args) throws AWTException {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in/l/68058423031/?pf_rd_r=HPRS7Q2EY1Y6WAV3P5NE&pf_rd_p=cb5d1249-e7f7-4106-98df-6d2e0a1c4d1f&pd_rd_r="
					+ "       a4ae7f11-d706-49d7-aba8-c45fceef5ab2&pd_rd_w=GLOUM&pd_rd_wg=3Uhz6&ref_=pd_gw_unk");
			driver.manage().window().maximize();
			
			Actions act=new Actions(driver);
			WebElement cl = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
			
			act.contextClick(cl).build().perform();
		
		
			//act.doubleClick(cl).release().build().perform();
			
		   //act.click(cl).release().build().perform();
		
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
