package baseball.View;

import java.util.List;

public class OutputView {
    static final int FIRST_IDX = 0;
    static final int SECOND_IDX = 1;

    public void progressPrint(List<Integer> compareResult) {
        if(compareResult.get(FIRST_IDX) == 0 && compareResult.get(SECOND_IDX) == 0) {
            System.out.println("낫싱");
            return;
        }
        if(compareResult.get(FIRST_IDX) > 0 && compareResult.get(SECOND_IDX) > 0) {
            System.out.println(compareResult.get(FIRST_IDX) + "볼 " + compareResult.get(SECOND_IDX) + "스트라이크");
        }
        if(compareResult.get(FIRST_IDX) == 0 && compareResult.get(SECOND_IDX) > 0) {
            System.out.println(compareResult.get(SECOND_IDX) + "볼");
            return;
        }
        if(compareResult.get(FIRST_IDX) > 0 && compareResult.get(SECOND_IDX) == 0) {
            System.out.println(compareResult.get(FIRST_IDX) + "스트라이크");
        }
    }

    public enum messageList {
        START_MESSAGE("숫자 야구 게임을 시작합니다."),
        INPUT_MESSAGE("숫자를 입력해 주세요 : "),
        END_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료" +"\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        private final String message;

        messageList(String message) {
            this.message = message;
        }

        public void messagePrint() {
            System.out.println(message);
        }

        public void inputMessagePrint() {
            System.out.print(message);
        }

        public void endMessagePrint() {
            System.out.println();
            System.out.print(message);
        }
    }
}
