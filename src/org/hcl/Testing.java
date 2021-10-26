package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		 
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
	
		WebElement txtfstname=driver.findElement(By.xpath("//input[@type='text']"));
		txtfstname.sendKeys("aarthy");
		
		WebElement txtscdname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtscdname.sendKeys("prabha");
		
		
		WebElement txtadd=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtadd.sendKeys("padur,chennao");
		
		WebElement txtmail=driver.findElement(By.xpath("//input[@type='email']"));
		txtmail.sendKeys("aarthyeee@gmail.com");
		
		
		WebElement txttel=driver.findElement(By.xpath("//input[@type='tel']"));
		txttel.sendKeys("123456789");
		
		
		WebElement btngen=driver.findElement(By.xpath("//input[@value='FeMale']"));
		btngen.click();
		
				
		WebElement btnhobby=driver.findElement(By.xpath("//input[@id='checkbox3']"));
		btnhobby.click();
		
		
		
		
		
		
		
		
		WebElement txtpass=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtpass.sendKeys("kanimaa");
		
		WebElement txtfinal=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtfinal.sendKeys("kanimaa");
		
		
		
		
}


}
