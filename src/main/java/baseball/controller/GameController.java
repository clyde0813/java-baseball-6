package baseball.controller;

import java.util.List;

import baseball.domain.Numbers;
import baseball.domain.Result;
import baseball.service.NumberGenerator;
import baseball.service.JudgementService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    
    private final NumberGenerator numberGenerator;
    private final JudgementService judgementService;
    private final InputView inputView;
    
    public GameController(NumberGenerator numberGenerator, JudgementService judgementService, InputView inputView) {
        this.numberGenerator = numberGenerator;
        this.judgementService = judgementService;
        this.inputView = inputView;
    }

    public void run() {
        OutputView.printGameStart();
        boolean restartStatus = true;

        while(restartStatus) {
            List<Integer> answer = numberGenerator.generateNumbers();
            play(answer);
            restartStatus = inputView.checkRestart();
        }
    }

    private void play(List<Integer> answer) {
        while(true) {
            String input = inputView.inputNumber();
            Numbers numbers = Numbers.createNumbers(input);
            Result result = judgementService.judge(answer, numbers);
            OutputView.printGameResult(result);

            if(result.isEnd()) break;
        }
        
        OutputView.printGameEnd();
    }
}
