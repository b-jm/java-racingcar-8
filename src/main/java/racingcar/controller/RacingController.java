package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.Rounds;
import racingcar.view.Input;

public class RacingController {
    private final Input input = new Input();

    public void run() {
        String rawNames = input.inputCarNames();
        Cars cars = new Cars(rawNames);


        String rawCount = input.inputTryCount();
        Rounds rounds = new Rounds(rawCount);
    }
}
