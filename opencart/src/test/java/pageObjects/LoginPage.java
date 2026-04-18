package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver d)
	{
		super(d);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement LoginButton;
	
	
	public void setEmail(String emailId)
	{
		Email.sendKeys(emailId);
	}
	
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void clickLoginBtton()
	{
		LoginButton.click();
	}
}
