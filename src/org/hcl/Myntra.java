package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.myntra.com/register?referer=https://www.myntra.com/");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement signin=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		signin.sendKeys("9003115831");
		
		WebElement reg=driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		reg.click();

		
		
		
}

}
