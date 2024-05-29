package Lesson_03_HW.app.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private int mileage;
    private String model;
    private BigDecimal price;
    private String vin;
    private String id;

    public Car(int mileage, String model, BigDecimal price, String id) {
        this.mileage = mileage;
        this.model = model;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mileage, model, price, vin);
    }

    @Override
    public String toString() {
        return String.format("Mileage: %d, Model: %s, Price - %s, VIN: %s " ,
                mileage, model, price, vin);
    }

    public String getId() {
        return id;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
