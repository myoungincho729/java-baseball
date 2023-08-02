package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {
    private Numbers numbers;

    public void createNewUniqueThreeNumbers() {
        List<Integer> newNumbers = setRandomNumbers();
        this.numbers = new Numbers(newNumbers);
    }

    private List<Integer> setRandomNumbers() {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            numberSet.add(number);
        }
        return List.copyOf(numberSet);
    }

    public List<Integer> getValidInput(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException();
        }
        int num1 = userInput.charAt(0) - '0';
        int num2 = userInput.charAt(1) - '0';
        int num3 = userInput.charAt(2) - '0';
        if (!(1 <= num1 && num1 <= 9)) {
            throw new IllegalArgumentException();
        }
        if (!(1 <= num2 && num2 <= 9)) {
            throw new IllegalArgumentException();
        }
        if (!(1 <= num3 && num3 <= 9)) {
            throw new IllegalArgumentException();
        }
        if (userInput.charAt(0) == userInput.charAt(1)) {
            throw new IllegalArgumentException();
        }
        if (userInput.charAt(1) == userInput.charAt(2)) {
            throw new IllegalArgumentException();
        }
        if (userInput.charAt(2) == userInput.charAt(0)) {
            throw new IllegalArgumentException();
        }
        return List.of(num1, num2, num3);
    }

    public MatchResult checkNumbersWithUserInput(List<Integer> userNumbers) {
        numbers.setUserNumbers(userNumbers);
        return numbers.compareNumbers();
    }
}
