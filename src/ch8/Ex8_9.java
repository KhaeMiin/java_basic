package ch8;

public class Ex8_9 {

    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("예외가 발생했어요!!!!");
        }
    }

    static void method2() throws Exception {
        throw  new Exception();
    }
}
