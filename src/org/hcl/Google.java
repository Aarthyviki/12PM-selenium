package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
	
		
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		fname.sendKeys("aarthy");
		
		WebElement sname=driver.findElement(By.xpath("//input[@name='lastName']"));
		sname.sendKeys("prabha");
		
		WebElement mail=driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("aarthyeee");
		
		WebElement pass=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass.sendKeys("aarthy123");
		
		WebElement cpass=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		cpass.sendKeys("aarthy123");
		
		WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		
		WebElement next=driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		next.click();
		
}

}
