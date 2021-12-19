package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class AddNumber {

    int result;

    @Given("User adds {string} and {string}")
    public void userAddsAnd(String arg0, String arg1) {
        int result = Integer.parseInt(arg0) + Integer.parseInt(arg1);
        System.out.printf("Sum is: %d", result);
        this.result = result;
    }

    @Then("Verify sum is {string}")
    public void verifySumIs(String arg0) {
        Assertions.assertThat(arg0).isEqualTo(String.valueOf(result)).describedAs("Sum is incorrect");
    }
}
