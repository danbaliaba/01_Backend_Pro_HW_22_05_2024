package Lesson_03_HW.app.service;

import Lesson_03_HW.app.domain.Car;
import Lesson_03_HW.app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class CarServiceImpl implements CarService{

    private CarRepository repository;

    private String vinPrefix;

    public CarServiceImpl(CarRepository repository, @Value("${vinPrefix}") String vinPrefix) {
        this.repository = repository;
        this.vinPrefix = vinPrefix;
    }

    @Override
    public Car showById(int id) {
        Car car = repository.showById(id);
        setVin(car);
        return car;
    }

    private void setVin(Car car){
        String vin = String.format("%s-%s", vinPrefix, car.getId());
        car.setVin(vin);
    }
}
