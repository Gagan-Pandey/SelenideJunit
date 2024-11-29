package helper;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class KeyboardHelper {
    public static void enterKeyBoard(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                $x("//*[@id='key-abc']").shouldBe(visible, Duration.ofSeconds(5)).click();
                $x("//*[@id='key-"+ input.charAt(i) +"']").shouldBe(visible, Duration.ofSeconds(5)).click();
            }
            else{
                $x("//*[@id='key-123']").shouldBe(visible, Duration.ofSeconds(5)).click();
                $x("//*[@id='key-"+ input.charAt(i) +"']").shouldBe(visible, Duration.ofSeconds(5)).click();
            }
        }
    }
}
