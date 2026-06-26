package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class LoginView {

   public static Target menu= Target.the("menu hamburguesa")
            .located(AppiumBy.accessibilityId("open menu"));
    public static Target opcionLogIn= Target.the("Opcion Log In")
            .located(AppiumBy.accessibilityId("menu item log in"));
    public static Target unerName= Target.the("UserName")
            .located(AppiumBy.accessibilityId("Username input field"));
    public static Target password= Target.the("Password")
            .located(AppiumBy.accessibilityId("Password input field"));
    public static Target loginButton= Target.the("Boton de Login")
            .located(AppiumBy.accessibilityId("Login button"));
}
