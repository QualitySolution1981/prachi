package Prachi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Saucedemo_Login {
	public WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		
       
		driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
	
	  }
	@Test
	  public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='addNewRecordButton']")).click();
		Thread.sleep(3000);
		// Locate the focusable popup element
		WebElement popupElement = driver.findElement(By.id("userForm"));

		// Use Actions class to send keys
		Actions actions = new Actions(driver);
		actions.moveToElement(popupElement).click().sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Bhushan");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Tapre");
		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("bhushantapre@gmail.com");
		driver.findElement(By.xpath("//*[@id='age']")).sendKeys("29");
		driver.findElement(By.xpath("//*[@id='salary']")).sendKeys("400000");
		driver.findElement(By.xpath("//*[@id='department']")).sendKeys("Testing");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[2]")).click();

	 }

	

  @AfterTest
  public void afterTest() {
  }

}
