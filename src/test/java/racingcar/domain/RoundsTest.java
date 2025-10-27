package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static racingcar.constant.ErrorMessage.*;

class RoundsTest {

    @Test
    @DisplayName("정상적인 숫자 문자열 입력 시 정수로 변환된다.")
    void validNumberInput_parsesCorrectly() {
        Rounds rounds = new Rounds("5");

        assertThat(rounds.getCount()).isEqualTo(5);
    }

    @Test
    @DisplayName("음수 입력 시 예외가 발생한다.")
    void negativeNumber_throwsException() {
        assertThatThrownBy(() -> new Rounds("-3"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ERROR_ROUND_NOT_NUMBER);
    }

    @Test
    @DisplayName("0 입력 시 예외가 발생한다.")
    void zeroInput_throwsException() {
        assertThatThrownBy(() -> new Rounds("0"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ERROR_ROUND_NOT_NUMBER);
    }

    @Test
    @DisplayName("숫자가 아닌 문자열 입력 시 예외가 발생한다.")
    void nonNumericInput_throwsException() {
        assertThatThrownBy(() -> new Rounds("abc"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ERROR_ROUND_NOT_POSITIVE);
    }

    @Test
    @DisplayName("공백 입력 시 예외가 발생한다.")
    void blankInput_throwsException() {
        assertThatThrownBy(() -> new Rounds(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ERROR_ROUND_NOT_POSITIVE);
    }
}

