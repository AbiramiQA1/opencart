package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ProductPage extends BasePage{
	
	WebDriverWait w;
	public ProductPage(WebDriver d)
	{
		super(d);
		w=new WebDriverWait(d,Duration.ofSeconds(10));
	}

	@FindBy(xpath="//div[@class='image']//img[@title='MacBook Air']")
	WebElement MacBookAir;
	
	@FindBy(xpath="//div[@id='product-info']//h1")
	WebElement ProductTitle;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtoCart;
	
	public void clickProduct()
	{
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", MacBookAir);
	}
	
	public String productTitle()
	{
		 return ProductTitle.getText();
	}
	
	public void productAddToCart()
	{
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click();",addtoCart );
	}
}
