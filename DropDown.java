package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN34\\eclipse-workspace\\Sel\\drive\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9299850%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid="
							+ "Cj0KCQiAx6ugBhCcARIsAGNmMbia5u5ak28uWOpyNxvEOF9F2GxnPeri4lrTv9H8XGsVuab0A0oK0xkaAhVpEALw_wcB");
					driver.manage().window().maximize();
					
					WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		            day.click();
		            Thread.sleep(3000);
		            Select s=new Select(day);
		            s.selectByIndex(1);
		            
		            WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		            month.click();
		            Thread.sleep(3000);
		            Select s1=new Select(month);
		            s1.selectByValue("3");
		            
		            WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		            year.click();
		            Thread.sleep(3000);
		            Select s2=new Select(year);
		            s2.selectByVisibleText("2022");
		
		
		
		
	}
	
	
	
	

}
