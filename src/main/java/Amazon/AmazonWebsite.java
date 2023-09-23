package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebsite {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 14 (512 GB) - Starlight']")).click();*/
		//driver.findElement(By.linkText("Add to Cart")).click();
		//driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click(); 
		/*driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("gunakoushik1808@gmail.com"); 
		driver.findElement(By.xpath("//input[@id='continue']']")).click(); 
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Koushik@98"); 
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();*/
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=12539543719773880256&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20469&hvtargid=kwd-10573980&hydadcr=14453_2154373");
	    driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("samsung s21 fe 5g");
	    driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
	    driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
	    driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("gunakoushik1808@gmail.com");
	    driver.findElement(By.xpath("//input[@id='continue']']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Koushik@98");
	    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();



		
		
	}

}
