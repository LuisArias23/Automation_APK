package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.SeleccionarProducto;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarProductoStep {
    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("selecciona el producto Sauce Labs Backpack para añadirlo al carrito")
    public void selecciona_el_producto_para_añadirlo_al_carrito() {
        theActorInTheSpotlight().attemptsTo(
                new SeleccionarProducto());
    }
}
