package baseball.model;

import java.util.List;

public class CompareBaseball {

    final int INPUT_LENGTH = 3;

    // 스트라이크 카운트 체크
    public int checkStrike(List<Integer> computerNumber, List<Integer> userNumber, int strikeCount) {
        for (int i = 0; i < INPUT_LENGTH; i++) {
            if (computerNumber.get(i).equals(userNumber.get(i))) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    //볼카운트 체크
    public int checkBall(List<Integer> computerNumber, List<Integer> userNumber, int ballCount) {
        if (computerNumber.get(0).equals(userNumber.get(1)) || computerNumber.get(0).equals(userNumber.get(2))) {
            ballCount++;
        }
        if (computerNumber.get(1).equals(userNumber.get(0)) || computerNumber.get(1).equals(userNumber.get(2))) {
            ballCount++;
        }
        if (computerNumber.get(2).equals(userNumber.get(0)) || computerNumber.get(2).equals(userNumber.get(1))) {
            ballCount++;
        }
        return ballCount;
    }

}
