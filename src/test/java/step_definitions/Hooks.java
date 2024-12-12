package step_definitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        Selenide.open("https://higi-qa-kiosk-app.azurewebsites.net/");
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
