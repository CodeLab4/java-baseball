package baseball.validator;

import baseball.view.BaseballConstant;

public class Validator {

    public void validateNumberInput(String input) {
        checkLength(input);
        checkInteger(input);
    }

    public void checkLength(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException(
                    BaseballConstant.Error.getValue() + BaseballConstant.LengthError.getValue());
        }
    }

    public void checkInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException(
                    BaseballConstant.Error.getValue() + BaseballConstant.OnlyInteger.getValue());
        }
    }

    public void checkOneTwo(int gamePlay) {
        if (gamePlay != 1 && gamePlay != 2) {
//            System.out.println(BaseballConstant.Error.getValue() + BaseballConstant.OnlyOneTwo.getValue());
            throw new IllegalArgumentException(
                    BaseballConstant.Error.getValue() + BaseballConstant.OnlyOneTwo.getValue());
        }
    }

    public void checkStrikeCountRange(int strikeCount) {
        if(strikeCount > 3 || strikeCount < 0){
            throw new IllegalArgumentException(BaseballConstant.Error.getValue() + BaseballConstant.RangeError.getValue());
        }
    }
    public void checkBallCountRange(int ballCount) {
        if(ballCount > 3 || ballCount < 0){
            throw new IllegalArgumentException(BaseballConstant.Error.getValue() + BaseballConstant.RangeError.getValue());
        }
    }

}
