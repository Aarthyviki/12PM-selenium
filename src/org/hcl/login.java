package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.google.com/");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		WebElement txtfrom=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txtfrom.sendKeys("GreensTechnology");
		
	}
}
