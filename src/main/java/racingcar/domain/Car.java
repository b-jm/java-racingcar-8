package racingcar.domain;

import static racingcar.constant.ErrorMessage.*;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MOVE_CONDITION_NUMBER = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        validateNameLength(name);
        validateNoBlank(name);
        validateNoEmpty(name);
    }

    private void validateNameLength(String name) {
        if (name.length() >= MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_TOO_LONG);
        }
    }

    private void validateNoBlank(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_BLANK);
        }
    }

    private void validateNoEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_EMPTY);
        }
    }

    public void move(int randomNumber) {
        if(randomNumber >= MOVE_CONDITION_NUMBER) {
            position++;
        }
    }

    public String toResultString() {
        return name + " : " + "-".repeat(position);
    }

    public boolean isWinner(int maxPosition) {
        return position == maxPosition;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
