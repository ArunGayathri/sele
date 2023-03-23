package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN34\\eclipse-workspace\\Sel\\drive\\chromedriver.exe");
						
						WebDriver driver=new ChromeDriver();
						
						driver.get("https://demo.automationtesting.in/Frames.html");
						driver.manage().window().maximize();
						
						//single Frame
						
						WebElement single = driver.findElement(By.xpath("//a[@class='analystic']"));
						
						//driver.switchTo().frame(0);//index
						driver.switchTo().frame("singleframe");//id value
						
						
						WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
						text.sendKeys("java");
		 
		 
		 
		 
		 
		 
	}
	
	
	

}
