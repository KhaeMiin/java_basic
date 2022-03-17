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
