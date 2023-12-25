package Ques_4d;

public class Thread1 extends Thread{
    @Override
    public void run() {}
}
 class Thread2 implements Runnable {
    @Override
    public void run() {}
}
class Main {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();

        Thread2 th2 = new Thread2();
        Thread a = new Thread(th2);
        a.start();
    }
}