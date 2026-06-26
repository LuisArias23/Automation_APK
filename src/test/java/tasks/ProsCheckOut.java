package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.CheckOut;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.CheckOut.*;

public class ProsCheckOut implements Task {
    private final String fullName;
    private final String address1;
    private final String address2;
    private final String city;
    private final String estado;
    private final int codigo;
    private final String country;
    private final String cardNumber;
    private final String expirationDate;
    private final int securityCode;


    public ProsCheckOut(String fullName, String address1, String address2, String
            city, String estado, int codigo, String country,  String cardNumber1, String expirationDate1, int securityCode1) {
        this.fullName = fullName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.estado = estado;
        this.codigo = codigo;
        this.country = country;
        this.cardNumber = cardNumber1;
        this.expirationDate = expirationDate1;
        this.securityCode = securityCode1;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(btProsCheckOut, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(btProsCheckOut),
                WaitUntil.the(txtFullName, isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(fullName).into(txtFullName),
                SendKeys.of(address1).into(CheckOut.txtAddress1),
                SendKeys.of(address2).into(CheckOut.txtAddress2),
                SendKeys.of(city).into(CheckOut.txtCity),
                SendKeys.of(estado).into(CheckOut.txtState),
                SendKeys.of(""+codigo).into(CheckOut.txtZipCode),
                SendKeys.of(country).into(CheckOut.txtCountry),
                Click.on(CheckOut.btToPyment),
                WaitUntil.the(txtFullName, isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(fullName).into(txtFullName),
                SendKeys.of(cardNumber).into(CheckOut.tctCardNumber),
                SendKeys.of(expirationDate).into(CheckOut.tctExpirationDate),
                SendKeys.of("" + securityCode).into(CheckOut.tctSecurityCode),
                Click.on(CheckOut.btConfirmar),
                WaitUntil.the(btPlaceOrder, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(btPlaceOrder)
                );
    }

    public static ProsCheckOut withCheckOut(String fullName, String address1, String address2, String city,
                                            String estado, int codigo, String country, String cardNumber, String expirationDate, int securityCode) {
        return Tasks.instrumented(ProsCheckOut.class, fullName, address1, address2, city, estado, codigo, country,cardNumber, expirationDate, securityCode);
    }
}
