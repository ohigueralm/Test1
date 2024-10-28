package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginView;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginView.selectorenv),
                Click.on(LoginView.deltaselect),
                SendKeys.of(new CharSequence[]{"user+na-9@lminc.io"}).into(LoginView.username),
                Click.on(LoginView.nextbuttom),
                SendKeys.of(new CharSequence[]{"LaunchMobility1"}).into(LoginView.password),
                Click.on(LoginView.LogInCTA)
        );
    }
}
