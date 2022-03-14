package ch8;

public class Ex8_18_2 {
    /*
    필수처리 예외를 선택예외로 바꾸기
     */
    public static void main(String[] args) {
        exception1();
    }

    static void exception1() throws NumberFormatException { //여러 예외들을 NumberFormatException로 묶어서 다룰 수 있다.
            start1();
            throw new RuntimeException(new ArithmeticException(""));//필수처리 예외를 선택예외로 바꾸기 (원인예외 등록하기: RuntimeException생성자 이용)
    }

    static void start1() {
//        throw new ArithmeticException();
        try {
            System.out.println(5/0); //1. ArithmeticException 발생시킴

//            int[] arr=new int[2];// 2. ArrayIndexOutOfBoundsException 발생시킴
//            arr[0]=100;
//            arr[2]=0;
//
//            int a=arr[0]/arr[1];

        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException 에러 발생!");
            throw e;
        }  catch (ArrayIndexOutOfBoundsException e) {
            NumberFormatException ne = new NumberFormatException("정수변환 안됨!!에러1");
            ne.initCause(e);//예외 다시 던지기
            throw ne;
        }catch (Exception e) {
            throw e;
        }

    }
}
