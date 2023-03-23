package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_k {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement acc= driver.findElement(By.xpath("//button[@id='alertButton']"));
		acc.click();
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement acce= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		acce.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		WebElement can = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		can.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		WebElement keys = driver.findElement(By.xpath("//button[@id='promtButton']"));
		keys.click();
		driver.switchTo().alert().sendKeys("Java");
		driver.switchTo().alert().accept();
		
		WebElement res = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]"));
		String text = res.getText();
		System.out.println("Value Passed:"+text);
		
		
		
		
		
		
		
		
	}

}
