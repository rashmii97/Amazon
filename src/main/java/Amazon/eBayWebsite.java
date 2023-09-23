package AmazonPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class eBayWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ebay.com/");
		WebElement dropdownElement = driver.findElement(By.id("gh-cat"));
		
		Select dropdown = new Select(dropdownElement);
		
		dropdown.selectByIndex(11);
		
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("MacBooks")).click();
		
        for(int i=0; i<=2; i++) 
        {
        	driver.findElement(By.xpath("//div[@id='mainContent']//div//section[1]//div[2]//div[1]//button[2]")).click();
        }
        Thread.sleep(5000);
		driver.findElement(By.linkText("2023")).click();
		driver.findElement(By.xpath("//li[3]//div//button//span")).click();
		driver.findElement(By.cssSelector("body > div:nth-child(5) > div:nth-child(4) > div:nth-child(3) > section:nth-child(1) > section:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.xpath("//li[4]//div//button//span")).click();
		driver.findElement(By.xpath("//span[normalize-space()='256 GB']")).click();
		driver.findElement(By.xpath("//li[5]//div//button//span")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Apple M2']")).click();
		driver.findElement(By.xpath("//li[6]//div//button//span")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[3]/section[1]/section[1]/ul[1]/li[6]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//li[7]//div//button//span")).click();
		driver.findElement(By.xpath("//span[normalize-space()='New']")).click();
		driver.findElement(By.xpath("//li[8]//div//button//span")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Buy It Now']")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Apple MacBook Air 15\" (M2 chip, 256GB/8GB, MQKP3X/')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Buy It Now")).click();
		
	}
	

}
