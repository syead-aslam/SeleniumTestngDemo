package com.webAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class actionCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(move).build().perform();
		action.moveToElement(move).contextClick().build().perform();
		WebElement mv = driver.findElement(By.id("twotabsearchtextbox"));
//		action.moveToElement(mv).click().sendKeys("hello").build().perform();
		action.moveToElement(mv).click().keyDown(Keys.SHIFT).sendKeys("helle").build().perform();
		Thread.sleep(5000);
//		action.moveToElement(driver.findElement(By.xpath("//div[@class='left-pane-results-container']//div[@aria-label='hellet']"))).click().build().perform();
//		action.moveToElement(driver.findElement(By.xpath("//div/input[@value='hellet']"))).click();
		driver.findElement(By.xpath("//div[@class='left-pane-results-container'] //div[@aria-label='hellet']")).click();
		driver.quit();
		

	}

}
