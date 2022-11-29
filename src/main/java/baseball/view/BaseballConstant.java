package baseball.view;

public enum BaseballConstant {

    GameStart("숫자 야구 게임을 시작합니다."),
    UserInput("숫자를 입력해주세요 : "),
    StrikeConstant("스트라이크"),
    BallConstant("볼"),
    Nothing("낫싱"),
    GameFinish("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    GameRestart("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    Error("[ERROR]"),
    OnlyInteger("숫자만 입력 가능합니다."),
    OnlyOneTwo("1과 2만 입력 가능합니다."),
    LengthError("세 자리 수를 입력해주세요.");

    private final String value;

    BaseballConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
