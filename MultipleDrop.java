package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN34\\eclipse-workspace\\Sel\\drive\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
					driver.manage().window().maximize();
					
					WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
					food.click();
					Thread.sleep(3000);
					
					Select s=new Select(food);
					s.selectByIndex(0);
					
					Thread.sleep(3000);
					
					s.selectByValue("pizza");
					s.selectByVisibleText("Burger");
					
					//s.deselectByValue("pizza");
					//s.deselectByVisibleText("Burger");
					
					List<WebElement> sel = s.getAllSelectedOptions();
					for (WebElement all : sel) {
						 System.out.println(all.getText());
						
					}
					
		
		
		
		
	}

}
