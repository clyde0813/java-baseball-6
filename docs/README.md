# 미션 - 숫자 야구

- 용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

### 입력

- 서로 다른 3자리의 수 1~9
- 게임이 끝난 경우 재시작/종료를 구분하는 1과 2 중 하나의 수
- 123, 145 등등
- 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.

### 출력
- 숫자 야구 게임을 시작합니다.
- 숫자를 입력해주세요 :
- ?볼 ?스트라이크
- 낫싱
- 3개의 숫자를 모두 맞히셨습니다! 게임 종료
- 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.

### 구조 설계
- controller
    - GameController
- service
    - GenerateNumber
    - JudgeResult
- domain
    - Numbers
        - Numbers
        - createNumbers - String -> Numbers
        - get - index -> get value
        - 
    - Result
- view
    - InputView
        - inputNumber - List<Integer>
        - checkRetart - boolean
    - OutputView
        - printGameStart - void
        - printGameEnd - void
        - printGameResult - void
        - 