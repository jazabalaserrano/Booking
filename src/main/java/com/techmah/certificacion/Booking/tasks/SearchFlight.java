package com.techmah.certificacion.Booking.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.techmah.certificacion.Booking.drivers.Driver;
import com.techmah.certificacion.Booking.interactions.WaitToLoad;
import com.techmah.certificacion.Booking.interactions.WriteLetter;
import com.techmah.certificacion.Booking.userinterface.BookingUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class SearchFlight implements Task {
	private String origin, destination, startDate, endDate, adults, children, babies, typeFlight;

	/**
	 * @param origin
	 * @param destination
	 * @param startDate
	 * @param endDate
	 * @param adults
	 * @param children
	 * @param babies
	 */
	public SearchFlight(String origin, String destination, String startDate, String endDate, String adults,
			String children, String babies, String typeFlight) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.startDate = startDate;
		this.endDate = endDate;
		this.adults = adults;
		this.children = children;
		this.babies = babies;
		this.typeFlight = typeFlight;
	}

	@Override
	@Step("the actor tries to search a flight with the data  #origin, #destination, #startDate, #endDate, #adults, #children, #babies")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		String tempFlight;
		actor.attemptsTo(WaitToLoad.theMiliSeconds(3000),
				Scroll.to(BookingUserInterface.POINT_REFERENCE_MAINMENU_ORIGIN),
				Enter.theValue(origin).into(BookingUserInterface.INPUT_MAINMENU_ORIGIN),
				WriteLetter.theLetter(BookingUserInterface.DOWN), WriteLetter.theLetter(BookingUserInterface.ENTER),
				WriteLetter.theLetter(BookingUserInterface.TAB), WriteLetter.theLetter(BookingUserInterface.TAB),
				Enter.theValue(destination).into(BookingUserInterface.INPUT_MAINMENU_DESTINATION),
				WriteLetter.theLetter(BookingUserInterface.DOWN), WriteLetter.theLetter(BookingUserInterface.ENTER),
				WriteLetter.theLetter(BookingUserInterface.TAB), WaitToLoad.theMiliSeconds(6000));

		JavascriptExecutor js = (JavascriptExecutor) Driver.inTheStage();
		WebElement StartDate = Driver.inTheStage().findElement(By.xpath("//div[@data-day='" + startDate + "']"));
		WebElement EndDate = Driver.inTheStage().findElement(By.xpath("//div[@data-day='" + endDate + "']"));
		js.executeScript("arguments[0].click();", StartDate);
		actor.attemptsTo(WaitToLoad.theMiliSeconds(6000));
		js.executeScript("arguments[0].click();", EndDate);
		actor.attemptsTo(WaitToLoad.theMiliSeconds(6000));
		actor.attemptsTo(WriteLetter.theLetter(BookingUserInterface.TAB),
				Click.on(BookingUserInterface.BUTTON_MAINMENU_ADD), WaitToLoad.theMiliSeconds(2000));
		if ((Integer.parseInt(adults)) > 1) {
			for (int i = 0; i < Integer.parseInt(adults); i++) {
				actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_MAINMENU_ADULTS));

			}
		}
		if ((Integer.parseInt(children)) > 0) {
			for (int i = 0; i < Integer.parseInt(children); i++) {
				actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_MAINMENU_CHILDREN));

			}
		}
		if ((Integer.parseInt(babies)) > 0) {
			for (int i = 0; i < Integer.parseInt(babies); i++) {
				actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_MAINMENU_BABIES));

			}
		}

		actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_MAINMENU_SEARCH), WaitToLoad.theMiliSeconds(5000));
		js.executeScript("window.scrollTo(1000, 0);");

		actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_DETAILS_FLIGHT), WaitToLoad.theMiliSeconds(6000));
		tempFlight = Driver.inTheStage().findElement(By.xpath("//span[@class='flight-details-header-location-date']"))
				.getText();
		actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_CLOSEDETAILS_FLIGHT), WaitToLoad.theMiliSeconds(2000));
		switch (typeFlight) {
		case "ECO":
			actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_FLIGHT_SECONDOPTION_ECO));
			break;
		case "EJC":
			actor.attemptsTo(Click.on(BookingUserInterface.BUTTON_FLIGHT_SECONDOPTION_EJC));
			break;
		default:
			System.out.println("Opción no valida");
			break;
		}
		actor.attemptsTo(WaitToLoad.theMiliSeconds(3000));
		js.executeScript("window.confirm('Vuelo Seleccionado: >" + tempFlight + "');");
		actor.attemptsTo(WaitToLoad.theMiliSeconds(3000));

	}

	public static SearchFlight withTheData(String origin, String destination, String startDate, String endDate,
			String adults, String children, String babies, String typeFlight) {
		return Tasks.instrumented(SearchFlight.class, origin, destination, startDate, endDate, adults, children, babies,
				typeFlight);
	}

}
