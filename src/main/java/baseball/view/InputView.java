package baseball.view;

import baseball.constant.CommonMessage;
import baseball.constant.ErrorMessage;

public class InputView {
    
    private final ConsoleInput consoleInput;

    public InputView(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public String inputNumber() {
        System.out.print(CommonMessage.GAME_INPUT_NUMBER.getMessage());
        return consoleInput.readLine();
    };

    public boolean checkRestart() {
        System.out.println(CommonMessage.GAME_RESTART.getMessage());
        String input = consoleInput.readLine();

        if(!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_RESTART.getMessage());
        }

        return input.equals("1");
    };
}
