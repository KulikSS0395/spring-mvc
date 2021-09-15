package web.Dao;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("lada", "blue", 2000));
        cars.add(new Car("volvo", "red", 1998));
        cars.add(new Car("tesla", "black", 2022));
        cars.add(new Car("uaz", "hakki", 1995));
        cars.add(new Car("bmw", "grey", 2008));
    }

    @Override
    public int sizeListCars() {
        return cars.size();
    }

    @Override
    public List<Car> getCars(int count) {
        if(count > 0 & count < 5 ) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
