package org.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(button).click().perform();
		
		WebElement click=driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[2]"));
		
		a.moveToElement(click).click().perform();
		
		WebElement elec=driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"));
		a.moveToElement(elec).perform();
		
       WebElement phone=driver.findElement(By.xpath(""));
		
		a.moveToElement(phone).click().perform();
		
		
WebElement realme=driver.findElement(By.xpath("//div[text()='realme Pad 3 GB RAM 32 GB ROM 10.4 inch with Wi-Fi Only Tablet (Gold)']"));
		
	
		
		a.moveToElement(realme).click().perform();
	   
}
}