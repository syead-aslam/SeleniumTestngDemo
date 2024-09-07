package com.testngcheck;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class personalLoan {
	@BeforeMethod
	@Test
	public void PersonalLoanAmout()
	{
		System.out.println("Personal Loan starts with amount 6 Lakh ");
	}
	@Test
	public void PersonalLoanInterest()
	{
		System.out.println("Interest rate of the Home loan  starts at 10.25 percent");
	}
	@AfterMethod
	public void PersonalLoanTenure()
	{
		System.out.println("Enter the Personal loan Period starting with 3 year ");
	}

}
 