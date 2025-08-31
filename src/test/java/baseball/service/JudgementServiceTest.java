package baseball.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.domain.Numbers;
import baseball.domain.Result;

public class JudgementServiceTest {

    public final JudgementService judgementService = new JudgementServiceV0Impl();

    @Test
    @DisplayName("정상 판별 테스트 - 3스트라이크")
    void testJudgeValid1() {
        List<Integer> answer = Arrays.asList(1, 2, 3);
        Numbers numbers = Numbers.createNumbers("123");

        Result result = judgementService.judge(answer, numbers);
        assertThat(result.getStrikes()).isEqualTo(3);
        assertThat(result.getBalls()).isEqualTo(0);
        assertThat(result.isEnd()).isTrue();
        assertThat(result.toString()).isEqualTo("3스트라이크");
    }

    @Test
    @DisplayName("정상 판별 테스트2 - 3볼")
    void testJudgeValid2() {
        List<Integer> answer = Arrays.asList(1, 2, 3);
        Numbers numbers = Numbers.createNumbers("231");

        Result result = judgementService.judge(answer, numbers);
        assertThat(result.getStrikes()).isEqualTo(0);
        assertThat(result.getBalls()).isEqualTo(3);
        assertThat(result.isEnd()).isFalse();
        assertThat(result.toString()).isEqualTo("3볼");
    }

    @Test
    @DisplayName("정상 판별 테스트3 - 낫싱")
    void testJudgeValid3() {
        List<Integer> answer = Arrays.asList(1, 2, 3);
        Numbers numbers = Numbers.createNumbers("456");

        Result result = judgementService.judge(answer, numbers);
        assertThat(result.getStrikes()).isEqualTo(0);
        assertThat(result.getBalls()).isEqualTo(0);
        assertThat(result.isEnd()).isFalse();
        assertThat(result.toString()).isEqualTo("낫싱");
    }
}
