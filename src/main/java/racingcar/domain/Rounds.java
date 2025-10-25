package racingcar.domain;

import java.math.BigInteger;

import static racingcar.constant.ErrorMessage.ERROR_ROUND_NOT_POSITIVE;

public class Rounds {

    public Rounds(String rawCount) {
        BigInteger count = parseToInt(rawCount);
    }

    private BigInteger parseToInt(String rawCount) {
        try {
            return new BigInteger(rawCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_ROUND_NOT_POSITIVE);
        }
    }
}
