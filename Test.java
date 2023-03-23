package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\ADMIN34\\eclipse-workspace\\Sel\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		driver.close();
		
		
		
		
		
		
		
		
	}


}
