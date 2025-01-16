package co.com.chocuair.test.stepdefinitions;


import co.com.choucair.test.questions.validate;
import co.com.choucair.test.tasks.RegisterUser;
import co.com.choucair.test.tasks.searchUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class ChoucairStepdefinitions {
    @Managed
    private WebDriver myDirver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Esteban");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDirver));

    }
    @Given("^The user enter page orange$")
    public void theUserEnterPageOrange() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
    }

    @When("^The user enter data to page$")
    public void theUserEnterDataToPage() {
      OnStage.theActorInTheSpotlight().wasAbleTo(RegisterUser.on());
    }
    @When("^The user search with name create$")
    public void theUserSearchWithNameCreate() {
      OnStage.theActorInTheSpotlight().wasAbleTo(searchUser.inPage());
    }

    @Then("^The user see that to search on page orange .*$")
    public void theUserSeeThatToSearchOnPageOrangeRecordFound(String arg1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validate.user(), Matchers.containsString(arg1)));
    }
}
