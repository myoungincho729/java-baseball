package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.Scanner;

public class GameRunner {
    private final Computer computer;
    private boolean gameRunning = true;

    public GameRunner(Computer computer) {
        this.computer = computer;
    }

    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (gameRunning) {
            computer.createNewUniqueThreeNumbers();
            inputAndCompare();
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String line = Console.readLine();
            if (line.equals("1")) {
                continue;
            } else if (line.equals("2")) {
                gameRunning = false;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    private void inputAndCompare() {
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("숫자를 입력해주세요 : ");
            String userNumbers = Console.readLine();
            List<Integer> inputNumbers = computer.getValidInput(userNumbers);
            MatchResult matchResult = computer.checkNumbersWithUserInput(inputNumbers);
            System.out.println(matchResult.toString());
            if (matchResult.isWin()) {
                isCorrect = true;
            }
        }
    }
}
