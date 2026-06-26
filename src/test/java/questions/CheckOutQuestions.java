package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.CheckOut;

public class CheckOutQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return CheckOut.txtChechOutComplete.resolveFor(actor).getText();
    }

    public static Question <String> value(){
        return  new CheckOutQuestions();
    }
}
