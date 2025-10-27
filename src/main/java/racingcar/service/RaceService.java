package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Race;

import java.util.List;

public class RaceService {

    private final Race race;

    public RaceService(Race race) {
        this.race = race;
    }

    public void runSingleRound() {
        race.runSingleRound();
    }

    public List<Car> getWinners() {
        return race.findWinners();
    }
}
