package co.com.choucair.test.tasks;

import co.com.choucair.test.userinterface.pageEnterData;
import co.com.choucair.test.userinterface.pageOrange;
import co.com.choucair.test.userinterface.pageOrigin;
import co.com.choucair.test.userinterface.pagePim;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Admin").into(pageOrigin.Name),
                Enter.theValue("admin123").into(pageOrigin.Password),
                Click.on(pageOrigin.LoginButton),
                Click.on(pageOrange.PIM),
                Click.on(pagePim.ADD),
                Enter.theValue("Esteban").into(pageEnterData.Name),
                Enter.theValue("Espinosa").into(pageEnterData.MiddleName),
                Enter.theValue("Ramirez").into(pageEnterData.LastName),
                Enter.theValue("12345").into(pageEnterData.Id),
                Click.on(pageEnterData.Details),
                Enter.theValue("EsteEspi").into(pageEnterData.UserName),
                Click.on(pageEnterData.Status),
                Click.on(pageEnterData.Password),
                Enter.theValue("Pass123").into(pageEnterData.Password),
                Enter.theValue("Pass123").into(pageEnterData.ConfirmPassword),
                Click.on(pageEnterData.SaveButton)

        );
    }
    public static RegisterUser on(){
        return new RegisterUser();
    }
}
