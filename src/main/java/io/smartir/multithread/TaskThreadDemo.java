package io.smartir.multithread;

public class TaskThreadDemo {

    public static void main(String[] args) {

        Runnable printA = new PrintChar('a', 1000);
        Runnable printB = new PrintChar('b', 1000);
        Runnable print100 = new PrintNum(100);
        Runnable r = () -> System.out.println(" jimi is bet ");

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        thread1.start();
        thread2.start();
        thread3.start();
        Thread run = new Thread(r);
        run.setDaemon(true);
        run.start();
    }
}
