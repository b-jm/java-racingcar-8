package racingcar.domain;

import static racingcar.constant.ErrorMessage.*;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;

    public Car(String name) {
        validate(name);
    }

    private void validate(String name) {
        validateNameLength(name);
    }

    private void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_TOO_LONG);
        }
    }


}
