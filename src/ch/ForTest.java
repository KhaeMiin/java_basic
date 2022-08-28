package ch;

public class ForTest {

    public static void main(String[] args) {

        //네모난 별 상자 만들기 (직사각형)
        System.out.println("직사각형");
        for (int i = 1; i <= 5; i++) { //높이

            for (int j = 1; j <= 4; j++) { //가로
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("직삼각형");
        //별 직삼각
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("직삼각형 뒤집어");
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("직삼각형 활용");
        for (int i = 1; i <= 5; i++) { //높이

            for (int j = 1; j <= 5; j++) { //가로
                if (i <= j) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
//            System.out.print("*");
            System.out.println();
        }


        System.out.println("피라미드 뒤집어!");
        for (int i = 1; i <= 5; i++) { //높이

            for (int j = 1; j <= 5; j++) { //가로
                if (i <= j) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
//            System.out.print("*");
            System.out.println();
        }

        System.out.println("파라미드 찍어!!");
/*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) { //가로
                if (i )
            }
*/

    }

}
