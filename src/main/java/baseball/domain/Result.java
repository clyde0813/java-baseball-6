package baseball.domain;

public class Result {

    private final int strikes;
    private final int balls;

    public Result(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }

    public boolean isEnd() {
        return strikes == 3;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }

    @Override
    public String toString() {
        if(strikes + balls == 0) return "낫싱";

        StringBuilder sb = new StringBuilder();
        if(balls > 0) sb.append(balls).append("볼 ");
        if(strikes > 0) sb.append(strikes).append("스트라이크 ");

        return sb.toString().trim();
    }
}