##  프로그램 오류, 예외클래스 그리고 예외 처리하기
### 프로그램 오류
- 컴파일 에러(compile-time error): 컴파일 할 때 발생(프로그램이 실행되지 않음)
	- 자바 컴파일러(javac): 구문체크, 번역, 최적화, 생략된 코드 추가
- 런타임 에러(runtime error): 실행 할 때 발생하는 에러(프로그램 종료)
- 논리적 에러(logical error): 작성 의도와 다르게 동작(프로그램이 종료되진 않음)
<br>

**java의 런타임 에러**
- **에러(error)**: 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
- **예외(Exception)**: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

→ 에러(error)는 어쩔 수 없지만, 예외(exception)은 처리하자

---
### 예외처리의 정의와 목적
- **정의**: 프로그램 실행 시 발생할 수 있는 **예외의 발생에 대비한 코드를 작성**하는 것
- **목적**: 프로그램의 **비정상 종료를 막고**, 정상적인 실행상태를 유지하는 것

### Exception, RuntimeException
- Exception클래스들(자손 클래스): **사용자의 실수**와 같은 **외적인 요인**에 의해 발생하는 예외 
	- IOException: 입출력 예외
	- ClassNotFoundException:  클래스가 존재하지 않을 경우
- RuntimeException클래스들(자손클래스): **프로그래머의 실수**로 발생하는 예외
	- ArithmeticException: 산술계산예외 (예시: 5/0)
	- ClassCastException: 형변환이 잘못되었을 경우 
	- NullPointerException: 객체 값이 null인데 메서드를 호출 할 경우
	- ...
	- IndexOutOfBoundException: 배열 범위를 벗어날 경우

---
### 예외 처리하기 (try-catch문)
```
try{//괄호{}생략 절때 불가
	//예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch (Exception1 e1) {
	// Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 넣는다.
} catch (Exception2 e2) { // catch 여러번 사용 가능
	// Exception2이 발생했을 경우, 이를 처리하기 위한 문장을 넣는다.
}
```
### try-catch문에서의 흐름
1. 예외가 발생하지 않을 경우
```
public class ExceptionTest {  
    public static void main(String[] args) {  
        //예외가 발생하기 않을 경우  
		  System.out.println(1);  
		 try {  
		      System.out.println(2);//실행  
			  System.out.println(3);//실행  
		  } catch (Exception e) {  
		      System.out.println(4);//예외가 발생하지 않았으므로 실행이 안됨  
		  }  
		      System.out.println(5);//실행  
		  }  
}
//결과: 1 2 3 5
```
2. 예외가 발생할 경우
```
public class ExceptionTest {  
    public static void main(String[] args) {  
        //예외가 발생하기 않을 경우  
		 System.out.println(1);  
		 try {  
		      System.out.println(5/0);//예외 발생(수행을 멈추고 catch블럭으로 이동) || 0으로 나누기 금지  
			  System.out.println(2);//예외가 발생한 이후의 문장은 실행되지 않음  
		  } catch (ArithmeticException e) {  
		      System.out.println(3);//발생하는 예외에 해당하는 catch블럭 실행 후 try-catch문 전체를 빠져나감  
		  } catch (Exception e) {  
		      System.out.println("Exception");//ArithmeticException을 제외한 모든 예외가 처리된다.  
		  }  
		  System.out.println(4);//실행  
		  }  
}
//결과: 1 3 4
```
- 예외가 발생한 이후의 문장은 실행되지 않는다.
- 발생한 예외가 해당되는 catch블럭으로 이동된다.
- 일치하는 catch블럭이 없으면, 예외는 처리 안됨
- Exception(모든 예외의 최고 조상)이 선언된 catch블럭은  마지막 catch블럭에 넣기
 ---
