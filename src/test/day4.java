package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void weblogincarLoan(String urlname)
	{
		System.out.println("webloginHome");
		System.out.println(urlname);
	}
	{
		System.out.println("webloginHome");
		System.out.println("URL");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("MobileLoginHome");

	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		System.out.println("LoginAPIHome");

	}
}
