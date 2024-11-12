package mavenTest.steps.loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


    @Given("Система использует {string}")
    public void useSystemUser(String user){
        System.out.println("Указываем в параметрах теста пользовательские логин и пароль для " + user);
    }

    @When("Пользователь идет на старинцу авторизации")
    public void authPageGo(){
        System.out.println("Пользователь идет на страницу авторизации");
    }

    @Then("Пользователь нажимает на ту самую кнопку")
    public void clickTheButton(){
        System.out.println("Пользователь нажимает на ту самую кнопку");
    }



}
