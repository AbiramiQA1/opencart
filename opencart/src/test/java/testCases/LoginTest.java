package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {
	@Test(groups= {"Regression","Master"})
	public void Login()
	{
		HomePage h=new HomePage(d);
		h.clickMyAccount();
		h.clickLogin();
		
		LoginPage l=new LoginPage(d);
		l.setEmail(p.getProperty("email"));
		l.setPassword(p.getProperty("password"));
		l.clickLoginBtton();
		
		MyAccountPage ma=new MyAccountPage(d);
		boolean targetpage=ma.myAccountDisplayed();
		if(targetpage==true)
		{
			System.out.println("Account login is successful");
		}
		else
		{
			Assert.fail("Test Failed");
		}
	}
	
	
	
	
	
	
	
	

}
