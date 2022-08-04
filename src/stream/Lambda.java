package stream;

public class Lambda {

    public static void main(String[] args) {

        /**
         * 내가 만드는 예제 1
         * 문자 입력받기
         * (매개변수와 리턴값이 없는 람다식)
         */
        MyLambdaFunction1 myLambdaFunction1 = () -> System.out.println("Java Lambda 익히기 기초 예제를 만들어 봅시다");
        myLambdaFunction1.result();

        /**
         * 내가 만드는 예제 2
         * 두 수를 입력받아 두 값 중 더 큰 값을 구하기
         * (매개변수가 없고 리턴값이 있는 람다식)
         */
//        MyLambdaFunction3 myLambdaFunction3 = () -> {return "return 작성, {괄호}도 작성";};
        MyLambdaFunction2 myLambdaFunction2 = () -> "실행코드가 return 만 있는 경우 {}와 return 생략가능";
        System.out.println("myLambdaFunction2 = " + myLambdaFunction2.result());

        /**
         * 내가 만드는 예제 3
         * 문자를 입력받은 후 공백 제거하기
         * (매개변수가 있고 리턴값이 없는 람다식)
         */
        MyLambdaFunction3 myLambdaFunction3 = (str) -> System.out.println("예제 3 = " + str.replace(" ", ""));
        myLambdaFunction3.result("공 백을없 애봅 시 다");


        /**
         * 내가 만드는 예제 4
         * 두 수를 입력받아 두 값 중 더 큰 값을 구하기
         * (매개변수와 리턴값이 있는 람다식)
         */
        //기존의 방식
        System.out.println(new MyLambdaFunction4() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }

        }.max(3, 5));

        //람다식 이용
        MyLambdaFunction4 myLambdaFunction4 = (int a, int b) -> a > b ? a : b;
        //해석: MyLambdaFunction 에서 매개변수 a와 b를 받아서 ->실행했을 때 구현코드 (a > b ? a : b)
        System.out.println(myLambdaFunction4.max(2,6));

   }
}

/**
 * @FunctionalInterface
 * 함수형 인터페이스에는 람다식과 1:1로 연결될 수 있도록 하나의 추상 메소드만 정의해야한다
 * 단, static 메소드와 default 메소드의 개수에는 제약이 없다.
 * Annotation 생략 가능
 */

@FunctionalInterface
interface MyLambdaFunction1 {
    void result();
}

@FunctionalInterface
interface MyLambdaFunction2 {
    String result();
}

@FunctionalInterface
interface MyLambdaFunction3 {
    void result(String str);
}

@FunctionalInterface
interface MyLambdaFunction4 {
    int max(int a, int b);
}
