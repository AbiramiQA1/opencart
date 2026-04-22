package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage extends BasePage{
	
	public Addtocartpage(WebDriver d){
		super(d);
	}
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement Addtocart;
	
	public void clickAddtocart()
	{
		Addtocart.click();
	}

}
