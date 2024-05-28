package Lesson_03_HW.client;

import Lesson_03_HW.app.controller.CarController;
import Lesson_03_HW.app.domain.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("Lesson_03_HW");

        CarController controller = context.getBean(CarController.class);

        Car car = controller.showById(1);

        System.out.println(car);


    }
}
