package baseball.controller;

import java.util.List;

import baseball.domain.Numbers;
import baseball.domain.Result;
import baseball.service.GenerateNumber;
import baseball.service.JudgementService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    
    public void run() {
        OutputView.printGameStart();
        boolean restartStatus = true;

        while(restartStatus) {
            List<Integer> answer = GenerateNumber.generateNumbers();
            play(answer);
            restartStatus = InputView.checkRestart();
        }
    }

    private void play(List<Integer> answer) {
        while(true) {
            String input = InputView.inputNumber();
            Numbers numbers = Numbers.createNumbers(input);
            Result result = JudgementService.judge(answer, numbers);
            OutputView.printGameResult(result);

            if(result.isEnd()) break;
        }
        
        OutputView.printGameEnd();
    }
}
