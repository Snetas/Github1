package steps.features;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on login page");
    }
    {System.out.println("User manage to login");}


    @When("the user enters valid username and password")
    public void enterValidCredentials() {
        System.out.println("User enters valid credentials");
    }

    @When("clicks on the login button")
    public void clickLoginButton() {
        System.out.println("User clicks on login button");
    }

    @Then("the user should be redirected to the homepage")
    public void verifyHomepage() {
        System.out.println("User is redirected to homepage");
    }
}
