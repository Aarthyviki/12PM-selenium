package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement green=driver.findElement(By.xpath("//p[text()=' is a leading Training and Placements company in Chennai. We are known for our practical approach towards trainings that enable students to gain real-time exposure on competitive technologies. Trainings are offered by employees from MNCs to give a real corporate exposure.']"));
		System.out.println(green);
		

}
}