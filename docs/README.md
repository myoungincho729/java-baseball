# 기능 목록

- [ ] 게임 시작시 문구를 출력한다.

    - ```숫자 야구 게임을 시작합니다.```
- [ ] 게임 종료까지 숫자를 입력받는다.

    - ```숫자를 입력해주세요 : 123```
- [ ] 숫자 세 자리 입력시 유니크하지 않으면 종료한다.
- [ ] 숫자가 세 자리가 아니라면 종료한다.
- [ ] 올바른 Unique 숫자라면 비교한다.
- [ ] 비교 결과를 문자열 형태로 출력한다.

    - ```1볼 1스트라이크, 1볼, 낫싱 등```
- [ ] 맞추지 못했을 경우 다음 숫자를 입력받는다.
- [ ] 맞추었을 경우 게임은 종료된다.

    - ```
      3스트라이크
      3개의 숫자를 모두 맞히셨습니다! 게임 종료
      ```
- [ ] 종료 후 재시작(1)/종료(2)를 입력받는다.

    - ```
      게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
      ```
- [ ] 종료 후 입력값이 1, 2 중 하나가 아니라면 종료한다.
- [ ] 재시작시 새로운 숫자를 생성하고 게임을 진행한다.
- [ ] 종료시 프로그램을 종료한다.
---
## 클래스 목록

- ### GameRunner
    
    - 생성자로 ```Computer```객체 주입받음
    - ```start``` 메서드로 게임 시작
- ### Computer

    - 필드값으로 ```Numbers```객체 가짐
    - ```createNewThreeUniqueNumbers```메서드로 새로운 숫자 생성
    - ```checkTwoNumbers```메서드로 두 숫자 비교 후 ```MatchResult```객체를 반환
    - ```getStringResult```메서드로 결과 반환