package com.sele;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//act.clickAndHold(drag).moveToElement(drop).release().perform();
		
		act.dragAndDrop(drag, drop).perform();     //another way
		
		
		
		
		
		
		
		
		
	}
	
	

}
