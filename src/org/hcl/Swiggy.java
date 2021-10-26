package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		WebElement signin=driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signin.click();
		
		WebElement tel=driver.findElement(By.xpath("//input[@type='tel']"));
		tel.sendKeys("9003215831");
		
		WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("aarthy");
		
		WebElement mail=driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("aarthy@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("aarthy123");
		
		WebElement cont=driver.findElement(By.xpath("//div[@class='_25qBi _2-hTu']"));
		cont.click();
		
}
}
