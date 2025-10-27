package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("자동차 이름이 5자 이상이면 예외가 발생한다.")
    void nameTooLong_throwsException() {
        assertThatThrownBy(() -> new Car("abcdef"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 5자 이하만 가능합니다.");
    }

    @Test
    @DisplayName("자동차 이름이 공백 문자열이면 예외가 발생한다.")
    void nameBlank_throwsException() {
        assertThatThrownBy(() -> new Car(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 빈 값을 입력할 수 없습니다.");
    }

    @Test
    @DisplayName("자동차 이름이 비어 있으면 예외가 발생한다.")
    void nameEmpty_throwsException() {
        assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 빈 값을 입력할 수 없습니다.");
    }

    @Test
    @DisplayName("자동차 이름이 유효하면 정상적으로 생성된다.")
    void validName_createsCar() {
        Car car = new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getPosition()).isZero();
    }

    @Test
    @DisplayName("랜덤 숫자가 4 이상이면 자동차가 전진한다.")
    void move_whenRandomNumberGreaterOrEqual4() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("랜덤 숫자가 4 미만이면 자동차가 이동하지 않는다.")
    void move_whenRandomNumberLessThan4() {
        Car car = new Car("crong");
        car.move(3);
        assertThat(car.getPosition()).isZero();
    }

    @Test
    @DisplayName("자동차의 출력 문자열이 이름과 '-'로 구성된다.")
    void toResultString_formatCheck() {
        Car car = new Car("pobi");
        car.move(5); // 전진
        assertThat(car.toResultString()).isEqualTo("pobi : -");
    }

    @Test
    @DisplayName("자동차의 위치가 최대 위치와 같으면 우승자이다.")
    void isWinner_true() {
        Car car = new Car("pobi");
        car.move(5);
        assertThat(car.isWinner(1)).isTrue();
    }

    @Test
    @DisplayName("자동차의 위치가 최대 위치와 다르면 우승자가 아니다.")
    void isWinner_false() {
        Car car = new Car("crong");
        car.move(2);
        assertThat(car.isWinner(3)).isFalse();
    }
}
