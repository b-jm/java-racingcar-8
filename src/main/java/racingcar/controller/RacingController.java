package racingcar.controller;

import racingcar.domain.*;
import racingcar.service.RaceService;
import racingcar.util.RandomNumberGenerator;
import racingcar.view.Input;
import racingcar.view.Output;

import java.util.List;

public class RacingController {
    private final Input input;
    private final Output output;
    private final NumberGenerator numberGenerator;

    public RacingController() {
        this.input = new Input();
        this.output = new Output();
        this.numberGenerator = new RandomNumberGenerator();
    }

    public void run() {
        Cars cars = setupCars();
        Rounds rounds = setupRounds();

        Race race = new Race(cars, rounds);
        RaceService raceService = new RaceService(race);

        output.printResultTitle();
        int roundCount = race.getRoundCount();

        for (int i = 0; i < roundCount; i++) {
            raceService.runSingleRound();
            output.printCarsStatus(race.getCurrentCars());
        }

        List<Car> winners = raceService.getWinners();
        output.printWinners(winners);
    }

    private Cars setupCars() {
        String rawNames = input.inputCarNames();

        return new Cars(rawNames, numberGenerator);
    }

    private Rounds setupRounds() {
        String rawCount = input.inputTryCount();

        return new Rounds(rawCount);
    }

}
