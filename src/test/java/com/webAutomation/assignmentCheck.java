package com.webAutomation;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentCheck {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
        String value = driver.findElement(By.xpath("//input[@value='option1']")).getAttribute("value");
        System.out.println(value);
        WebElement sl = driver.findElement(By.id("dropdown-class-example"));
        Select sel = new Select(sl);
        sel.selectByValue(value);
        driver.findElement(By.xpath("//input[@id='name']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(value);
        driver.findElement(By.id("alertbtn")).click();
        String name = driver.switchTo().alert().getText().split(",")[0].trim().split(" ")[1];
        System.out.print(name);
        driver.quit();
        
	}

}
