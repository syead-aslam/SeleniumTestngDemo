package com.testngcheck;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class goldLoan {
	@BeforeClass
	public void BeforGoldLoan()
	{
		System.out.println("Verify all the documents");
	}
	@Test
	public void goldPrice()
	{
		System.out.println("Price of the gold is 72000 per 10 gm");
	}
	@Test
	public void goldLoanInterest()
	{
		System.out.println("Interest rate of the gold loan  is 7.7 pecent");
	}
	
	public void goldLoanTenure()
	{
		System.out.println("Enter the gold loan Tenure ");
	}
	
	@AfterClass
	public void afterGoldLoan()
	{
		System.out.println("Loan granted, will get money in 24 hours");
	}

}
