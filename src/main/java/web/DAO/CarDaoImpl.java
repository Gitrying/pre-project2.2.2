package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{
    public List<Car> listCars(Integer countCars){
        List<Car> list1= new ArrayList<>();
        list1.add(new Car("black","BMW",100));
        list1.add(new Car("green","AUDI",90));
        list1.add(new Car("white","Mercedez",80));
        list1.add(new Car("orange","Lada",120));
        list1.add(new Car("blue","Hyundai",100));
        if (countCars == null || countCars > list1.size()) {
            return list1;
        } else {
            List<Car> list2 = new ArrayList<>();
            for (int i = 0; i < countCars; i++) {
                list2.add(list1.get(i));
            }
            return list2;
        }
    }
}
