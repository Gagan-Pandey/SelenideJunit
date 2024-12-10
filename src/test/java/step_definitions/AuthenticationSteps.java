package step_definitions;

import io.cucumber.java.en.And;
import pageObject.LoginPage;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class AuthenticationSteps {

    LoginPage loginPage = new LoginPage();

    @And("higi app is launched$")
    public void validateWelcomeScreen() {
        loginPage.getWelcomeScreen().shouldBe(visible, Duration.ofSeconds(60)).click();;
    }

    @And("user clicks on get started button$")
    public void clickGetStartedButton() {
        loginPage.getGetStartedButton().shouldBe(visible, Duration.ofSeconds(10)).click();;
    }

    @And("user clicks on already have an account link$")
    public void clickAlreadyHaveAccountLogInLink() {
        loginPage.getAlreadyHaveAccountLogInLink().shouldBe(visible, Duration.ofSeconds(10)).click();;
    }

    @And("user selects email login option$")
    public void selectEmailLoginOption() {
        loginPage.getEmailLoginOption().shouldBe(visible, Duration.ofSeconds(10)).click();;
    }

    @And("user validates email entry screen$")
    public void validateEmailEntryScreen() {
        loginPage.getEmailEntryInputField().shouldBe(visible, Duration.ofSeconds(30));
    }
}
