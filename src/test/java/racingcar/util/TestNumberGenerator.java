package racingcar.util;

import racingcar.domain.NumberGenerator;

import java.util.List;

public class TestNumberGenerator implements NumberGenerator { // (implements 부분은 동일)
    private final List<Integer> numbers;
    private int index = 0;

    public TestNumberGenerator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public int pickNumber() {
        if (index >= numbers.size()) {
            throw new IndexOutOfBoundsException("TestNumberGenerator의 숫자 목록을 모두 사용했습니다.");
        }
        return numbers.get(index++);
    }
}
