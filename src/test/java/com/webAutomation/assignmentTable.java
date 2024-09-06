package com.webAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		int RowCount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		System.out.println(RowCount);
		int ColumnCount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
		System.out.println(ColumnCount);
		String ActualInstructor = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[1]")).getText();
		System.out.println(ActualInstructor);
		String ActualCourse= driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[2]")).getText();
		System.out.println(ActualCourse);
		int ActualPrice= Integer.parseInt(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[3]")).getText());
		System.out.println(ActualPrice);
		driver.close();

	}

}
