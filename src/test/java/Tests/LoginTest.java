package Tests;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static helper.KeyboardHelper.enterKeyBoard;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Before
    public void setUp() {
        Selenide.open("https://higi-qa-kiosk-app.azurewebsites.net/");
    }

    @Test
    public void testLogin() {
        loginPage.getGetStartedButton().shouldBe(visible, Duration.ofSeconds(30)).click();
        loginPage.getAlreadyHaveAccountLogInLink().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getEmailLoginOption().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getEmailEntryInputField().shouldBe(visible, Duration.ofSeconds(10));
        enterKeyBoard("bvbv@higi.io");
        loginPage.getContinueButton().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getPasswordCard().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getPasswordEntryInputField().shouldBe(visible, Duration.ofSeconds(10));
        enterKeyBoard("qqqqqq");
        loginPage.getPasswordEntryLoginButton().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getTodoListScreen().shouldBe(visible, Duration.ofSeconds(30));
    }

    @Test
    public void testRegistration() {
        loginPage.getGetStartedButton().shouldBe(visible, Duration.ofSeconds(30)).click();
        loginPage.getContinueButton().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getEmailEntryInputField().shouldBe(visible, Duration.ofSeconds(10));
        enterKeyBoard("kkjhcggjgh@fsdfdfsdfs.fsdsd");
        loginPage.getContinueButton().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getPasswordEntryInputField().shouldBe(visible, Duration.ofSeconds(10));
        enterKeyBoard("qqqqqq");
        loginPage.getRegisterTermsCheckbox().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getCreateButtonButton().shouldBe(visible, Duration.ofSeconds(10)).click();
        loginPage.getTodoListScreen().shouldBe(visible, Duration.ofSeconds(30));
    }


    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