### printStackTrace()와 getMessage()
예외가 발생하면 예외객체가 생성되고 그 객체에는 예외에 대한 정보가 들어가있다. 
정보를 볼 수 있는 대표적인 메서드 두개가 printStackTrace()와 getMessage()이다.
- printStackTrace(): 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
- getMessage(): 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
<br>
### 멀티 catch블럭
- 내용이 같은 catch블럭을 하나로 합친 것(JDK1.7부터)
```
try {
	...
} catch (ExceptionA e) {
	e.printStackTrace();
} catch (ExceptionB e2) {
	e2.printStackTrace();
} 
```
▶중복제거 후(JDK 1.7부터 사용가능)
```
try {
	...
} catch (ExceptionA | ExceptionB e) {
	e.printStackTrace();
}
```
※ 부모 자식관계는 불가능
```
try {
	...
//} catch (ParentException | ChildException e) { //에러!!
} catch (ParentException e) {//Ok
	e.printStackTrace();
}
```
---
### 예외 발생시키기
1. 예외 클래스의 객체 생성
	Exception e = new Exception("고의적 예외 실행");
2. 키워드 throw를 이용해서 예외 발생
	throw e;

※ throw new Exception("고의적 예외 실행"); →간단하게 쓸 수 있음
```
public class ExceptionText2 {  
    public static void main(String[] args) {  
        try {  
            throw new Exception("고의적 예외");  
  } catch (Exception e) {  
            System.out.println("e.getMessage() = " + e.getMessage());  
  e.printStackTrace();  
  }  
        System.out.println("프로그램이 정상 종료되었습니다");  
  }  
}

//결과: 
e.getMessage() = 고의적 예외
프로그램이 정상 종료되었습니다
java.lang.Exception: 고의적 예외
at ch8.ExceptionText2.main(ExceptionText2.java:6)

//예외가 발생되었지만 프로그램이 정상 종료된 것을 볼 수 있다.
```
---
 ### checked예외, unchecked예외
 -** checked예외**: 컴파일러가 **예외 처리 여부를 체크**(**예외 처리 필수**)
	 - checked : Exception과 그 자손
```
	public void checkedTest() {  
	// throw new Exception("고의적 예외"); // 예외처리를 하지 않아서 컴파일 에러  
	  try {  
	       throw new Exception("고의적 예외");  
	  } catch (Exception e) {
	  
	  }  
	       System.out.println("프로그램이 정상 종료되었습니다");  
	  }
```



<br> 

 - **unchecked예외**: 컴파일러가 **예외 처리 여부를 체크 암함**(**예외 처리 선택**)
	 - unchecked : RuntimeException과 그 자손 
```
    public void uncheckedTest() {  
        throw new RuntimeException("예외처리를 하지 않아도 됩니다.");  
  }

//결과
Exception in thread "main" java.lang.RuntimeException: 예외처리를 하지 않아도 됩니다.
	at ch8.Test1.uncheckedTest(ExceptionText2.java:31)
	at ch8.ExceptionText2.main(ExceptionText2.java:6)

//비정상 종료됨
```

## 메서드에 예외 선언하기
- 예외를 처리하는 방법: try - catch문(직접처리), 예외 선언하기(예외 떠넘기기),감추기(빈catch 사용 - 웬만하면 사용안하기)
- 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것\

※예외를 발생시키는 키워드 throw와 예외를 메서드에 선언할 때 쓰이는 throws를 잘 구별하자.
```
	void method() throws Exception1, Exception2, ... ExceptionN { // 메서드에 예외 선언
		//메서드 내용
	}
	//method()에서 Exception과 그 자손 예외 발생 가능
	void method() throws Exception {//모든 종류의 예외
		//메서드 내용
	}
```

## fianlly 블럭
- **예외 발생여부와 관계없이 수행**되어야 하는 코드를 넣는다.
```
try{
	//예외가 발생한 가능성이 있는 문장들 넣는다.
} catch (Exception e1) {
	//예외처리를 위한 문장을 적는다.
} finally {
	//예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣는다.
	//finally블럭은 try-catch문의 맨 마지막에 위치해야한다.
```
※ try블럭 안에 return문이 있어서 try블럭을 벗어나갈 때도 finally블럭이 실행된다.

