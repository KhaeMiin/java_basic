# 객체지향 언어
### **객체지향 언어란?**
프로그래밍 언어 + 객체지향개념(규칙)

---

### **객체 지향언어의 장점**
**1. 코드의 재사용성이 높다.**
	- 다른 개발자가 만든 클래스를 가져와서 이용할 수 있고 상속을 통해 확장해서 사용이 가능하다.
**2. 유지보수가 쉽다.**
	- 수정해야 할 부분이 클래스 내부에 멤버 변수 혹은 메서드로 존재하기 때문에 해당 부분만 수정하면 된다.
**3. 중복 코드 제거**
**4. 대형 프로젝트에 적합**
	- 클래스 단위로 **모듈화**시켜서 개발할 수 있으므로 대형 프로젝트를 여러 명 또는 여러 회사에서 개발할 때 업무 분담하기 쉽다.

**※모듈화?**
-   **모듈** : 소프트웨어 설계에서  **기능단위로 분해하고 추상화 되어 재사용 및 공유 가능한 수준으로 만들어진 단위**
    
-   **모듈화** : **시스템을 분해하고 추상화를 통해 소프트웨어 성능을 향상 시키고 유지보수를 효과적으로 하기 위한 SW 설계 및 구현 기법**

---
### **객체지향언어의 핵심 특징 4가지**
**OOP(Object-Oriented Programming**: 객체 지향 프로그래밍
객체 지향 프로그래밍은 컴퓨터 프로그래밍 패러다임 중 하나로, **프로그래밍에서 필요한 데이터를 추상화시켜  상태와 행위를 가진 객체를 만들고 그 객체들 간의 유기적인 상호작용을 통해 로직을 구성하는 프로그래밍 방법**이다.  
[참고 블로그](https://jeong-pro.tistory.com/95)
1. 캡슐화
2. 상속
3. 추상화
4. **다형성** (중요)

**단점**
1. 처리 속도가 상대적으로 느림
2. 객체가 많으면 용량이 커질 수 있음
3. 설계시 많은 시간과 노력이 필요

---
### 클래스와 객체
**클래스란?**
→ 객체를 정의해 놓은 것(예시: 제품 설계도)
→ 용도: **객체를 생성하는데 사용**
1. 하나의 소스파일에는 public class는 하나만 생성할 수 있다. ( 둘 이상 안됨)
2. public class의 이름은 소스파일과 일치해야한다. (대소문자를 구분하므로 대소문자까지 일치해야한다.)
3. 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직

**객체(인스턴스)란?**
→ 실제로 존재하는 것. 사물 또는 개념(예시: 제품)
→ 용도: 객체가 가지고 있는 기능(메서드)과 속성(변수)을 사용하기 위해

▶객체 = 속성(변수) + 기능(메서드)

1. 객체의 생성
	클래스명 변수명; 				//클래스의 객체를 참조하기 위한 참조변수 선언 
	변수명 = new 클래스명();	//클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
```
//방법1
Tv t; //Tv클래스 타입의 참조변수 t 선언
t = new Tv();//Tv객체(인스턴스)를 생성(new Tv())한 후, t참조변수에 생성된 주소 저장
//방법2(가독성 좋음)
Tv t2 = new Tv();
```
2. 객체의 사용
```
class Tv {
	int channel;
	void channelDown() {channel--;}
}
```
t.channel = 7; // Tv객체(인스턴스)의 맴버변수 channel의 값을 7로
t.channelDown();// Tv객체(인스턴스)의 메서드 호출

---

### 객체 배열
객체 배열 == 참조변수 배열

```
//객체 배열 선언하고 초기화 방법 1
Tv[] tvArr = new Tv[3]//참조변수 만들기

//초기화(꼭 해줘야합니다)
//tvArr[0] = new Tv();
//tvArr[1] = new Tv();
//tvArr[2] = new Tv();

//객체 배열 선언하고 초기화 방법 2
Tv[] tvArr = {new Tv(), new Tv, new Tv()};  

```

### 클래스의 정의(1)
클래스 == 데이터 + 함수

1. 변수: 하나의 데이터를 저장할 수 있는 공간
2. **배열**: **같은 종류**의 여러 데이터를 하나로 저장할 수 있는 공강
	같은 종류 외에는 저장이 불가능
3. **구조체**: **서로 관련된 여러 데이터(종류 관계 없음)**를 하나로 저장할 수 있는 공간
4. **클래스: 데이터와 함수의 결합 (구조체 + 함수)**

※ 함수?
어떤 하나의 작업을 하는 명령문들을 묶은 것.(메서드와 같다.)

### 클래스의 정의(2)
사용자 정의 타입 : 원하는 타입을 직접 만들 수 있다.
1. 코드가 간결해진다.
2. 서로 관련된 값들을 묶을 수 있다.
3. 유지보수가 쉽다.

```
class Time {
	int hour;
	int minute;
	int second;
	public void times {
		System.out.println("Time =" + hour + ":" + minute + ":" + second);
	}
}
```
```
public static void main(String[] args) {
	Time t = new Time();
	t.hour = 12;
	t.minute = 34;
	t.second = 56;
	t.times();
}

//결과: Time =12:34:56
```
# 선언 위치에 따른 변수의 종류

1. 클래스 영역
	- iv(Instance Variables): 인스턴스(객체)가 **생성**되었을 때
	- cv(class Variables): 클래스가 메모리에 올라갈 때(객체생성 필요없음)
<br>
※iv와 cv의 차이점: 객체 생성의 필요성( iv: 객체생성 || cv: 객체생성 안해도됨)
2. 메서드 영역(메서드의 시작'{'부터 메서드의 끝'}')
	- lv(Local Variables): 변수 선언문이 수행되었을 때 생성

### 클래스 변수와 인스턴스 변수
- 클래스 변수(CV)
	- static을 타입앞에 붙여야 한다.
	- 공통 속성(모든 인스턴스가 공통으로 갖는 속상 값)
	- 예시: 카드의 높이와 폭
- 인스턴스 변수(IV)
	- 개별 속성
	- 예시: 카드의 숫자와 무늬

```
class Card {
	String kind; //무늬
	int number; //숫자
	
	static int width = 100; //폭
	static int heigth = 250; //높이
}
```

- 객체 생성과 사용하기
```
Card c = new Card();
//iv사용하기(참조변수명.iv명 = 값)
c.kind = "HEART";
c.number = 5;

//cv사용하기(클래스명.CV명 = 값)
Card.width = 200; //(c.width 로 사용가능, 하지만 iv와 헷갈림_오해하기 쉬움)
Card.heigth = 250;

```

# 메서드란?
메서드 = 선언부 + 구현부

1. 문장'{}'들을 묶어놓은 것
	- 하나의 작업을 하는 코드를 {}안에 집어넣어 묶어준 뒤 이름을 붙여준 것
2. 값(입력)을 받아서 처리하고, 결과를 반환(출력)
3. 클래스 영역에만 정의 가능

```
public class Method { 

// 반환타입 메서드이름(타입 변수명, 타입 변수명, ...) - 선언부  
//  {  
// 메서드 호출시 수행될 코드 - 구현부  
//  }
 
    public void printTest() {  
        System.out.println("메서드설명입니다!");  
  }  
      
    public void printTest2(String text) {  
        System.out.println("입력: " + text);  
  }  
      
    public int add(int x, int y) {//x와 y는 지역변수 lv  
//        int result = x + y; //result는 지역변수 lv
//        return result;  
		return x + y;  
  }
	    
      public int multiply(int x, int y) {//x와 y는 지역변수 lv  
//        int result = x * y; //result는 지역변수 lv
//        return result;  
//	여기서 쓰이는 지역변수명은 add메서드의 변수명과 같다. 
//	하지만 메서드안에서만 사용되고 메서드가 끝나면 같이 사라지기 때문에 
//	다른 메서드와 변수명이 겹쳐도 상관없다.
		return x * y;  
  }  
      
    public static void main(String[] args) {  
    
    //메서드의 호출
        Method m = new Method();  
		m.printTest();//반환 값이 없다.  
		m.printTest2("반환값은 없지만 메서드 호출 시 입력한 값이 콘솔창에 나옵니다.");  
		int result = m.add(3, 5);  
		System.out.println("result = " + result);  
  }  
      
      
}
```
### 메서드의 장점
- 코드의 중복을 줄일 수 있다.
- 코드의 관리가 쉽다.
- 코드를 재사용할 수 있다.
- 코드가 간결해서 이해하기 쉬워진다.

### 메서드의 작성
- 반복적으로 수행되는 여러 문장을 메서드로 작성
- 하나의 메서드는 한 가지 기능만 수행하도록 작성

### 메서드의 호출
메서드이름(값1, 값2,...없으면 안써줘도 됨); //메서드를 호출하는 방법
```
		m.printTest();//반환 값이 없다.  (void prinTest()를 호출
		int result = m.add(3, 5); //매개변수로 3, 5를 보냄, 반환 받은 작업결과를 result에 저장.

//add메서드
    public int add(int x, int y) {//x와 y는 지역변수 lv  
//        int result = x + y; //result는 지역변수 lv
//        return result;  
		return x + y;  
  }
