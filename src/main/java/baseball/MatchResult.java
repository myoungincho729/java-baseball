package baseball;

public class MatchResult {
    private int ball;
    private int strike;

    public MatchResult() {
        this.ball = 0;
        this.strike = 0;
    }

    public void addBall() {
        this.ball++;
    }

    public void addStrike() {
        this.strike++;
    }

    public String toString() {
        String ball = "";
        String strike = "";
        if (this.ball == 0 && this.strike == 0) {
            return "낫싱";
        }
        if (this.ball > 0) {
            ball = this.ball + "볼";
        }
        if (this.strike > 0) {
            strike = this.strike + "스트라이크";
        }
        if (ball.equals("")) {
            return strike;
        }
        return String.format("%s %s", ball, strike);
    }

    public boolean isWin() {
        return strike == 3;
    }
}
