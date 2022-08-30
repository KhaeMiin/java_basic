package ch5;

import java.util.Arrays;

public class Array2차원 {

    /**
     * 1차원 배열이 여러개 모인 것
     * 테이블 형태의 데이터를 저장하기 위한 배열
     */

    public static void main(String[] args) {
        int[][] score = new int[4][3]; // 4행 3열의 2차원 배열 -> 총 12개의 저장공간이 생긴다.
        System.out.println("score.length = " + score.length);

        score[0][0] = 100; //배열 1행 1열에 100을 저장한다.

        //초기화 하기
        // 3행 3열의 2차원 배열
        int[][] arr = {
                {2, 4, 6}, 
                {3, 6, 4},
                {5, 3, 6}};

        // 값 출력하기
        System.out.println("Arrays.toString(arr[0]) = " + Arrays.toString(arr[0])); // [0]행에 있는 모든 배열 출력
        System.out.println("Arrays.toString(arr[0]) = " + Arrays.toString(arr[1])); // [1]행에 있는 모든 배열 출력
        System.out.println("Arrays.toString(arr[0]) = " + Arrays.toString(arr[2])); // [2]행에 있는 모든 배열 출력
        System.out.println("arr[0][1] = " + arr[0][1]);
    }
    
}
