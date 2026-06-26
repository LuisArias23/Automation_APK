package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.IngresarMenu;
import tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre la aplicación y se encuentra en la pantalla de Login")
    public void que_el_usuario_abre_la_aplicación_y_se_encuentra_en_la_pantalla_de_login() {
        theActorCalled("Luis").attemptsTo(Tasks.instrumented(IngresarMenu.class));
    }

    @When("el usuario ingresa las credenciales válidas {string} y {string}")
    public void el_usuario_ingresa_las_credenciales_válidas_y(String correo, String contra) {
        theActorInTheSpotlight().attemptsTo(
                Login.withCredenciales(correo, contra));
    }
}
