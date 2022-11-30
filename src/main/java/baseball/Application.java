package baseball;

import baseball.Controller.BaseballController;
import baseball.Model.GeneratorNumber;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseballController baseballController = new BaseballController(new GeneratorNumber());
        baseballController.game();

    }
}
