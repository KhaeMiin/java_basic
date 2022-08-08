# java_basic
자바 기초편 연습

### 객체지향언어 [바로가기](https://github.com/KhaeMiin/java_basic/tree/master/src/ch6#%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5-%EC%96%B8%EC%96%B4)
<br>

### 자바 기초(예외) -  [바로가기](https://github.com/KhaeMiin/java_basic/tree/master/src/ch8#%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%98%A4%EB%A5%98-%EC%98%88%EC%99%B8%ED%81%B4%EB%9E%98%EC%8A%A4-%EA%B7%B8%EB%A6%AC%EA%B3%A0-%EC%98%88%EC%99%B8-%EC%B2%98%EB%A6%AC%ED%95%98%EA%B8%B0)

<br>

### 자바 기초(ch9) - [바로가기](https://github.com/KhaeMiin/java_basic/tree/master/src/ch9)

<br>
참고 강의: 자바의 정석 Ch6 ~ 
<br>

### JAVA 람다식 함수형 인터페이스
<details>
<summary>코드 설명</summary>
<div markdown="1">

> 📝람다식이란 함수를 하나의 식(expression)으로 표현한 것이다.
> 함수를 람다식으로 표현하면 메소드의 이름이 필요 없기 때문에, 익명 함수(Anonymous Function)의 한 종류하고 볼 수 있다.

- 람다식 내에서 사용되는 지역변수는 final이 붙지 않아도 상수로 간주된다. 
- 람다식으로 선언된 변수명은 다른 변수명과 중복될 수 없다.

**장점**
1. 코드를 간결하게 만들 수 있다.
2. 식에 개발자의 의도가 명확히 드러나 가독성이 높아진다.
3. 함수를 만드는 과정없이 한번에 처리할 수 있어 생산성이 높아진다.
4. 병렬프로그래밍이 용이하다.

**단점**
1. 람다를 사용하면서 만든 무명함수는 재사용이 불가능하다.
2. 디버깅이 어렵다.
3. 람다를 남발하면 비슷한 함수가 중복 생성되어 코드가 지저분해질 수 있다.
4. 재귀로 만들경우에 부적합하다.

상황에 따라 필요에 맞는 방법을 사용하자.
<br>

> 함수형 인터페이스에는 추상메서드가 1개만 정의된 인터페이스이다.<br>
> 함수적 인터페이스는 @FunctionalInterface 애노테이션을 붙일 수 있다. 
> <br>@FunctionalInterface 애노테이션은 추상메서드가 1개만 선언되도록 표시하는 것이다. 
> <br>이 어노테이션이 있으면 **인터페이스에 메서드가 2개 이상 선언되면 컴파일 오류가 발생한다.**
> <br> (단, static 메소드와 default 메소드의 개수에는 제약이 없다.)
> <br>애노테이션은 선택사항이다.

👇interface
```java
@FunctionalInterface
```

※ 람다식은 함수적 인터페이스에서 사용한다(o)

👇class
```
// 기존의 방식
반환티입 메소드명 (매개변수, ...) {
    실행문
}

// 람다 방식
(매개변수, ... ) -> { 실행문 ... }
```

</div>
</details>

### Stream API 사용하기 - 기초
<details>
<summary>코드 설명</summary>
<div markdown="1">

> Stream API <br>
> JAVA 8 이후에 추가된 스트림(Stream)은 람다를 활용할 수 있는 기술 중 하나로 
> <br> 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결가를 얻을 수 있습니다.
> <br> 즉, 람다를 이용해 코드의 양을 줄이고 간결하게 배열과 컬렉션을 함수형으로 처리할 수 있습니다.

1. Stream 생성하기
   1. Collection
      컬렉션 타입(Collection, List, Set)의 경우 인터페이스에 추가된 디폴트 메소드 stream 을 이용해서 스트림을 만들 수 있습니다.
        ```java
        // List로부터 스트림을 생성
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
      ```

   2. 배열
      배열의 원소들을 소스로하는 Stream을 생성하기 위해서는 Stream의 of 메소드 또는 Arrays의 stream 메소드를 사용하면 된다.
      ```java
      // 배열로부터 스트림을 생성
      Stream<String> stream = Stream.of("a", "b", "c"); //가변인자
      Stream<String> stream = Stream.of(new String[] {"a", "b", "c"});
      Stream<String> stream = Arrays.stream(new String[] {"a", "b", "c"});
      ```
      
   3. 원시
      
2. Stream 가공하기(중간 연산)
3. Stream 최종 연산(결과 만들기)

</div>
</details>
