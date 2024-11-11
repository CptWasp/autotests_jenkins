package mavenTest.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SiteActionsTest {

    @Given("I have a sample feature file")
    public void iHaveASampleFeatureFile() {
        System.out.println("Given step executed");
    }

    @When("I run the test")
    public void iRunTheTest() {
        System.out.println("When step executed");
    }

    @Then("I should see the test pass")
    public void iShouldSeeTheTestPass() {
        System.out.println("Then step executed");
    }
}
