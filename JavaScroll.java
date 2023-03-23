package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScroll {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		
		
		//Scroll down pariticular view point using xpath
		WebElement e = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		js.executeScript("arguments[0].scrollIntoView()", e);
		
		js.executeScript("window.scrollby(0,-3000)");

		
		
	}

}
