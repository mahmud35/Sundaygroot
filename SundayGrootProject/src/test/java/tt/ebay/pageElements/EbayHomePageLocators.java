package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {

	
	
	//Search Text Box - Page Factory Locators
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
// Ebay Search Button Without Page Factory Locator
	//WebElement btnSearch2 = SetupDrivers.driver.findElement (By.xpath("//input[@value= 'Search']"));	
	//Search Text Box - Page Factory Locators
	
	@FindBy(xpath="//input[@placeholder= 'Search for anything']")
	public WebElement txbtnSearch;
	//myEbay
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement myEbay;

	//Summary Button - Page Factory Locators
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement btnSummary;

	//Search Button - Page Factory Locators
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;

	}	
	

