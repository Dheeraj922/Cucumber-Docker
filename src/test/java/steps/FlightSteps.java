package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlightSteps {
    @Given("User selects the {string} tab")
    public void userSelectsTheTab(String arg0) {
    }

    @And("User selects the {string} radio button")
    public void userSelectsTheRadioButton(String arg0) {
    }

    @And("User selects the flight type as {string}")
    public void userSelectsTheFlightTypeAs(String arg0) {
    }

    @And("User sets the {string} as {string}")
    public void userSetsTheAs(String arg0, String arg1) {
    }

    @And("User sets the departure date as {string}")
    public void userSetsTheDepartureDateAs(String arg0) {
    }

    @And("User sets the passenger count as below")
    public void userSetsThePassengerCountAsBelow(DataTable dataTable) {
    }

    @Then("Verify that user details for {string} are displayed")
    public void verifyThatUserDetailsForAreDisplayed(String user) {

    }

    @And("Verify that search result should be displayed")
    public void verifyThatSearchResultShouldBeDisplayed() {

    }

    @And("User search flight with details as below")
    public void userSearchFlightWithDetailsAsBelow(DataTable dataTable) {

    }

    @And("Verify that booking summary should be displayed as below")
    public void verifyThatBookingSummaryShouldBeDisplayedAsBelow(DataTable dataTable) {

    }
}
