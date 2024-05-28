package Lesson_03_HW.app.controller;

import Lesson_03_HW.app.domain.Car;
import Lesson_03_HW.app.service.CarService;
import org.springframework.stereotype.Component;

@Component
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    public Car showById(int id){
        return service.showById(id);
    }
}
