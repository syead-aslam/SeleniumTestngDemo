package com.testngcheck;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class homeLoan {
	
	@Test(groups= {"smoke"})
	public void homeLoanAmout()
	{
		System.out.println("Home Loan starts with amount 30 Lakh ");
	}
	
	@Parameters({"salaryslip","documents"})
	@Test
	public void HomeLoanInterest(String salaryslip,String documents)
	{
		System.out.println("Interest rate of the Home loan  starts at 8.3 pecent");
		System.out.println("Please provide salary slip of :"+salaryslip);
		System.out.println("Please Provide address proof : "+documents);
	}
	@Test(groups= {"smoke"})
	public void HomeLoanTenure()
	{
		System.out.println("Enter the Home loan Period starting with 10 year ");
		Assert.assertTrue(false);
	}

}
