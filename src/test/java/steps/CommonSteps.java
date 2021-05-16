package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.ScenarioContext;

public class CommonSteps extends BaseSteps{

    @Given("Launch browser {string}")
    public void launch_browser(String browser) {
        startWebDriver(browser);
    }

    @And("Set Data {string} value {string}")
    public void set_data(String key,String value) {
        ScenarioContext.setContext(key,value);
    }

    @And("Get Data {string}")
    public void get_data(String key) {
        System.out.println(Thread.currentThread().getName()+ " key-value "+ScenarioContext.getContext(key));
        ScenarioContext.getContext(key);
    }
}
