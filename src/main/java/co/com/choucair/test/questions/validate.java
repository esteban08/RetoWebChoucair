package co.com.choucair.test.questions;

import co.com.choucair.test.userinterface.pagePim;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class validate implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(pagePim.Found).viewedBy(actor).asString();
    }
    public static validate user(){
return new validate();
    }
}