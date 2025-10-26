package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.NumberGenerator;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public int pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
