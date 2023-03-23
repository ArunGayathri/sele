package com.sele;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ny {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
		WebElement hairtab = driver.findElement(By.xpath("//a[text()='hair']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(hairtab).perform();
		
		WebElement sampootab = driver.findElement(By.xpath("(//a[text()='Shampoo'])[1]"));
		sampootab.click();
		
		Set<String> all = driver.getWindowHandles();
		for(String str:all) {
			driver.switchTo().window(str);
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		WebElement sha = driver.findElement(By.xpath("//div[@class='productWrapper css-xin9gt']"));
		sha.click();
		Thread.sleep(3000);
		
		Set<String> allnext = driver.getWindowHandles();
		for(String str:allnext)
		{
			driver.switchTo().window(str);
		}
		
		WebElement addtab = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		addtab.click();
		Thread.sleep(3000);
		
		WebElement add = driver.findElement(By.xpath("//button[@class='css-g4vs13']"));
		add.click();
		Thread.sleep(3000);
		
		
		WebElement in = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(in);
		WebElement pro = driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]"));
		pro.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
