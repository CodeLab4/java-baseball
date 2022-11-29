package baseball.Controller;

import baseball.Model.Generator;
import baseball.Model.GeneratorNumber;

public class BaseballController {
    private final Generator generator = new GeneratorNumber();

    public void a() {
        generator.generate();
    }


}
