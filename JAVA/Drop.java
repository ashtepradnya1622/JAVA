package JAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//launching amazon India
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		//locate your dropdown
		dd.sendKeys(Keys.ARROW_DOWN);
		//using Keys press arrow down button
		dd.sendKeys(Keys.ARROW_DOWN);
		//using Keys press arrow down button
		dd.sendKeys(Keys.ARROW_DOWN);
		//using Keys press arrow down button
	}

}
