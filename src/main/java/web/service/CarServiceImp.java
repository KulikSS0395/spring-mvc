package web.service;

import web.Dao.CarDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
@Service
@Component
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;


    @Override
    public int sizeListCars() {
        return carDao.sizeListCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
