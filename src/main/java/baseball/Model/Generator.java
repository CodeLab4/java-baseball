package baseball.Model;

import java.util.List;

public interface Generator {
    public static final int START_INDEX = 1;
    public static final int END_INDEX = 9;
    List<Integer> generate();
}
