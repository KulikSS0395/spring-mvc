package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    int sizeListCars();
    List<Car> getCars(int count);
}
