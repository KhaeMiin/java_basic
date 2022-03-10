package ch6;

class Time {
    int hour;
    int minute;
    int second;
    public void times() {
        System.out.println("Time =" + hour + ":" + minute + ":" + second);
    }
}

public class instance_array {

//    Tv[] tvArr = new Tv[3];
    Tv[] tvArr = {new Tv(), new Tv(), new Tv()};



    public static void main(String[] args) {
        Time t = new Time();
        t.hour = 12;
        t.minute = 30;
        t.second = 58;

        t.times();

    }
}
