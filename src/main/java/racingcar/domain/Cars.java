package racingcar.domain;

import java.util.Arrays;
import java.util.List;

import static racingcar.constant.ErrorMessage.*;

public class Cars {

    public Cars(String rawNames) {
        List<String> carNames = parseNames(rawNames);
    }

    private List<String> parseNames(String rawNames) {
        return Arrays.stream(rawNames.split(",")).toList();
    }

    
}
