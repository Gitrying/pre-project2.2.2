package web.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import web.DAO.CarDao;

import web.model.Car;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> listCars(Integer countCars){
        return carDao.listCars(countCars);
    }
}
