package com.techmac.certificacion.Booking.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.techmah.certificacion.Booking.drivers.Driver;
import com.techmah.certificacion.Booking.tasks.SearchFlight;
import com.techmah.certificacion.Booking.userinterface.BookingUserInterface;
import com.techmah.certificacion.Booking.utils.DataDrivenExcel;
import com.techmah.certificacion.Booking.utils.Excel;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class StepDefinitionBooking {
	DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
	Map<String, String> data = new HashMap<>();
	@Steps(shared = true)
	private Actor actor = Actor.named("the");

	@Managed
	private WebDriver browser;

	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors());
	};

	@Given("^As an Avianca operator, I would like to search for a flight\\. (\\d+)$")
	public void asAnAviancaOperatorIWouldLikeToSearchForAFlight(int row, DataTable dataExcel) {
		// Write code here that turns the phrase above into concrete actions
		List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
		Excel excel = new Excel(dataFeature.get(0).get("ExcelRoute"), dataFeature.get(0).get("sheet"), true, row);
		data = dataDriverExcel.leerExcel(excel);
		Driver.web();
		theActorCalled(actor.getName()).whoCan(BrowseTheWeb.with(Driver.inThePage(BookingUserInterface.URL)));
	}

	@When("^enter the data in the Avianca main page\\.$")
	public void enterTheDataInTheAviancaMainPage() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(SearchFlight.withTheData(data.get("Origin"), data.get("Destination"),
				data.get("StartDate"), data.get("EndDate"), data.get("Adults"), data.get("Children"),
				data.get("Babies"), data.get("TypeFlight")));
	}

	@Then("^I successfully chose the flight that I wanted\\.$")
	public void iSuccessfullyChoseTheFlightThatIWanted() {
		// Write code here that turns the phrase above into concrete actions

	}

}
