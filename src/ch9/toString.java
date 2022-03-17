package ch9;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);//생성자(기본값 초기화)
    }

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() { //iv값들을 이용해서 문자열을 만든다. (객체열(iv)값들을 문자열로 바꾼다.)
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object obj) {//객체의 값 비교로
        if (!(obj instanceof Card)) {//형변환 가능한지 확인
            return false;
        }
        Card c = (Card) obj;

        return this.kind == c.kind && this.number == c.number;
    }

    // equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }
}

public class toString {

    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));


        //equals 가 true면 이 두개의 해시코드값이 동일하게 나옴
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
