package steps;

import io.cucumber.core.runtime.CucumberExecutionContext;
import io.cucumber.java.*;

public class Hooks extends BaseSteps {

    @Before
    public void before_scenario(Scenario scenario){

    }

    @After
    public void after_scenario(Scenario scenario){
        System.out.println("Scenario is finished: "+scenario.getName());
        stopWebDriver();
    }

    @AfterStep
    public void after_Step(){
        System.out.println("Step is completed");

    }

    @Before("@skip")
    public void skipScenario(Scenario scenario){
        throw new PendingException("Test is skipped: "+scenario.getName());
    }

    @After("@tearDown")
    public void tearDown(){
        stopWebDriver();
    }

}
