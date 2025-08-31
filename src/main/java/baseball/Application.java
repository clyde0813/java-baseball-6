package baseball;

import baseball.controller.GameController;
import baseball.service.JudgementServiceV0Impl;
import baseball.service.NumberGeneratorV0Impl;
import baseball.view.ConsoleInput;
import baseball.view.ConsoleInputV0Impl;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInputV0Impl();
        GameController controller = new GameController(
            new NumberGeneratorV0Impl(),
            new JudgementServiceV0Impl(),
            new InputView(consoleInput)
        );

        controller.run();
    }
}
