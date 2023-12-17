package Ques_4b;

public class MyThread extends Thread {
    private int tid;
    private int startValue, endValue, inc;
    private double z;

    MyThread(int id, int sv, int ev) {
        this.tid = id;
        this.startValue = sv;
        this.endValue = ev;
        inc = 3;
        z = 1.0;
    }

    public void run() {
        while(startValue <= endValue) {
            z = z * (1.0/startValue);
            startValue = startValue + 3;
        }
    }
    public double get_z() {
        return z;
    }
}

