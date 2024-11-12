package mavenTest.steps.mainPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SiteActionsTest {

    @Given("Пользователь открывает сайт")
    public void iHaveASampleFeatureFile() {
        System.out.println("Пользователь открывает сайт");
    }

    @When("Пользователь запускает тест")
    public void iRunTheTest() {
        System.out.println("Пользователь запускает тест");
    }

    @Then("Пользователь должен увидеть успешный результат")
    public void iShouldSeeTheTestPass() {
        System.out.println("Пользователь должен увидеть успешный результат");
    }
}
