package Lesson_01_HW.task_01;

public class Main {

    public static void main(String[] args) {
        int counter = 0;

        for (int i = 1; i <= 2_000_000; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                counter++;
            }
        }
        System.out.println("Всего таких чисел - " + counter);
    }

}
