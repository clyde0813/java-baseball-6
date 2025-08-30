package baseball.service;

import java.util.List;

import baseball.domain.Numbers;
import baseball.domain.Result;

public class JudgementService {
    
    public static Result judge(List<Integer> answer, Numbers numbers) {
        int strikes = 0;
        int balls = 0;

        for(int i=0; i<answer.size(); i++) {
            int answerNumber = answer.get(i);
            if(answerNumber == numbers.get(i)) {
                strikes++;
                continue;
            }

            if(numbers.contains(answerNumber)) {
                balls++;
            }
        }

        return new Result(strikes, balls);
    }
}
