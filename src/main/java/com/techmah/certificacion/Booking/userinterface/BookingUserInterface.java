package com.techmah.certificacion.Booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BookingUserInterface {

	public static String URL = "https://www.avianca.com/co/es/";
	public static String TAB = "Tab";
	public static String DOWN = "Down";
	public static String ENTER = "Enter";

	/*****************************************
	 * Login
	 *****************************************/

	public static final Target POINT_REFERENCE_MAINMENU_ORIGIN = Target.the("Point of reference to scroll to target")
			.locatedBy("//a[contains(text(),'Reserva tu vuelo')]");
	public static final Target INPUT_MAINMENU_ORIGIN = Target.the("Input to type the origin")
			.locatedBy("//input[@class='form-control airport pbOrigen airport_ida airport_mvvn valid']");
	public static final Target INPUT_MAINMENU_DESTINATION = Target.the("Input to type the Destination")
			.locatedBy("//input[@class='form-control airport pbDestino airport_regreso airport_mvvn error']");
	public static final Target BUTTON_MAINMENU_DATES = Target.the("Button to open the datepicker")
			.locatedBy("//body[@class='homepage page basicpage']");
	public static final Target DATEPICKER_MAINMENU_DAY = Target.the("Select the day of the datepicker")
			.locatedBy("//div[@data-day='{0}']");
	public static final Target BUTTON_MAINMENU_ADD = Target.the("Button to add the passengers")
			.locatedBy("//label[@class='focus']//i[@class='material-icons'][contains(text(),'person_add')]");
	public static final Target BUTTON_MAINMENU_ADULTS = Target.the("Button to add an adult").locatedBy(
			"//div[contains(@class,'passenger x-plugin float')]//div[contains(@class,'controls adults')]//i[contains(@class,'material-icons')][contains(text(),'add')]");
	public static final Target BUTTON_MAINMENU_CHILDREN = Target.the("Button to add an child").locatedBy(
			"//div[contains(@class,'new-margin-l-booking comoViajas-container')]//div[3]//div[2]//div[3]//i[1]");
	public static final Target BUTTON_MAINMENU_BABIES = Target.the("Button to add an baby")
			.locatedBy("//div[contains(@class,'passenger x-plugin float')]//div[2]//div[2]//div[3]//i[1]");
	public static final Target BUTTON_MAINMENU_SEARCH = Target.the("Button to search a flight").locatedBy(
			"//div[contains(@class,'new-margin-l-booking comoViajas-container')]//button[contains(@class,'btn primary btn-codepromo pull-btn rojo')][contains(text(),'Buscar vuelos')]");

	/*****************************************
	 * Select Flight
	 *****************************************/

	public static final Target BUTTON_DETAILS_FLIGHT = Target.the("Button to see the flight details").locatedBy(
			"//expander-elem[@class='bound-expander no-style ng-tns-c24-9 ng-star-inserted']//span[@class='flight-detail-link'][contains(text(),'Detalles del Vuelo')]");
	public static final Target BUTTON_CLOSEDETAILS_FLIGHT = Target.the("Button to close the flight details")
			.locatedBy("//button[@class='btn-primary ok-button']");
	public static final Target BUTTON_FLIGHT_SECONDOPTION_ECO = Target.the("Button to select the second flight eco")
			.locatedBy(
					"/html[1]/body[1]/app-root[1]/main[1]/div[1]/avail-page[1]/div[1]/avail-cont[1]/avail-pres[1]/div[1]/avail-list-pres[1]/expander-elem[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]");
	public static final Target BUTTON_FLIGHT_SECONDOPTION_EJC = Target.the("Button to select the second flight EJC")
			.locatedBy(
					"/html[1]/body[1]/app-root[1]/main[1]/div[1]/avail-page[1]/div[1]/avail-cont[1]/avail-pres[1]/div[1]/avail-list-pres[1]/expander-elem[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/i[1]");

}
