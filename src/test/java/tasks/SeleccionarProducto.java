package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.AgregarProducto;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.AgregarProducto.btCarrito;
import static ui.AgregarProducto.producto;
import static ui.CheckOut.btProsCheckOut;

public class SeleccionarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(producto, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(producto),
                Click.on(AgregarProducto.btseleccionar),
                WaitUntil.the(btCarrito, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(btCarrito)
        );
    }
}
