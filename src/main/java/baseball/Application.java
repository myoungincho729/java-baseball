package baseball;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameRunner gameRunner = new GameRunner(new Computer());
        gameRunner.startGame();
    }
}
