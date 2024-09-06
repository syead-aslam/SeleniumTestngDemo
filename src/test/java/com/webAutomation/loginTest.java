package com.webAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginTest {
	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		String password = "rahulshettyacademy";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String successmsg = driver.findElement(By.tagName("p")).getText();
		System.out.println(successmsg);
		Assert.assertEquals(successmsg, "You are successfully logged in.");
		String usermessage = driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText();
		System.out.println(usermessage);
		Assert.assertEquals(usermessage,"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
	}

}
