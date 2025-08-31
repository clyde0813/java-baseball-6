package baseball.domain;

import baseball.constant.CommonMessage;

public class Result {

    private final int strikes;
    private final int balls;

    private static final int END_STRIKES = 3;

    public Result(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }

    public boolean isEnd() {
        return strikes == END_STRIKES;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }

    @Override
    public String toString() {
        if(strikes + balls == 0) return CommonMessage.GAME_NOTHING.getMessage();

        StringBuilder sb = new StringBuilder();
        if(balls > 0) sb.append(balls).append(CommonMessage.GAME_BALL.getMessage());
        if(strikes > 0) sb.append(strikes).append(CommonMessage.GAME_STRIKE.getMessage());

        return sb.toString().trim();
    }
}