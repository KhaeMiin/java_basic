package ch9;

public class stringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("abc");
        sb.append("efg");
        System.out.println(sb);

        StringBuffer sb2 = sb.append("ZZ");

        System.out.println("sb = " + sb); //결과: abcefgZZ
        System.out.println("sb2 = " + sb2); //결과: abcefgZZ

        String a = sb.toString();
        String b = sb2.toString();

        System.out.println(a.equals(b));


    }
}
