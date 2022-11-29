package baseball.view;

import baseball.validator.Validator;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {

    OutputView outputView = new OutputView();
    Validator validator = new Validator();

    // 사용자 값 입력받기
    public List<Integer> userNumber(List<Integer> userNumber) {
        outputView.inputNumPrint();
        String userInput = Console.readLine();
        validator.validateNumberInput(userInput);
        String[] userNumberArr = userInput.split("");
        for (int i = 0; i < userNumberArr.length; i++) {
            userNumber.add(Integer.parseInt(userNumberArr[i]));
        }
        return userNumber;
    }

    // 게임 재시작 여부 입력받기
    public int restartGame(int gamePlay) {
        outputView.askRestart();
        String input = Console.readLine();
        validator.checkInteger(input);
        gamePlay = Integer.parseInt(input);
        validator.checkOneTwo(gamePlay);
        return gamePlay;
    }

}
