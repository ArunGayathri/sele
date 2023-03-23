package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movie {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement search= driver.findElement(By.xpath("//input[@id='suggestion-search']"));
		search.sendKeys("Varisu");
		
		WebElement movie= driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
		movie.click();
		
		WebElement mname= driver.findElement(By.xpath("//a[text()='Varisu']"));
		mname.click();
		
		WebElement rat = driver.findElement(By.xpath("//span[text()='6.2'][1]"));
		rat.click();
		
		WebElement rating = driver.findElement(By.xpath("(//span[@class='ipl-rating-star__rating'])[1]"));
		String text = rating.getText();
		 System.out.println("Rating of Movie:"+text);
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File des=new File("C:\\Users\\ADMIN34\\eclipse-workspace\\sele\\ScreenShot\\imdb.png");
		 FileUtils.copyFile(src, des);
		 System.out.println("The Screenshot is captured");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
