package ch6;

public class MethodTest {

    //  반환타입 메서드이름(타입 변수명, 타입 변수명, ...) - 선언부
    //  {
    //      메서드 호출시 수행될 코드                   - 구현부
    //  }

    public void printTest() {
        System.out.println("메서드설명입니다!");
    }

    public void printTest2(String text) {
        System.out.println("입력: " + text);
    }

    public int add(int x, int y) {
//        int result = x + y;
//        return result;
        return x + y;
    }

    long max(long x, long y) {
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        MethodTest m = new MethodTest();
        m.printTest();//반환 값이 없다.
        m.printTest2("반환값은 없지만 메서드 호출 시 입력한 값이 콘솔창에 나옵니다.");
        int result = m.add(3, 5);
        System.out.println("result = " + result);
        long max = m.max(6, 5);
        System.out.println("max = " + max);

    }


}
