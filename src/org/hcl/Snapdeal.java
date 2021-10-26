package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);

		WebElement signin=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		signin.click();
		
		WebElement reg=driver.findElement(By.xpath("//div[@class='dropdownWrapper hard-hidden']"));
		reg.click();
		
		WebElement userid=driver.findElement(By.xpath("//input[@id='userName']"));
	    userid.sendKeys("9003215831");
		
		WebElement cont=driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		cont.click();
}


}
