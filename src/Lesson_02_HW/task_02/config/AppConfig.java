package Lesson_02_HW.task_02.config;

import Lesson_02_HW.task_02.staff.administration.Director;
import Lesson_02_HW.task_02.staff.administration.ElderBookkeeper;
import Lesson_02_HW.task_02.staff.administration.LawyerManager;
import Lesson_02_HW.task_02.staff.spesialists.Secretary;
import Lesson_02_HW.task_02.staff.spesialists.finance.JuniorBookkeeper;
import Lesson_02_HW.task_02.staff.spesialists.work.Lawyer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Director director(){
        return new Director();
    }

    @Bean
    public ElderBookkeeper elderBookkeeper(){
        return new ElderBookkeeper();
    }

    @Bean
    public LawyerManager lawyerManager(){
        return new LawyerManager();
    }

    @Bean
    public JuniorBookkeeper juniorBookkeeper(){
        return new JuniorBookkeeper();
    }

    @Bean
    public Lawyer lawyer(){
        return new Lawyer();
    }

    @Bean
    public Secretary secretary(){
        return new Secretary();
    }
}
