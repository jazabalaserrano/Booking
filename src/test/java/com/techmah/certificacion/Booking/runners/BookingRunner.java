package com.techmah.certificacion.Booking.runners;


import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Booking.feature", glue = "com.techmac.certificacion.Booking.stepsdefinitions", snippets = SnippetType.CAMELCASE, tags = "@SearchFlight")
public class BookingRunner {

}
