package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static racingcar.constant.InputMessage.*;

public class Input {

    public String inputCarNames() {
        System.out.println(CAR_NAMES_INPUT_MESSAGE);
        return Console.readLine();
    }


}
