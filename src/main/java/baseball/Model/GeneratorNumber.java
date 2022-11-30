package baseball.Model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class GeneratorNumber implements Generator {

    @Override
    public List<Integer> generate() {
        List<Integer> pickNumbers = new ArrayList<>();
        while (pickNumbers.size() < 3) {
            int check = Randoms.pickNumberInRange(START_INDEX, END_INDEX);
            if (!pickNumbers.contains(check)) {
                pickNumbers.add(check);
            }
        }
        return pickNumbers;
    }

    public static List<Integer> generateList(String input) {
        List<Integer> userList = new ArrayList<>();
        String[] array = input.split("");
        for (int i = 0; i < array.length; i++) {
            userList.add(Integer.parseInt(array[i]));
        }
        return userList;
    }

}
