package baseball.view;

import java.util.ArrayList;
import java.util.List;

import baseball.exception.ErrorMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputNumber() {
        return Console.readLine();
    };

    public boolean checkRestart() {
        String input = Console.readLine();

        if(!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_RESTART.getMessage());
        }

        return input.equals("1");
    };
}
