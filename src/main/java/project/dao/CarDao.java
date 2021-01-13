package project.dao;

import java.util.List;
import project.models.Car;

public interface CarDao {
    Car create(Car car);

    Car get(Long id);

    List<Car> getAll();

    Car update(Car car);

    boolean delete(Long id);

    List<Car> getAllByDriver(Long driverId);
}
