package Lesson_02_HW.task_02.staff.administration;

import Lesson_02_HW.task_02.staff.spesialists.Secretary;
import org.springframework.beans.factory.annotation.Autowired;

public class Director {

    @Autowired
    private ElderBookkeeper elderBookkeeper;

    @Autowired
    private LawyerManager lawyerManager;

    @Autowired
    private Secretary secretary;

    public void manageStaff(){
        elderBookkeeper.giveOrders();
        lawyerManager.giveOrders();
        secretary.doWork();
    }

    public void setElderBookkeeper(ElderBookkeeper elderBookkeeper) {
        this.elderBookkeeper = elderBookkeeper;
    }

    public void setLawyerManager(LawyerManager lawyerManager) {
        this.lawyerManager = lawyerManager;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
}
