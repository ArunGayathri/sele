package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\ADMIN34\\eclipse-workspace\\Sel\\drive\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//WebElement user= driver.findElement(By.id("email"));
		//user.sendKeys("abc@gmail.com");
		WebElement use=driver.findElement(By.xpath("//input[@name='email']"));
		use.sendKeys("abc@gmail.com");
		
		WebElement pwd=driver.findElement(By.name("pass"));
		pwd.sendKeys("dhffuh");
		
		WebElement log=driver.findElement(By.name("login"));
		log.click();
		
	
		
		
	
	
	
	
	
	
}
}
