package ch5;

import java.util.Arrays;

/**
 * 예제를 만들어서 좀 더 확실하게 익히기
 */
public class Array2 {

    public static void main(String[] args) {
        //랜덤값을 배열로 받아서 초기화
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 45);
            arr[i] = num;
        }

        System.out.println("arr = " + Arrays.toString(arr));

        //값을 입력받아서 split으로 나눈 후 배열
        String str = "sdf, dsffds, dsfdsfds, ewrdf, fcxvxvc, dsffds, dsfdsfds";
        String replace = str.replace(" ", "");//띄워쓰기 모두 없애기
        String[] strArr = replace.split(",");

        //배열 값에서 중복값은 제외 시키기
        strArr = Arrays.stream(strArr).distinct().toArray(String[]::new);
        System.out.println("중복값을 제외한 배열 = " + Arrays.toString(strArr));

        //배열값 안에서 중복되는 알파벳 제외시키기 (예시 dsffds -> dsf)
        int count = 0;
        for (String s : strArr) {
            String[] splitStr = s.split(""); //배열값 하나하나 모두 split으로 나누기
            String[] result = Arrays.stream(splitStr).distinct().toArray(String[]::new); //중복되는 알파벳들 모두 제거
            String resultStr = String.join("", result); //배열을 String으로 변환
            strArr[count] = resultStr; //변환된 값을 다시 배열에 넣기

            count++;
        }

        System.out.println("중복되는 알파벳을 모두 제외시킨 배열 = " + Arrays.toString(strArr));

        //작업을 마친 배열값을 다시 String으로 변환시키기 ("," 추가)
        String join = String.join(", ", strArr);
        System.out.println("join = " + join);

    }
}
