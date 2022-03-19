package ch9;

public class intAndString {

    public static void main(String[] args) {

        //숫자를 문자열로 바꾸는 방법
        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);

        //문자열을 숫자로 바꾸는 방법
        int j = Integer.parseInt("100");
        int s = Integer.valueOf("100");
        Integer s2 = Integer.valueOf("100");
    }
}
