package ch9;

public class StringJoiner {
    public static void main(String[] args) {

        String foods = "apple, orange, spake";
        String[] arr = foods.split(",");
        for (String food : arr) {
            System.out.println("food = " + food);
        }

        String str = String.join("_", arr);
        System.out.println("str = " + str);
    }
}
