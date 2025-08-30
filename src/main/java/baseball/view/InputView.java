package baseball.view;

import baseball.constant.CommonMessage;
import baseball.constant.ErrorMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    
    public static String inputNumber() {
        System.out.print(CommonMessage.GAME_INPUT_NUMBER.getMessage());
        return Console.readLine();
    };

    public static boolean checkRestart() {
        System.out.println(CommonMessage.GAME_RESTART.getMessage());
        String input = Console.readLine();

        if(!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_RESTART.getMessage());
        }

        return input.equals("1");
    };
}
