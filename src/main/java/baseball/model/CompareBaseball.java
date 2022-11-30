package baseball.model;

import baseball.validator.Validator;
import java.util.List;

public class CompareBaseball {

    final int INPUT_LENGTH = 3;

    Validator validator = new Validator();

    // 스트라이크 카운트 체크
    public int checkStrike(List<Integer> computerNumber, List<Integer> userNumber, int strikeCount) {
        for (int i = 0; i < INPUT_LENGTH; i++) {
            if (computerNumber.get(i).equals(userNumber.get(i))) {
                strikeCount++;
            }
        }
        validator.checkStrikeCountRange(strikeCount);
        return strikeCount;
    }

    //볼카운트 체크
    public int checkBall(List<Integer> computerNumber, List<Integer> userNumber, int ballCount) {
        for (int i = 0; i < computerNumber.size(); i++) {
            if(computerNumber.get(i) == userNumber.get(i)){
                ballCount--;
            }
        }
        userNumber.retainAll(computerNumber);
        ballCount += userNumber.size();
        return ballCount;
    }

}
