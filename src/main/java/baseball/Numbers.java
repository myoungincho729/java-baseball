package baseball;

import java.util.List;

public class Numbers {
    private List<Integer> numbers;
    private List<Integer> userNumbers;

    public Numbers(List<Integer> newNumbers) {
        this.numbers = newNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public MatchResult compareNumbers() {
        MatchResult matchResult = new MatchResult();
        for (int index = 0; index < userNumbers.size(); index++) {
            checkBallAndStrike(index, userNumbers.get(index), matchResult);
        }
        return matchResult;
    }

    private void checkBallAndStrike(int index, Integer integer, MatchResult matchResult) {
        for (int numberIdx = 0; numberIdx < numbers.size(); numberIdx++) {
            if (numbers.get(numberIdx) != integer) {
                continue;
            }
            if (index == numberIdx) {
                matchResult.addStrike();
            }
            if (index != numberIdx) {
                matchResult.addBall();
            }
        }
    }
}
