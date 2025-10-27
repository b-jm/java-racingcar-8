package racingcar.domain;

import static racingcar.constant.ErrorMessage.*;

public class Rounds {

    private final int count;

    public Rounds(String rawCount) {
        this.count = parseToInt(rawCount);
        validatePositive(count);
    }

    private int parseToInt(String rawCount) {
        try {
            return Integer.parseInt(rawCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_ROUND_NOT_POSITIVE);
        }
    }

    private void validatePositive(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(ERROR_ROUND_NOT_NUMBER);
        }
    }

    public int getCount() {
        return count;
    }
}
