package com.webAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Aslam Ahmad");
		driver.findElement(By.name("email")).sendKeys("aslam.dhanbad@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Khushi@143");
		driver.findElement(By.id("exampleCheck1")).click();
		System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		WebElement GenderSelect = driver.findElement(By.id("exampleFormControlSelect1"));
		Select Sg = new Select(GenderSelect);
		Sg.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		System.out.println(driver.findElement(By.id("inlineRadio1")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
		driver.findElement(By.id("inlineRadio3")).getAttribute("disabled");
		System.out.println(driver.findElement(By.id("inlineRadio3")).getAttribute("disabled"));
		driver.findElement(By.name("bday")).sendKeys("2024-08-28");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		String Success = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		System.out.println(Success);
		Assert.assertEquals(Success,"× Success! The Form has been submitted successfully!.");
		

	}

}
