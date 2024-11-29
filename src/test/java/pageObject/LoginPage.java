package pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public SelenideElement getGetStartedButton(){
        return $x("//button[@id='go-to-home-screen-button']");
    }

    public SelenideElement getAlreadyHaveAccountLogInLink(){
        return $(byText("Already have an account? Log in"));
    }

    public SelenideElement getEmailLoginOption(){
        return $x("//*[@id='login-option-username']");
    }

    public SelenideElement getEmailEntryInputField(){
        return $x("//*[@id='login.username']");
    }

    public SelenideElement getContinueButton(){
        return $x("//*[@id='btn-continue' or text()='Continue']");
    }

    public SelenideElement getPasswordCard(){
        return $x("//*[@id='password-card']");
    }

    public SelenideElement getPasswordEntryInputField(){
        return $x("//*[@id='login-password-entry' or @id='register-password-entry']");
    }

    public SelenideElement getPasswordEntryLoginButton(){
        return $x("//*[@id='password-entry-login-button']");
    }

    public SelenideElement getCreateButtonButton(){
        return $x("//*[@id='btn-create-account']");
    }

    public SelenideElement getTodoListScreen(){
        return $x("//*[@id='todo-list-screen']");
    }

    public SelenideElement getRegisterTermsCheckbox(){
        return $x("//*[@id='register-terms-checkbox']");
    }
    
}