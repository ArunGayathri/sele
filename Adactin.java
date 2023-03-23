package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN34\\eclipse-workspace\\Sel\\drive\\chromedriver.exe");
						
						WebDriver driver=new ChromeDriver();
						
						driver.get("https://adactinhotelapp.com/");
						driver.manage().window().maximize();
						
						WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
						username.sendKeys("GayathriArun");
						
						WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
						password.sendKeys("gayu@22");
						
						WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
						login.click();
						
						WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
						location.click();
						Select s=new Select(location);
						s.selectByValue("Sydney");
						
						WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
						hotel.click();
						Select s1=new Select(hotel);
						s1.selectByValue("Hotel Sunshine");
						
						WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
						room.click();
						Select s2=new Select(room);
						s2.selectByValue("Double");
						
						WebElement rnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
						rnos.click();
						Select s3=new Select(rnos);
						s3.selectByValue("1");
						
						WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
						indate.sendKeys("12/04/2023");
						
						WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
						outdate.sendKeys("14/04/2023");
						
						WebElement aroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
						aroom.click();
						Select s4=new Select(aroom);
						s4.selectByValue("2");
						
						WebElement croom = driver.findElement(By.xpath("//select[@name='child_room']"));
						croom.click();
						Select s5=new Select(croom);
						s5.selectByValue("0");
						
						WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
						search.click();
						
						WebElement rselect = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
						rselect.click();
						
						WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
						submit.click();
						
						WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
						fname.sendKeys("Gayathri");
						
						WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
						lname.sendKeys("Arun");
						
						WebElement addr = driver.findElement(By.xpath("//textarea[@name='address']"));
						addr.sendKeys("No.228,Annai Sathya Nagar,Arumbakkam,Chennai-106");
						
						WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
						cardno.sendKeys("6521831508006090");
						
						WebElement ctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
						ctype.click();
						Select s6=new Select(ctype);
						s6.selectByValue("VISA");
						
						WebElement emon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
						emon.click();
						Select s7=new Select(emon);
						s7.selectByValue("9");
						
						WebElement eyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
						eyear.click();
						Select s8=new Select(eyear);
						s8.selectByValue("2018");
						
						WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
						ccv.sendKeys("718");
						
						WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
						book.click();
						
						WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
						logout.click();
						
						Thread.sleep(3000);
						driver.close();
						
						
						
		
		
		
		
	}
	

}
