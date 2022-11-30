package baseball;

import baseball.Controller.BaseballController;

public class Application {
    public static void main(String[] args) {
        while (true) {
            BaseballController baseballController = new BaseballController();
            baseballController.gameStart();
            baseballController.gameProgress();
            if(!baseballController.gameRestart()) {
                break;
            }
        }
    }
}
