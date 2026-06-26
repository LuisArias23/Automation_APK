package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.LoginView;


public class Login implements Task {
    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(username).into(LoginView.unerName),
                SendKeys.of(password).into(LoginView.password),
                Click.on(LoginView.loginButton));
    }

    public static Login withCredenciales(String username, String password){
        return Tasks.instrumented(Login.class,username,password);
    }
}
