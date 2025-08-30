package baseball.constant;

public enum ErrorMessage {
    INVALID_LENGTH("3개의 숫자를 입력해야 합니다."),
    INVALID_NUMBER("숫자만 입력 가능합니다."),
    ZERO_NOT_ALLOWED("0을 제외한 숫자만 입력 가능합니다."),
    DUPLICATE_NOT_ALLOWED("중복 숫자는 허용되지 않습니다."),
    INVALID_RESTART("1 또는 2만 입력 가능합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

