package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass2()
	{
		System.out.println("I will execute before any method in day3 class");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void weblogincarLoan(String urlname,String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	{
		System.out.println("weblogincar");
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day3 class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("I will execute after all test methods in day3 class");
	}
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("MobileLogincar");

	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I am no 1");

	}
	
	@Test(enabled=false)
	public void MobileSignincarLoan()
	{
		System.out.println("Mobile SignIn");

	}
	
	@Test(dataProvider="getData")
	public void MobileSignoutcarLoan(String username, String password)
	{
		System.out.println("Mobile SignOut");
		System.out.println(username);
		System.out.println(password);

	}
	
	@Test(dependsOnMethods= {"weblogincarLoan","MobileLogincarLoan"})
	public void LoginAPIcarLoan()
	{
		System.out.println("LoginAPIcar");

	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstsetpassword";
		
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		return data;
	}
}
