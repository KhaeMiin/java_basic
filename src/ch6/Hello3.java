package ch6;

public class Hello3 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 5;//변수사용
        t.channelDown();//메서드사용
        System.out.println("t.channel = " + t.channel);
    }
}
