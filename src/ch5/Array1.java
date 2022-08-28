package ch5;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        /**
         * 같은 타입의 여러 변수들을 참조변수에 담는 것
         * int[] arr; : 배열 참조변수를 담는 것
         * arr = new int[5]; 배열 생성 (저장공간이 5)
         * int[] arr = {1, 3, 4, 6, 4, 32};처럼 값을 초기화 할 수 있다. (new int[]{}에서 new int[]가 생략된 것)
         * ※ 배열은 한 번 생성하면 그 길이를 바꿀 수 없다.
         */
        int[] arr = {1, 3, 4, 6, 4, 32}; //한 줄로 다 써야함 (두 줄로 나눠서 쓸 수 없음)
        System.out.println("arr[0] = " + arr[0]);
        int[] arr2 = arr;
        arr2[2] = 5;
        System.out.println("arr2[2] = " + arr2[2]);
        System.out.println("arr2 = " + arr2); // [I(Integer이란 뜻)@주소값 출력됨 (char일 경우 제외)

        System.out.println();
        System.out.println("기존 for문으로 배열 출력하기");
        for (int i = 0; i < arr.length; i++) { // 배열 index범위를 벋어난 상태로 출력하면 에러가 발생한다.
            System.out.println("arr " + (i +1) + arr[i]);
        }

        System.out.println();
        System.out.println("향상된 for문으로 배열 출력하기");
        int count = 0; //index뽑기
        for (int i : arr2) {
            count++;
            System.out.println("arr2-" + count + " = " + i);
        }

        System.out.println();
        System.out.println("Arrays 클래스 이용하여 배열 출력하기");
        System.out.println(Arrays.toString(arr2)); //[1, 3, 5, 6, 4, 32]

        System.out.println();
        System.out.println("배열 길이가 다른 새로운 배열을 가리키게 하기");
        int[] arr3 = {4, 5, 1}; //길이가 다른 배열
        arr2 = arr3;
        for (int i : arr2) {
            System.out.println("arr2 = " + i);
        }

        System.out.println();
        System.out.println("char배열");
        char[] chArr = {'j', 'a', 'v', 'a'};
        System.out.println("바로 출력");
        System.out.print("chArr = ");
        System.out.println(chArr); // " "없이 char배열만 출력해야한다. (아니면 주소값같은 것이 출력됨)

        System.out.println("char배열을 String으로 변환시키기");
        String str = new String(chArr);
        System.out.println("str = " + str);

        System.out.println();
        System.out.println("String > char[]로 변환시키기 (String 클래스)");
        String str2 = "javabasic";
        char[] chars = str2.toCharArray();
        System.out.println("chars = " + chars);

        Integer[] arr5 = {1, 54, 3, 5, 2}; //래퍼클래스도 배열이 가능하다.

    }
}
