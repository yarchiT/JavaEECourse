package main.java.com.tykhonchuk.diAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Rider {
    @Autowired
    private Collection<Vehicle> cars;

    public void rideCar(Vehicle vehicle){
        vehicle.start();
    }

    public Collection<Vehicle> getCars() {
        return cars;
    }

    public void setCars(Collection<Vehicle> cars) {
        this.cars = cars;
    }
}
