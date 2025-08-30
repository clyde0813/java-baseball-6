package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.constant.ErrorMessage;

public class NumbersTest {
    @Test
    @DisplayName("정상 입력 테스트")
    void testCreateNumbersValid() {
        Numbers numbers = Numbers.createNumbers("123");
        
        assertThat(numbers.get(0)).isEqualTo(1);
        assertThat(numbers.get(1)).isEqualTo(2);
        assertThat(numbers.get(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("길이 이상 테스트")
    void testCreateNumberInvalidWithLength() {
        IllegalArgumentException e = assertThrows(
            IllegalArgumentException.class, () -> Numbers.createNumbers("1234"));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.INVALID_LENGTH.getMessage());
    }

    @Test
    @DisplayName("0 포함 입력 테스트")
    void testCreateNumberInvalidWithZero() {
        IllegalArgumentException e = assertThrows(
            IllegalArgumentException.class, () -> Numbers.createNumbers("012"));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.ZERO_NOT_ALLOWED.getMessage());
    }

    @Test
    @DisplayName("중복 입력 테스트")
    void testCreateNumberInvalidWithDuplicate() {
        IllegalArgumentException e = assertThrows(
            IllegalArgumentException.class, () -> Numbers.createNumbers("112"));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.DUPLICATE_NOT_ALLOWED.getMessage());
    }

    @Test
    @DisplayName("숫자가 아닌 문자 입력 테스트")
    void testCreateNumberInvalidWithNonNumber() {
        IllegalArgumentException e = assertThrows(
            IllegalArgumentException.class, () -> Numbers.createNumbers("12a"));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.INVALID_NUMBER.getMessage());
    }

    @Test
    @DisplayName("인덱스 get 테스트")
    void testGet() {
        Numbers numbers = Numbers.createNumbers("123");
        assertThat(numbers.get(0)).isEqualTo(1);
        assertThat(numbers.get(1)).isEqualTo(2);
        assertThat(numbers.get(2)).isEqualTo(3);
    }
}
