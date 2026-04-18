package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegisterationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegisterTest extends BaseClass {
		
	@Test(groups={"Sanity","Master"})
	public void AccountTest()
	{
		logger.info("-------AccountTest Started----------");
		try
		{
			HomePage hp=new HomePage(d);
			logger.info("-------click Account----------");
			hp.clickMyAccount();
			logger.info("-------click Register----------");
			hp.clickRegister();
			
			AccountRegisterationPage AR=new AccountRegisterationPage(d);
			logger.info("-------Registering Details ----------");
			AR.setFirstName(randomAlpha().toUpperCase());
			AR.setLastName(randomAlpha().toUpperCase());
			AR.setEmail(randomAlpha()+"@gmail.com");
			AR.setTelephone(randomeNumeric());
			
			String password=randomeAlphaNumeric();
			AR.setPassword(password);
			AR.setPasswordConfirm(password);
			logger.info("-------click Privacy----------");
			AR.clickPrivacy();
			logger.info("-------click Continue----------");
			AR.clickContinue();
			String actualmsg=AR.getSuccessVerify();
			System.out.println(actualmsg);
			Assert.assertEquals(actualmsg,( "Your Account Has Been Created!"));	
		}
		catch(Throwable e)//captures both selenium and assertion
		{
			logger.error(e.getMessage());
			logger.debug("------------Debugging-----------");
			Assert.fail();
		}
		
			
	}
	
	

	
}
