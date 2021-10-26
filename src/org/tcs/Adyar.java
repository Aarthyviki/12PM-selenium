package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adyar {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.manage().window().maximize();
    
	
	WebElement org=driver.findElement(By.xpath("(//div[text()='Greens Technology'])[1]"));
	System.out.println(org);
	
	WebElement place=driver.findElement(By.xpath("(//span[text()='Adyar'])[1]"));
	System.out.println(place);
	
	WebElement num=driver.findElement(By.xpath("//span[(text()='No:11,']"));
	System.out.println(num);
	
	WebElement addr1=driver.findElement(By.xpath("//span[(text()='First Street,']"));
	System.out.println(addr1);

	WebElement addr2=driver.findElement(By.xpath("//span[(text()='padmanabha Nagar,']"));
	System.out.println(addr2);
	
	WebElement addr=driver.findElement(By.xpath("//span[text()='Adyar,']"));
	System.out.println(addr);

	WebElement pin=driver.findElement(By.xpath("//span[text()='Chennai-600 020.']"));
	System.out.println(pin);
	
	WebElement phone=driver.findElement(By.xpath("(//a[text()='+91 9944152058'])[5]"));
	System.out.println(phone);
	
	
}
}