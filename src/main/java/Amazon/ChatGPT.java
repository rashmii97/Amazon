package AmazonPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGPT {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://openai.com/blog/chatgpt");
	
		 driver.findElement(By.linkText("Log in")).click();
		 Thread.sleep(5000);
		 //driver.findElement(By.linkText("ChatGPT")).click();  
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Rashmi");
	}

}
