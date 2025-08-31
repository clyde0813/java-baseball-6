package baseball.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.constant.ErrorMessage;

// MockitoExtension 사용 불가 - 우테코 제공 라이브러리에 없음
public class InputViewTest {

    @Test
    @DisplayName("재시작 - 1 입력 True")
    void testCheckRestartValidTrue() {
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        when(consoleInput.readLine()).thenReturn("1");

        InputView inputView = new InputView(consoleInput);
        boolean result = inputView.checkRestart();

        assertThat(result).isTrue();
        verify(consoleInput, times(1)).readLine();
    }

    @Test
    @DisplayName("재시작 - 2 입력 False")
    void testCheckRestartValidFalse() {
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        when(consoleInput.readLine()).thenReturn("2");

        InputView inputView = new InputView(consoleInput);
        boolean result = inputView.checkRestart();

        assertThat(result).isFalse();
        verify(consoleInput, times(1)).readLine();
    }

    @Test
    @DisplayName("재시작 - 3 입력 예외")
    void testCheckRestartInvalid() {
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        when(consoleInput.readLine()).thenReturn("3");

        InputView inputView = new InputView(consoleInput);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> inputView.checkRestart());
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.INVALID_RESTART.getMessage());
        verify(consoleInput, times(1)).readLine();
    }

    @Test
    @DisplayName("숫자 입력")
    void testInputNumber() {
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        when(consoleInput.readLine()).thenReturn("123");

        InputView inputView = new InputView(consoleInput);
        String result = inputView.inputNumber();

        assertThat(result).isEqualTo("123");
        verify(consoleInput, times(1)).readLine();
    }
}
