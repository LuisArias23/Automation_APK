package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.CheckOut.txtChechOutComplete;

public class CheckOutQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return txtChechOutComplete.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        WaitUntil.the(txtChechOutComplete, isVisible()).forNoMoreThan(10).seconds();
        return new CheckOutQuestions();
    }
}
