package web.service;


import web.model.Car;

import java.util.List;

public interface CarService {

    int sizeListCars();
    List<Car> getCars(int count);
}
