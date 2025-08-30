package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ResultTest {
    @Test
    void testGetBalls() {
        Result result = new Result(2, 3);
        assertThat(result.getBalls()).isEqualTo(3);
    }

    @Test
    void testGetStrikes() {
        Result result = new Result(2, 3);
        assertThat(result.getStrikes()).isEqualTo(2);
    }

    @Test
    void testIsEnd() {
        Result result = new Result(3, 0);
        assertThat(result.isEnd()).isTrue();
    }

    @Test
    void testToString1() {
        Result result = new Result(2, 3);
        assertThat(result.toString()).isEqualTo("3볼 2스트라이크");
    }

    @Test
    void testToString2() {
        Result result = new Result(0, 3);
        assertThat(result.toString()).isEqualTo("3볼");
    }

    @Test
    void testToString3() {
        Result result = new Result(2, 0);
        assertThat(result.toString()).isEqualTo("2스트라이크");
    }

    @Test
    void testToString4() {
        Result result = new Result(0, 0);
        assertThat(result.toString()).isEqualTo("낫싱");
    }
}
