package ch9;


class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }


    //Object클래스의 메서드들을 한번 확인해보자!!!

    public Value() {
        super();
    }

    @Override
    public int hashCode() {//객체 자신의 해시코드를 반환한다.
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {//객체 자신과 객체obj가 같은 객체인지 알려준다.즉 객체비교(같으면 true) + 주소비교라고도 한다.
//        return super.equals(obj);
//    }

    @Override
    public boolean equals(Object obj) {//객체의 값과 자신과 객체obj의 값이 같은 값인지 알려준다.즉 객체의 값 비교(같으면 true)

        //참조변수의 형변환 전에는 반드시 instanceof로 확인해야함.
        if (!(obj instanceof Value)) {//instanceof를 이용한 연산결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻함
            return false;
        }

        Value v = (Value) obj; //obj에는 int value가 없으니 형변환을 해줘야함.

        return this.value == v.value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {//protected 는 public 으로 수정 후 사용
        return super.clone();
    }

    @Override
    public String toString() { //객체 자신의 정보를 문자열로 반환한다.
        return super.toString();
    }
}

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

        return id == fb.id; //this는 생략가능
    }
}
public class equals {

    public static void main(String[] args) {
        Value v1 = new Value(5);
        Value v2 = new Value(5);

        System.out.println(v1.equals(v2) ?  "같다" : "다르다"); //결과는 "다르다", why? 객체의 주소를 비교한다.
        //※서로 다른 객체는 항상 주소가 다르다.

        //그러면 "같다" 를 반환하게 하려면?? (value) 값을 비교하도록 Value클래스에서 오버라이드를 통해 메서드내용을 바꾼다.


        //아이디번호 비교해보기
        FindById id1 = new FindById(7L);
        FindById id2 = new FindById(7L);

        System.out.print("아이디 비교 = ");
        System.out.println(id1.equals(id2) ? "같다" : "다르다");
    }
}
