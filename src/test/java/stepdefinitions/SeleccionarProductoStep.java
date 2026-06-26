package stepdefinitions;


import io.cucumber.java.en.And;
import tasks.SeleccionarProducto;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarProductoStep {

    @And("selecciona el producto Sauce Labs Backpack para añadirlo al carrito")
    public void selecciona_el_producto_para_añadirlo_al_carrito() {
        theActorInTheSpotlight().attemptsTo(
                new SeleccionarProducto());
    }
}
