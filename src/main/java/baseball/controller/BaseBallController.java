package baseball.controller;

import baseball.model.CompareBaseball;
import baseball.model.NumberGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.ArrayList;
import java.util.List;

public class BaseBallController {

    private static int strikeCount = 0;
    private static int ballCount = 0;
    private int gamePlay = 0;
    List<Integer> computerNumber = new ArrayList<>();

    NumberGenerator numberGenerator;
    OutputView outputView;
    InputView inputView;
    CompareBaseball compareBaseball;

    public BaseBallController(NumberGenerator numberGenerator, OutputView outputView, InputView inputView, CompareBaseball compareBaseball) {
        this.numberGenerator = numberGenerator;
        this.outputView = outputView;
        this.inputView = inputView;
        this.compareBaseball = compareBaseball;
    }

    public void gameStart() {
        outputView.startGame();
        startGame();
    }

    public void startGame() {
        while (gamePlay != 2) {
            initializationCount();
            computerNumber = numberGenerator.computerNum(computerNumber);
            while (strikeCount != 3) {
                doGame(computerNumber);
            }
            gamePlay = inputView.restartGame(gamePlay);
        }
    }

    public static void initializationCount() {
        ballCount = 0;
        strikeCount = 0;
    }

    public void doGame(List<Integer> computerNumber) {
        List<Integer> userNumber = new ArrayList<>();
        ballCount = 0;
        strikeCount = 0;
        inputView.userNumber(userNumber);

        strikeCount = compareBaseball.checkStrike(computerNumber, userNumber, strikeCount);
        ballCount = compareBaseball.checkBall(computerNumber, userNumber, ballCount);
        outputView.printResult(strikeCount, ballCount);
    }

}
