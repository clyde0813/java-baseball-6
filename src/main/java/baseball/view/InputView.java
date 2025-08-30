package baseball.view;

import baseball.exception.CommonMessage;
import baseball.exception.ErrorMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputNumber() {
        System.out.print(CommonMessage.GAME_INPUT_NUMBER.getMessage());
        return Console.readLine();
    };

    public static boolean checkRestart() {
        String input = Console.readLine();

        if(!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_RESTART.getMessage());
        }

        return input.equals("1");
    };
}
