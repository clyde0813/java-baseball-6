package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import baseball.exception.ErrorMessage;

public class Numbers {

    private final List<Integer> values;

    // 비즈니스 검증 책임 - 3자리 교차 검증, 중복 검증
    private Numbers(List<Integer> values) {
        if(values.size() != 3) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_LENGTH.getMessage());
        }

        if(new HashSet<Integer>(values).size() != 3) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATE_NOT_ALLOWED.getMessage());
        }
        
        this.values = values;
    }

    // 입력 검증 책임 - 3자리 검증, 0 입력 검증
    public static Numbers createNumbers(String input) {
        if(input.length() != 3) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_LENGTH.getMessage());
        }

        List<Integer> list = new ArrayList<>();

        for(char c : input.toCharArray()) {
            if(!Character.isDigit(c)) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER.getMessage());
            }
            if((c - '0') == 0) {
                throw new IllegalArgumentException(ErrorMessage.ZERO_NOT_ALLOWED.getMessage());
            }

            list.add(c - '0');
        }
        
        return new Numbers(list);
    }

    // 인덱스로 value 구하기
    public int get(int index) {
        return values.get(index);
    }

    // value 포함 여부
    public boolean contains(int value) {
        return values.contains(value);
    }
}