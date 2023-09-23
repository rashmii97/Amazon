package AmazonPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleWebPrractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.className("oxd-main-menu-item-wrapper")).click();
		 driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
			Thread.sleep(5000);
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
			WebElement dropdownParent = driver.findElement(By.className("oxd-select-text"));

	        dropdownParent.click();
	        Thread.sleep(5000);
	        // Find and click on the specific option ("Admin" in this example)
	        WebElement optionElement = driver.findElement(By.xpath("//div[contains(text(),'Admin')]"));
	        optionElement.click();
		  

	}

}
