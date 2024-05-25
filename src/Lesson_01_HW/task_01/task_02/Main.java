package Lesson_01_HW.task_01.task_02;

public class Main {

    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.start();

        for (int i = 1; i < 1_000_000; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                increment();
            }
        }
        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Всего таких чисел - " + counter);
    }
}
