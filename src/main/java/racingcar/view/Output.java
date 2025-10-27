package racingcar.view;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

import static racingcar.constant.OutputMessage.*;

public class Output {

    public static final String DISTANCE_UNIT = "-";

    public void printResultTitle() {
        System.out.println(RESULT_TITLE);
    }

    public void printCarsStatus(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + DISTANCE_UNIT.repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(List<Car> winners) {
        String winnersName = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println(WINNER_MESSAGE + winnersName);
    }

}
