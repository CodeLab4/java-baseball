package baseball;

import baseball.controller.BaseBallController;
import baseball.model.CompareBaseball;
import baseball.model.NumberGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {

        BaseBallController baseBallController = new BaseBallController(new NumberGenerator(), new OutputView(), new InputView(), new CompareBaseball());
        baseBallController.gameStart();

    }
}
