package ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] main) {
        List<String> list = new ArrayList<>(); //인덱스 번호는 순서대로 삽입해야함

        list.add(0, "test");
        list.add("test1");
        list.add("test3"); //인덱스 2번
        list.add(2, "test2"); //2번 데이터가 이미 있을 경우 인덱스 한칸씩 뒤로 밀고 얘가 들어감
        list.add("test4");
        list.add(null); //null허용
        list.add("test6");
        list.remove(4); //삭제시 그 공간 뒤에 있는 데이터들이 인덱스 한 칸씩 앞당겨짐
        System.out.println("list.get(4) = " + list.get(4));


        for (String s : list) {
            System.out.println("s = " + s);
        }

        int[] arr = new int[5];
//        arr[0] = null; //배열은 null허용 하지 않음
        int[] arr2 = {1, 3, 5, 2, 3};
        Arrays.stream(arr2) //역시 삭제시 인덱스 한 칸씩 당겨옴
                .filter(a -> a != 5)
                .toArray();
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


    }
}
