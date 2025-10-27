package racingcar.domain;

import java.util.List;

public class Race {
    private final Cars cars;
    private final Rounds rounds;

    public Race(Cars cars, Rounds rounds) {
        this.cars = cars;
        this.rounds = rounds;
    }

    public void runSingleRound() {
        cars.moveAllCars();
    }

    public List<Car> findWinners() {
        return cars.findWinners();
    }

    public List<Car> getCurrentCars() {
        return cars.getCars();
    }

    public int getRoundCount() {
        return rounds.getCount();
    }
}
