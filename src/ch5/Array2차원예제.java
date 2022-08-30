package ch5;

public class Array2차원예제 {

    public static void main(String[] args) {
        //간단한 예제 만들기
        int[][] arr = {
                {35, 23, 6},
                {25, 11, 66, 33}, // 이런 식으로 각 행마다 열의 길이(배열의 길이)는 달라져도 상관 없다.
                {2, 6, 2},
                {6, 26, 262}
        };

        //1. 2차원 배열에 있는 모든 값을 더하기

        int sum1 = 0;
        int sum2 = 0;

        //기존 for문
        for (int i = 0; i < arr.length; i++) { //arr (각 행)이 가리키는 배열의 길이
            for (int j = 0; j < arr[i].length; j++) { //arr[0]이 가리키는 배열의 길이 라고 해석
                sum1 += arr[i][j];
            }
        }

        //향상된 for문
        for (int[] ints : arr) { //arr값을 int[] ints를 통해서 모두 꺼내겠다
            for (int anInt : ints) {
                sum2 += anInt;
            }
        }

        System.out.println("sum = " + sum1);
        System.out.println("sum = " + sum2);



        /**
         * 예제 만들기
         * 학생들의 과목별 성적표를 2차원 배열에 담는다.
         * 각 학생들의 총점과 평균을 구한다.
         * 그리고 과목별 총점과 평균을 구한다. (예시 국어 A학생: 100 B학생: 80, C학생: 80 > 국어 총점:260, 평균: 86.6)
         */
        int[][] score = {
                {45, 30, 61},
                {70, 23, 47},
                {86, 36, 20},
                {29, 60, 80}
        };

        int k = 0; //국어
        int m = 0; //수학
        int e = 0; //영어
        int[] average2;  //과목별 평균
        int count = 0;
        System.out.println("국어 수학 영어 총점 평균");
        for (int[] student : score) {
            float average = 0; //학생 평균 점수
            int totalScore = 0; // 학생 총 점
            for (int num : student) {
                System.out.print(num + "  ");
                totalScore += num;
            }
            k += student[0];
            m += student[1];
            e += student[2];

            average = (float)totalScore/student.length;
            System.out.print(totalScore + " " + Math.floor(average*10)/10.0);
            System.out.println();
        }
        System.out.println(k + " " + m + " " + e);

/*        //이 밑 코드들 싹 맘에 안든다..
        float totalK = (float) k / score.length;
        float totalM = (float) m / score.length;
        float totalE = (float) e / score.length;
        System.out.println(Math.floor(totalK*10)/10.0 + " " + Math.floor(totalM*10)/10.0 + " " + Math.floor(totalE*10)/10.0);*/


        System.out.println(String.format("%.1f", (float) k/score.length) + " " +
                String.format("%.1f", (float) m/score.length) + " " +
                String.format("%.1f", (float) e/score.length));
    }
}
