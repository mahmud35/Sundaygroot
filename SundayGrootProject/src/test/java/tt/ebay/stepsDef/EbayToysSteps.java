package tt.ebay.stepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayToysSteps {
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Given("^Open Ebay website$")
	public void open_Ebay_website() throws Throwable {

	}

	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {

	}

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String arg1) throws Throwable {

	}

	@Then("^list of selected \"([^\"]*)\" display$")
	public void list_of_selected_display(String arg1) throws Throwable {

	}
}
