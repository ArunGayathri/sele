package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nyakka {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.nykaa.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	WebElement app = driver.findElement(By.xpath("//a[text()='hair']"));
	
	app.click();
	
String actualwindow = driver.getWindowHandle();

Set<String> allWindows = driver.getWindowHandles();

for(String window:allWindows) {
	if(actualwindow.equals(allWindows)){
		continue;
	}
	driver.switchTo().window(window);
	
	
	WebElement hair = driver.findElement(By.xpath("//a[text()='hair']"));

	Actions ac=new Actions(driver);
	ac.moveToElement(hair);

	Thread.sleep(3000);
	WebElement strightner = driver.findElement(By.xpath("//a[text()='Straighteners']"));
	strightner.click();
}





}
	
	


}

