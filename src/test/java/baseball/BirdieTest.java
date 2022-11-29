package baseball;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import baseball.validator.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BirdieTest {

    Validator validator = new Validator();
    @Test
    @DisplayName("세 개의 수만 입력")

    public void checkLength() {

        assertThatCode(() -> validator.checkLength("123"))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("정수만 입력")
    public void checkInteger() {
        assertThatCode(() -> validator.checkInteger("123"))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("1과 2만 입력")
    public void checkOne() {
        assertThatCode(() -> validator.checkOneTwo(1))
                .doesNotThrowAnyException();
    }
    @Test
    @DisplayName("1과 2만 입력")
    public void checkTwo() {
        assertThatCode(() -> validator.checkOneTwo(2))
                .doesNotThrowAnyException();
    }


}
