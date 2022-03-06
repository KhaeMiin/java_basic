package ch8;

public class ExceptionText2 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.uncheckedTest();
    }
}

class Test1 {
    public void ExceptionTest1() {
        try {
            throw new Exception("고의적 예외");
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었습니다");
    }
    public void checkedTest() {
//            throw new Exception("고의적 예외"); // 예외처리를 하지 않아서 컴파일 에러
        try {
            throw new Exception("고의적 예외");
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었습니다");
    }
    public void uncheckedTest() {
        throw new RuntimeException("예외처리를 하지 않아도 됩니다.");
//        try {
//            throw new RuntimeException("예외처리 했을 경우");
//        } catch (RuntimeException e) {
//            System.out.println("예외처리 했을 경우의 에러 = " + e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println("프로그램이 정상 종료 되었습니다.");
    }
}