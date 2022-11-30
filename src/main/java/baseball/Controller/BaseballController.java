package baseball.Controller;

import baseball.Model.Comparison;
import baseball.Model.Generator;
import baseball.Model.GeneratorNumber;
import baseball.View.InputView;
import baseball.View.OutputView;
import baseball.View.OutputView.messageList;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballController {
    private final Generator generator;
    private final InputView inputView;
    private final OutputView outputView;
    private List<Integer> computerNumbers;
    private final Comparison comparison;

    public BaseballController() {
        this.generator = new GeneratorNumber();
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.comparison = new Comparison();
        this.computerNumbers = generator.generate();
    }

    public void gameStart() {
        messageList.START_MESSAGE.messagePrint();
        messageList.INPUT_MESSAGE.inputMessagePrint();
    }

    public void gameProgress() {
        while (true) {
            String input = inputView.startInput();
            isNull(input);
            List<Integer> userNumbers = GeneratorNumber.generateList(input);
            List<Integer> compareResult = comparison.result(computerNumbers, userNumbers);
            outputView.progressPrint(compareResult);
            if(compareResult.get(0) == 3) {
                break;
            }
        }
    }

    public boolean gameRestart() {
        messageList.END_MESSAGE.endMessagePrint();
        String restartInput = inputView.reStartInput();
        return restartInput.equals("1");
    }

    // 사용자가 빈칸을 입력했을 때 예외 처리하는 메서드
    static void isNull(String inputString) {
        if (inputString.equals("")) {
            throw new IllegalArgumentException("입력된 숫자가 없습니다.");
        }
        isValidSize(inputString);
    }

    // 사용자가 3글자가 아닌 숫자를 입력했을 때 예외 처리하는 메서드
    static void isValidSize(String inputString) {
        if (inputString.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자를 입력해 주세요");
        }
        isValidNumber(inputString);
    }

    // 사용자가 숫자가 아닌 문자열을 입력했을 때 예외 처리하는 메서드
    static void isValidNumber(String inputString) {
        ParsePosition parsePosition = new ParsePosition(0);
        NumberFormat.getInstance().parse(inputString, parsePosition);
        if (inputString.length() != parsePosition.getIndex()) {
            throw new IllegalArgumentException("숫자만 입력해 주세요");
        }
        isContainsZero(inputString);
    }

    // 사용자가 0이 포함된 숫자를 입력했을 때 예외 처리하는 메서드
    static void isContainsZero(String inputString) {
        if (inputString.contains("0")) {
            throw new IllegalArgumentException("1부터 9 사이 숫자만 입력해 주세요");
        }
        isOverLap(inputString);
    }

    // 사용자가 중복된 숫자를 입력했을 때 예외 처리하는 메서드
    static void isOverLap(String inputString) {
        Set<Integer> set = new HashSet<>();
        String[] array = inputString.split("");
        for (int i = 0; i < array.length; i++) {
            set.add(Integer.parseInt(array[i]));
        }
        if (set.size() != 3) {
            throw new IllegalArgumentException("서로 다른 숫자 3개를 입력해 주세요");
        }
    }
}
