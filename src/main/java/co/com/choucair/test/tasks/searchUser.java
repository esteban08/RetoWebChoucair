package co.com.choucair.test.tasks;

import co.com.choucair.test.userinterface.pageOrigin;
import co.com.choucair.test.userinterface.pagePim;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class searchUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Admin").into(pageOrigin.Name),
                Enter.theValue("admin123").into(pageOrigin.Password),
                Click.on(pageOrigin.LoginButton),
                Click.on(pagePim.ADD),
                Enter.theValue("EsteRami").into(pagePim.Name),
                Click.on(pagePim.Search)
        );
    }
    public static searchUser inPage()
    {return new searchUser();}
}
