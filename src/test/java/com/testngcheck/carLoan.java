package com.testngcheck;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carLoan {
	
	@BeforeSuite
	public void BeforeLoan()
	{
		System.out.println("Enter all the documents for processing the loan ");
	}
	
	@Parameters({"Price"})
	@Test
	public void carAmount(String Price)
	{
		System.out.println("What is the amount of car ? ");
		System.out.println("Rate of Car is :"+Price);
	}
	@Test(dependsOnMethods={"carAmount","carLoanTenure"})
	public void carLoanInterest()
	{
		System.out.println("Interest of the car is 7.8 percent");
	}
	@Test
	public void carLoanTenure()
	{
		System.out.println("Enter the car loan period starting 2 years ");
	}
	
	@AfterSuite
	public void AfterLoan()
	{
		System.out.println("Congratulation! your loan has approved");
	}
	
	

}
