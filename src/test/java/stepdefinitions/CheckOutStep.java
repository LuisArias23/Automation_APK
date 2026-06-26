package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.CheckOutQuestions;
import tasks.ProsCheckOut;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class CheckOutStep {

    @And("completa el proceso de Checkout con datos ficticios")
    public void completa_el_proceso_de_checkout_con_datos_ficticios() {

        theActorInTheSpotlight().attemptsTo(
                ProsCheckOut.withCheckOut(
                        "Luis Edgardo Arias Mercadom", "Calle 1","Calle 2","Fundacion",
                        "Magdalena",472020,"xxx","125452569875458","02/30",123));
    }

    @Then("el sistema debe mostrar una pantalla de confirmación con el mensaje de éxito.")
    public void el_sistema_debe_mostrar_una_pantalla_de_confirmación_con_el_mensaje_de_éxito() {
        theActorInTheSpotlight().should(seeThat("Confirmacion CheckOut", CheckOutQuestions.value(), equalTo("Checkout Complete")));

    }
}

