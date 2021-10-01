package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilites.SetupDrivers;

public class EbayHomePageActions {

	// First time doing... we need the constructor Need Action and Locator Need
	// to bring locator into action class
	EbayHomePageLocators EbayHomePageLocatorsObj;

	public EbayHomePageActions() {
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}

	public void loadEbayHomepage() {
		SetupDrivers.driver.get("https://www.ebay.com/");
	}

	public void searchShirts() {
		EbayHomePageLocatorsObj.txbtnSearch.clear();
		EbayHomePageLocatorsObj.txbtnSearch.sendKeys("Shirts");
		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void searchProducts(String Products) {
		EbayHomePageLocatorsObj.txbtnSearch.clear();
		EbayHomePageLocatorsObj.txbtnSearch.sendKeys(Products);
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	public void mouseHoverMyebay() throws InterruptedException {
		// Click on summary by mouse hoving myEbay
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.myEbay);
		actions.perform();
		Thread.sleep(2000);
	}

	public void clickSummary() throws InterruptedException {
		EbayHomePageLocatorsObj.btnSummary.click();
		Thread.sleep(5000);

	}

}


