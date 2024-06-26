package Lesson_03_HW.app.repository;

import Lesson_03_HW.app.domain.Car;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryList implements CarRepository{

    private List<Car> database = new ArrayList<>();

    public CarRepositoryList(){
        database.add(new Car(50_000, "BMW", new BigDecimal(30_000), "AA1213XQ"));
        database.add(new Car(100_000, "Mercedes", new BigDecimal(35_000), "AL1223423Q"));
        database.add(new Car(10_000, "Audi", new BigDecimal(50_000), "AK234HWM"));
    }
    @Override
    public Car showById(String idNum) {

        Car car = null;

        for(Car cars : database){
            if(cars.getId().contains(idNum)){
                car = cars;
            }
        }
        return car;
    }


}
