package racingcar.domain;

import java.math.BigInteger;

import static racingcar.constant.ErrorMessage.*;

public class Rounds {

    public Rounds(String rawCount) {
        BigInteger count = parseToInt(rawCount);
        validatePositive(count);
    }

    private BigInteger parseToInt(String rawCount) {
        try {
            return new BigInteger(rawCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_ROUND_NOT_POSITIVE);
        }
    }

    private void validatePositive(BigInteger count) {
        if (count.signum() <= 0) {
            throw new IllegalArgumentException(ERROR_ROUND_NOT_NUMBER);
        }
    }
}
