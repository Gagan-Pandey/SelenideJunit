package step_definitions;

import io.cucumber.java.en.And;
import pageObject.LoginPage;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static helper.KeyboardHelper.enterKeyBoard;

public class AuthenticationSteps {

    LoginPage loginPage = new LoginPage();

    @And("higi app is launched$")
    public void validateWelcomeScreen() {
        loginPage.getWelcomeScreen().shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    @And("user clicks on get started button$")
    public void clickGetStartedButton() {
        loginPage.getGetStartedButton().shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @And("user clicks on already have an account link$")
    public void clickAlreadyHaveAccountLogInLink() {
        loginPage.getAlreadyHaveAccountLogInLink().shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @And("user selects email login option$")
    public void selectEmailLoginOption() {
        loginPage.getEmailLoginOption().shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @And("user validates email entry screen$")
    public void validateEmailEntryScreen() {
        loginPage.getEmailEntryInputField().shouldBe(visible, Duration.ofSeconds(30));
    }

    @And("user enter (.*) on email entry field$")
    public void enterEmailAddress(String emailAddress) {
        loginPage.getEmailEntryInputField().shouldBe(visible, Duration.ofSeconds(30));
        enterKeyBoard(emailAddress);
    }

    @And("user clicks on Continue button$")
    public void clickContinueButton() {
        loginPage.getContinueButton().shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @And("user selects password option card$")
    public void selectPasswordCard() {
        loginPage.getPasswordCard().shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @And("user enter (.*) on password entry field$")
    public void enterPassword(String password) {
        loginPage.getPasswordEntryInputField().shouldBe(visible, Duration.ofSeconds(10));
        enterKeyBoard(password);
    }

    @And("user clicks on Login button$")
    public void clickLoginButton() {
        loginPage.getPasswordEntryLoginButton().shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @And("user lands on todo list screen$")
    public void verifyUserLandOnTodoListScreen(){
        loginPage.getTodoListScreen().shouldBe(visible, Duration.ofSeconds(60)).click();
    }


}
