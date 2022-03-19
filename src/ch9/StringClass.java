package ch9;

public class StringClass {

    public static void main(String[] args) {
        System.out.println("String 클래스의 메서드");
        String str1="apple";
        String str2="Apple";
        String str3="Have a Nice Day";
        String str4="   Happy Day    ";
        System.out.println("str3의 길이:"+str3.length()); //15
        System.out.println("str4의 길이:"+str4.length()); //16
        System.out.println("앞뒤공백 제거 후 str4의 길이:"+str4.trim().length());//trim:공백제거
        System.out.println("*"+str4+"*");
        System.out.println("*"+str4.trim()+"*");
        System.out.println("str3에서 0번 문자"+str3.charAt(0));		 //H
        System.out.println("str3에서 7번 문자"+str3.charAt(7));//스트링을 캐릭터로 인식하게    /N
        System.out.println("str3에서 H의 인덱스"+str3.indexOf('H'));//스트링을 인트로 인식하게
        System.out.println("str3에서 N의 인덱스"+str3.indexOf('N'));
        System.out.println("str3에서 Have추출"+str3.substring(0,4));//0,1,2,3추출
        System.out.println("str3에서 Nice추출"+str3.substring(7,11));//7,8,9,10추출
        System.out.println("str3에서 Nice부터 끝까지 추출"+str3.substring(7));

        //equals는 같으면 true,틀리면 false
        System.out.println("문자열비교:"+str1.equals(str2));//대소문자까지 같아야 true
        System.out.println("문자열비교:"+str1.equalsIgnoreCase(str2));//대소문자상관없이 같으면 true


        //a.compareTo(b)
        //a와 b가 같을 경우 0
        //a가 작을 경우 -값(알파벳 차이만큼 마이너스값)
        //a가 클 경우 +값(알파벳 차이만큼 플러스값)
        System.out.println(str1.compareTo(str2));//32(a(97)pple A(65)pple비교_아스키코드기준 첫글자 계산됨)
        System.out.println(str1.compareTo(str1));//0(같을경우)
        System.out.println("computer".compareTo("command"));//3(p와 m이 비교)
        System.out.println("hello".compareTo("hello"));//0
        System.out.println("apple".compareTo("banana"));//-1
        System.out.println("kiwi".compareTo("orange"));//-4 k와 o비교_아스키코드기준 계산됨111

        System.out.println("str3 가 Have로 시작하면 true:"+str3.startsWith("Have"));//특정 문자열로 시작하는지
        System.out.println("str3 가 Happy로 시작하면 true:"+str3.startsWith("Happy"));
        System.out.println(str3.endsWith("Day"));//true-Day로 끝나면 true
        System.out.println(str3.endsWith("day"));//false

        //문자열 분리하는 매서드 split
        String str5="red,blue,green,black,pink";
        System.out.println("str5를 컴마로 분리하여 출력하기");
        String []arr=str5.split(",");
        System.out.println("분리된 색상 갯수:"+arr.length);
        //출력
        for(String color:arr)//for문:배열이나 컬렉션에서 사용하는 for문
            System.out.println(color);


        System.out.println("str3를 소문자로 출력:"+str3.toLowerCase());
        System.out.println("str3를 대문자로 출력:"+str3.toUpperCase());

        String a=String.valueOf(100);//int->String //빈문자열을 더하는 것보다 성능이 빠르다.
        String b=String.valueOf(12.3);//double->String
        String a2=100+"";//+연산 시 String이 있으면 결과는 String
        String b2=12.3+"";

        System.out.println("문자열 일부를 변경");
        System.out.println(str3.replace('a', '*'));//출력: H*ve * Nice D*y(a가 *로 바뀜)
        System.out.println(str3.replace("Nice", "Good"));//출력: Have a Good Day(Nice가 Good으로 바뀜)
    }
}
