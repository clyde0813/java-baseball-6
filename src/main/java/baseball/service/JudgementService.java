package baseball.service;

import java.util.List;

import baseball.domain.Numbers;
import baseball.domain.Result;

public interface JudgementService {
    
    public Result judge(List<Integer> answer, Numbers numbers);
}
