package baseball.Model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class GeneratorNumber implements Generator {

    @Override
    public void generate() {
        List<Integer> pickNumbers = new ArrayList<>();
        while (pickNumbers.size() < 3) {
            int check = Randoms.pickNumberInRange(START_INDEX, END_INDEX);
            if (!pickNumbers.contains(check)) {
                pickNumbers.add(check);
            }
        }
    }
}
