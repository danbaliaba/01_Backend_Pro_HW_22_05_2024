package Lesson_01_HW.task_01.task_02;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1_000_000; i <= 2_000_000; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                Main.increment();
            }
        }
    }
}
