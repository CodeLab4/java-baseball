package baseball.Controller;

import baseball.Model.Generator;
import java.util.List;

public class BaseballController {
    private final Generator generator;

    public BaseballController(Generator generator) {
        this.generator = generator;
    }

    public void game() {
        List<Integer> list = generator.generate();

    }


}
