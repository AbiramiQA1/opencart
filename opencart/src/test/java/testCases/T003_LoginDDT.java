package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class T003_LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="DDT")
	
	public void LoginTest(String email,String pwd,String exp)
	{
		logger.info("-----Test T003_LoginDDT started------");
		try {
			HomePage hp=new HomePage(d);
			hp.clickMyAccount();
			hp.clickLogin();
			logger.info("-----Test HomePage completed ------");
			LoginPage lp=new LoginPage(d);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLoginBtton();
			logger.info("-----Test LoginPage completed ------");
			MyAccountPage ma=new MyAccountPage(d);
			boolean target=ma.MyAccountDisplayed();
		
			
			//1. data --->valid ---login success --->test pass(logout)
			//2. data--->valid--->login not success--->test fail(no logout)
			
			if(exp.equalsIgnoreCase("valid"))
			{
			  if(target==true)
			  {
				  ma.ClickLogout();
				  Assert.assertTrue(true);
			  }
			  else
			  {
				  Assert.assertTrue(false);
			  }
			}
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(target==true)
				{
					ma.ClickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e+"test failed");
			Assert.fail("Test failed due to exception");
		}
		logger.info("-----Test T003_LoginDDT completed------");
		
		
	}
	
	
	
}
