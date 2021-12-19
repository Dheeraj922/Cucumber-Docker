package steps;

import flows.LoginFlows;
import io.cucumber.java.en.Given;

public class LoginSteps {

    LoginFlows loginFlows = new LoginFlows();

    @Given("User logs into application {string} as {string}")
    public void userLogsIntoApplicationAs(String appName, String userId) {
        loginFlows.loginUser(appName, userId);
    }
}
