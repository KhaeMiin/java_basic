package ch8;

public class Ex8_12 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 한 번 더 예외처리!!");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외가 발생!!메서드에서 한 번 처리됨!");
            throw e;
        }
    }

    /*
    * 의문: 이런 경우를 어떤 경우에 쓰일지.....??
    * */
}
