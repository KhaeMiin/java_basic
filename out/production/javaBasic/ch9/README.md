## Object클래스
- 모든 클래스의 최고 조상(오직 11개의 메서드만 가지고 있다. iv와 cv가 없다.)
- Object클래스의 대표 메서드(나머지 생략)
	```
		public boolean equals(Object obj)//객체 자신과 객체obj가 같은 객체인지 알려준다.즉 객체비교(같으면 true)
		public Class getClass() //객체 자신의 클래스 정보를 담고 있는 Class인스턴스를 반환한다.
		public int hashCode() //객체 자신의 해시코드를 반환한다.
		public String toString() //객체 자신의 정보를 문자열로 반환한다.		
	```

### 1. equals(Object obj) 
- 객체 자신(this)와 주어진 객체(obj)를 비교한다. 같으면 true, 다르면 false
- Object클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)
	※서로 다른 객체는 항상 주소가 다르다.
	```
		public boolean equals(Object obj) {
			return (this == obj);//주소비교: true/false반환
		}
	```
	
#### equals(Object obj)의 오버라이딩
- 인스턴스 변수(iv)의 값을 비교하도록 equals()를 오버라이딩해야 한다.
```
	class FindById {//아이디 비교해보기  
	  long id; // 객체는 iv마다 다름(개별) 그러므로 iv의 값을 비교  
	  
	  public FindById(long id) {//생성자  
		  this.id = id;  
	  }  
	  
	  @Override  
	  public boolean equals(Object obj) {  
	      if (!(obj instanceof FindById)) {//1. (findById)클래스로 형변환 할 수 있는지 확인  
		  return false; //타입이 같지 않으면 값을 비교할 필요도 없기때문에 false를 반환시킨다.  
		  }  
	        //2. 형변환  
		  FindById fb = (FindById) obj;  
		  
		  return this.id == fb.id;  
	  }  
	}
```

### 2. hashCode()
- 객체의 해시코드(hash code)를 반환하는 메서드
- Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
- equals()를 오버라이딩하면, hashCode()도 오버라이딩해야 한다.
	- hashCode역시 iv를 가지고 작업함.
	- **equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문**

### 3. toString(), toString()의 오버라이딩
- to: ~으로
- toString(): 객체를 문자열(String)으로 변환하기 위한 메서드
-  **객체 == iv집합**
**객체를 문자열로 변환한다는 것은 iv의 값을 분자열로 변환한다는 것과 같다.**


# String클래스
- 문자열을 다루기 위한 클래스
- String클래스 = 데이터(char[] → 문자배열) + 메서드(문자열 관련)
- 내용을 변경할 수 없는 불변(immutable) 클래스
```
String a = "a";
String b = "b";
a = a + b; //a의 내용이 바뀌는게 아니라 완전히 새로운 문자열a가 만들어지는 것이다.(기존 주소는 끊어지고 새로운 객체 즉, 새로운 주소가 생긴다.)
```
- 덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어짐(계속해서 새로운 객체가 만들어지기 때문에)
문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용

## 문자열 비교
- String str = "abc"와 String str = new String("abc")의 비교

```
String str1 = "abc"; //문자열 리터럴 "abc"의 주소가 str1에 저장됨
String str2 = "abc"; //문자열 리터럴 "abc"의 주소가 str2에 저장됨
//→하나의 문자열("abc")을 여러 참조변수가 공유

str1 == str ? true //주소비교
str1.equals(str2) ? true //내용비교
```

<br>

```
String str3 = new String("abc"); //새로운 String인스턴스(객체)를 생성
String str4 = new String("abc"); //새로운 String인스턴스(객체)를 생성
// →new: 항상 새로운 문자열 생성

str1 == str ? false  (주소지가 다르다. 즉 다른 객체)
str1.equals(str2) ? true //equals는 내용비교
```
## 문자열 리터럴
- 문자열 리터럴은 프로그램 실행시 (new String안해도)자동으로 생성된다.(constant pool이라는 상수 저장소에 저장)
```
String s1 = "AAA"; //new String("AAA")로 만들어짐
String s2 = "AAA";
String s3 = "AAA";
```
- 같은 내용의 문자열 리터럴은 하나만 만들어진다.
위 s1, s2, s3는 자동으로 만들어진 문자열 리터럴(상수)"AAA"를 가르키게 됨. (여러 참조변수가 공유하게 된다)

## 빈 문자열(" ",empty string)
- 내용이 없는 문자열. 크기가 0인 char형 배열을 저장하는 문자열
	```
		String str = "";
	```
- 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
	```
		char[] chArr = new char[0];//길이가 0인 char배열
		int[] iArr = {}; //길이가 0인 int배열
	```
- 문자(char)와 문자열(String)의 초기화
	```
		String s = "";//빈 문자열로 초기화
		char c = ' ';// 공백으로 초기화
	```

<br>
<br>

# String클래스의 생성자와 메서드

※아래 코드를 확인해주세용<br>
[String클래스의 메서드 확인하기](https://github.com/KhaeMiin/java_basic/blob/master/src/ch9/StringClass.java#L5)
