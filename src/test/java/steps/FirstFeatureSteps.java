package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.ScenarioContext;

public class FirstFeatureSteps extends BaseSteps{

    @Given("When i am on user page")
    public void when_i_am_on_userpage() {
        navigate("http://www.google.com");
        System.out.println("when i am on user page");
    }
    @Then("application is up")
    public void application_is_up() {
        stopWebDriver();
        System.out.println("application is up");
    }


}
