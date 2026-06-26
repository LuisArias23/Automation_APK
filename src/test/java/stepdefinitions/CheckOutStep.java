package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import questions.CheckOutQuestions;
import tasks.ProsCheckOut;
import utils.DataHelper;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class CheckOutStep {

    @And("completa el proceso de Checkout con datos ficticios")
    public void completa_el_proceso_de_checkout_con_datos_ficticios() {

        theActorInTheSpotlight().attemptsTo(
                ProsCheckOut.withCheckOut(
                        DataHelper.get("checkout.nombre"), DataHelper.get("checkout.direccion1"),
                        DataHelper.get("checkout.direccion2"), DataHelper.get("checkout.ciudad"),
                        DataHelper.get("checkout.departamento"), DataHelper.getInt("checkout.zip"),
                        DataHelper.get("checkout.tex"), DataHelper.get("checkout.numerocard"),
                        DataHelper.get("checkout.expiredata"), DataHelper.getInt("checkout.codigocv")));
    }

    @Then("el sistema debe mostrar una pantalla de confirmación con el mensaje de éxito.")
    public void el_sistema_debe_mostrar_una_pantalla_de_confirmación_con_el_mensaje_de_éxito() {
        theActorInTheSpotlight().should(seeThat("Confirmacion CheckOut", CheckOutQuestions.value(), equalTo("Checkout Complete")));

    }
}

