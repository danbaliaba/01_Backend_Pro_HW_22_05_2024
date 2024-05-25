package Lesson_02_HW.task_02.staff.administration;

import Lesson_02_HW.task_02.staff.spesialists.work.Lawyer;
import org.springframework.beans.factory.annotation.Autowired;

public class LawyerManager {

    @Autowired
    private Lawyer lawyer;

    public void giveOrders(){
        lawyer.doWork();
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }
}
