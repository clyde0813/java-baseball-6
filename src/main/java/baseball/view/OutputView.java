package baseball.view;

import baseball.domain.Result;
import baseball.constant.CommonMessage;

public class OutputView {
    
    public static void printGameStart() {
        System.out.println(CommonMessage.GAME_START.getMessage());
    };

    public static void printGameEnd() {
        System.out.println(CommonMessage.GAME_END.getMessage());
    };

    public static void printGameResult(Result result) {
        System.out.println(result.toString());
    };
}
