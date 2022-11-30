package baseball.Model;

import java.util.ArrayList;
import java.util.List;

public class Comparison {
    public List<Integer> result(List<Integer> computerNumbers, List<Integer> userNumbers) {
        List<Integer> compareResult = new ArrayList<>();
        int ballCount = 0;
        int strikeCount = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (compareBall(computerNumbers, userNumbers.get(i)) && compareStrike(computerNumbers.get(i), userNumbers.get(i))) {
                strikeCount++;
                continue;
            }
            if (compareBall(computerNumbers, userNumbers.get(i))) {
                ballCount++;
            }
        }
        compareResult.add(strikeCount);
        compareResult.add(ballCount);
        return compareResult;
    }

    public boolean compareStrike(int computerNumber, int userNumber) {
        return computerNumber == userNumber;
    }

    public boolean compareBall(List<Integer> computerNumbers, int userNumber) {
        return computerNumbers.contains(userNumber);
    }
}
