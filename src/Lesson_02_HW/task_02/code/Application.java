package Lesson_02_HW.task_02.code;

import Lesson_02_HW.task_02.staff.administration.Director;
import Lesson_02_HW.task_02.staff.administration.ElderBookkeeper;
import Lesson_02_HW.task_02.staff.administration.LawyerManager;
import Lesson_02_HW.task_02.staff.spesialists.Secretary;
import Lesson_02_HW.task_02.staff.spesialists.finance.JuniorBookkeeper;
import Lesson_02_HW.task_02.staff.spesialists.work.Lawyer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

        // Вариант выполнения без использования фреймворка Spring

        Director director = new Director();
        ElderBookkeeper elderBookkeeper = new ElderBookkeeper();
        LawyerManager lawyerManager = new LawyerManager();
        JuniorBookkeeper juniorBookkeeper = new JuniorBookkeeper();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();

        elderBookkeeper.setJuniorBookkeeper(juniorBookkeeper);
        lawyerManager.setLawyer(lawyer);

        director.setElderBookkeeper(elderBookkeeper);
        director.setLawyerManager(lawyerManager);
        director.setSecretary(secretary);


        director.manageStaff();
    }

}

class ApplicationSpring{
    public static void main(String[] args) {

        // Вариант выполнения с использованием фреймворка Spring

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("Lesson_02_HW/task_02/config");

        Director director = context.getBean(Director.class);

        director.manageStaff();

    }
}
