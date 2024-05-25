package Lesson_02_HW.task_02.staff.administration;

import Lesson_02_HW.task_02.staff.spesialists.finance.JuniorBookkeeper;
import org.springframework.beans.factory.annotation.Autowired;

public class ElderBookkeeper {

    @Autowired
    private JuniorBookkeeper juniorBookkeeper;

    public void  giveOrders(){
        juniorBookkeeper.doWork();
    }

    public void setJuniorBookkeeper(JuniorBookkeeper juniorBookkeeper) {
        this.juniorBookkeeper = juniorBookkeeper;
    }
}
