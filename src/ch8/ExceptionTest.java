package ch8;

public class ExceptionTest {
    public static void main(String[] args) {
        //예외가 발생하기 않을 경우
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(5/0);//예외 발생(수행을 멈추고 catch블럭으로 이동) || 0으로 나누기 금지
            System.out.println(4);//예외가 발생한 이후의 문장은 실행되지 않음
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");//발생하는 예외에 해당하는 catch블럭 실행 후 try-catch문 전체를 빠져나감
                System.out.println("ArithmeticException");
            }
        } catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());//ArithmeticException을 제외한 모든 예외가 처리된다.
        }
        System.out.println("끝");//실행
    }
}
