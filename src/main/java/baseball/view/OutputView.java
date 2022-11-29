package baseball.view;


public class OutputView {

    // 게임을 시작합니다 출력
    public void startGame() {
        System.out.println(BaseballConstant.GameStart.getValue());
    }

    // 숫자를 입력해주세요 출력
    public void inputNumPrint() {
        System.out.println(BaseballConstant.UserInput.getValue());
    }

    // 결과 출력
    public void printResult(int strikeCount, int ballCount) {
        if (strikeCount == 0) {
            whenStrikeZero(strikeCount, ballCount);
        }
        if (strikeCount != 0) {
            whenStrikeNotZero(strikeCount, ballCount);
        }
    }

    // 스트라이크만 있을 시 출력
    public void printStrike(int strikeCount) {
        System.out.println(strikeCount + BaseballConstant.StrikeConstant.getValue());
        if (strikeCount == 3) {
            System.out.println(BaseballConstant.GameFinish.getValue());
        }
    }

    // 볼만 있을 시 출력
    public void printBall(int ballCount) {
        System.out.println(ballCount + BaseballConstant.BallConstant.getValue());
    }

    // 볼, 스트라이크 출력
    public void printBallStrike(int strikeCount, int ballCount) {
        System.out.println(ballCount + BaseballConstant.BallConstant.getValue() + " " + strikeCount
                + BaseballConstant.StrikeConstant.getValue());
    }

    // 0볼 0스트라이크 -> 낫싱
    public void printNothing() {
        System.out.println(BaseballConstant.Nothing.getValue());
    }

    // 게임 재시작 여부 물어보기
    public void askRestart() {
        System.out.println(BaseballConstant.GameRestart.getValue());
    }

    public void whenStrikeZero(int strikeCount, int ballCount) {
        if (ballCount == 0) {
            printNothing();
        }
        if (ballCount != 0) {
            printBall(ballCount);
        }
    }

    public void whenStrikeNotZero(int strikeCount, int ballCount) {
        if (ballCount != 0) {
            printBallStrike(strikeCount, ballCount);
        }
        if (ballCount == 0) {
            printStrike(strikeCount);
        }
    }
}
