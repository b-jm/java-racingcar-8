package racingcar.fake;

import racingcar.domain.NumberGenerator;

public class FakeNumberGenerator implements NumberGenerator {
    private final int fixedNumber;

    public FakeNumberGenerator(int fixedNumber) {
        this.fixedNumber = fixedNumber;
    }

    @Override
    public int pickNumber() {
        return fixedNumber;
    }
}
