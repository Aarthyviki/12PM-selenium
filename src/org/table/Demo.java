package org.table;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://demo.guru99.com/test/write-xpath-table.html ");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@border='l']"));
		
		java.util.List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) {
			
			WebElement row=rows.get(i);
			
			java.util.List<WebElement> datas=row.findElements(By.tagName("td"));
			
			for (int j = 0; j < datas.size(); j++) {
				WebElement data=datas.get(j);
				String text=data.getText();
				System.out.println(text);
			}
			
		}
		
		

}
}