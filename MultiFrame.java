package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrame {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN34\\eclipse-workspace\\Sel\\drive\\chromedriver.exe");
						
						WebDriver driver=new ChromeDriver();
						
						driver.get("https://demo.automationtesting.in/Frames.html");
						driver.manage().window().maximize();
						
						WebElement nested = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
						nested.click();
						
						driver.switchTo().frame(1);
						
						 //webelement ref using
				    	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
                        driver.switchTo().frame(innerframe);
                        
                        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
                        input.sendKeys("Selenium");
                        
                       // driver.switchTo().frame(0);
                        //driver.switchTo().frame("")
                        
	}

}
