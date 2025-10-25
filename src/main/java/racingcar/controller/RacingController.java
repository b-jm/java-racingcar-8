package racingcar.controller;

import racingcar.domain.Rounds;
import racingcar.view.Input;

public class RacingController {
    private final Input input = new Input();

    public void run() {
       String rawCount = input.inputTryCount();
       Rounds rounds = new Rounds(rawCount);
    }
}
