package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebsite2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		 driver.findElement(By.className("shopping_cart_link")).click();
		 driver.findElement(By.id("checkout")).click();
		 driver.findElement(By.id("first-name")).sendKeys("ChempuGuna");
		 driver.findElement(By.id("last-name")).sendKeys("Chapdya");
		 driver.findElement(By.id("postal-code")).sendKeys("643212");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("finish")).click();
		 driver.findElement(By.id("back-to-products")).click();		

	}

}
