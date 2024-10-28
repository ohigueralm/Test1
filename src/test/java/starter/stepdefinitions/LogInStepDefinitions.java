//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.tasks.Login;
import starter.tasks.Reservation;


public class LogInStepDefinitions {
    @Managed(
            driver = "Appium"
    )
    public WebDriver hisMobileDevice;

    public LogInStepDefinitions() {
    }

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User wants to login")
    public void john_want_to_create_a_new_post() {
        OnStage.theActorCalled("Jhon").attemptsTo(new Performable[]{new Login()});
    }

    @When("enter reservation details")
    public void enter_reservation_details() {
        OnStage.theActorInTheSpotlight().attemptsTo(new Performable[]{new Reservation()});
    }




}
