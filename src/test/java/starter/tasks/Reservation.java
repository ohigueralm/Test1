package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.AvailabilityView;
import starter.ui.LoginView;
import starter.ui.ReservationView;

public class Reservation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReservationView.ResFooter),
                Click.on(ReservationView.AllowPer),
                Click.on(ReservationView.PickOffTime),
                Click.on(ReservationView.DateSelected),
                Click.on(ReservationView.OkCalendar),
                Click.on(ReservationView.CheckButton),
                Click.on(AvailabilityView.FirstVeh)
        );
    }
}
