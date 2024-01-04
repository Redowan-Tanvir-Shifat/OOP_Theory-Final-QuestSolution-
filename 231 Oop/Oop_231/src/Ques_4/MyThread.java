package Ques_4;

public class MyThread implements Runnable{
    @Override
    public void run() {
        int i =1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        try {
            thread.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
