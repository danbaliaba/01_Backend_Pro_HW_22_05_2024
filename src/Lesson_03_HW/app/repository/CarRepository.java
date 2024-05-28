package Lesson_03_HW.app.repository;

import Lesson_03_HW.app.domain.Car;

public interface CarRepository {

    // id - в моей реализации это индекс в массиве
    public Car showById(int id);
}
