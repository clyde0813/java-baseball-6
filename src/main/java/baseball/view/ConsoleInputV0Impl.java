package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleInputV0Impl implements ConsoleInput {
    
    @Override
    public String readLine() {
        return Console.readLine();
    }
}
