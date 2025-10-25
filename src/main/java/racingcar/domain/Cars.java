package racingcar.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static racingcar.constant.ErrorMessage.*;

public class Cars {
    private static final int MINIMUMSIZE_CARS_COUNT = 2;

    private List<Car> cars;

    public Cars(String rawNames) {
        List<String> carNames = parseNames(rawNames);
        validateList(carNames);
        this.cars = carNames.stream()
                .map(name -> new Car(name))
                .toList();
    }

    private List<String> parseNames(String rawNames) {
        return Arrays.stream(rawNames.split(",")).toList();
    }

    private void validateList(List<String> names) {
        validateMinimumSize(names);
        validateDuplicates(names);
    }

    private void validateMinimumSize(List<String> names) {
        if (names.size() < MINIMUMSIZE_CARS_COUNT) {
            throw new IllegalArgumentException(ERROR_CAR_COUNT_TOO_SMALL);
        }
    }

    private void validateDuplicates(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        if (uniqueNames.size() != names.size()) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_DUPLICATE);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
