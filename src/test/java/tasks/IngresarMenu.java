package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.LoginView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarMenu implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginView.menu, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LoginView.menu),
                Click.on(LoginView.opcionLogIn)
        );
    }
}
