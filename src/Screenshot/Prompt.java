package Screenshot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.manage().window().maximize();
	
	WebElement confirm=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	confirm.click();
	
	WebElement press=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	press.click();
	
	Alert a=driver.switchTo().alert();
	a.sendKeys("Greens");
	System.out.println(a.getText());
	
	a.accept();
	

}
}