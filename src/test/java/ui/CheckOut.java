package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckOut {
    public static Target btProsCheckOut = Target.the("Boton Proceso de CheckOut")
            .located(AppiumBy.accessibilityId("Proceed To Checkout button"));
    public static Target txtFullName = Target.the("Campo Full Name")
            .located(AppiumBy.accessibilityId("Full Name* input field"));
    public static Target txtAddress1 = Target.the("Campo Address1")
            .located(AppiumBy.accessibilityId("Address Line 1* input field"));
    public static Target txtAddress2 = Target.the("Campo Address2")
            .located(AppiumBy.accessibilityId("Address Line 2 input field"));
    public static Target txtCity = Target.the("Campo City")
            .located(AppiumBy.accessibilityId("City* input field"));
    public static Target txtState = Target.the("Campo Estado")
            .located(AppiumBy.accessibilityId("State/Region input field"));
    public static Target txtZipCode = Target.the("Campo Codigo postal")
            .located(AppiumBy.accessibilityId("Zip Code* input field"));
    public static Target txtCountry = Target.the("Campo Country")
            .located(AppiumBy.accessibilityId("Country* input field"));
    public static Target btToPyment = Target.the("Boton pago")
            .located(AppiumBy.accessibilityId("To Payment button"));
    public static Target txtFullNameCard = Target.the("Full Name card")
            .located(AppiumBy.accessibilityId("Full Name* input field"));
    public static Target tctCardNumber = Target.the("Numero card")
            .located(AppiumBy.accessibilityId("Card Number* input field"));
    public static Target tctExpirationDate = Target.the("Fecha card")
            .located(AppiumBy.accessibilityId("Expiration Date* input field"));
    public static Target tctSecurityCode = Target.the("Codigo card")
            .located(AppiumBy.accessibilityId("Security Code* input field"));
    public static Target btConfirmar = Target.the("Boton confirmard")
            .located(AppiumBy.accessibilityId("Review Order button"));
    public static Target btPlaceOrder = Target.the("Confirmar Orden")
            .located(AppiumBy.accessibilityId("Place Order button"));
    public static Target txtChechOutComplete = Target.the("Confirmacion CheckOut")
            .locatedBy("//android.widget.TextView[@text=\"Checkout Complete\"]");



}
