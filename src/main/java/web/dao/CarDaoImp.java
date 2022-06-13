package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car("model1","Black", 2020));
        listCar.add(new Car("model2","Red", 2022));
        listCar.add(new Car("model3","White", 2021));
        listCar.add(new Car("model4","Blue", 2020));
        listCar.add(new Car("model5","Grey", 2022));
    }
        @Override
        public List<Car> getCars(int count) {
            if (count == 0) {
                return listCar;
            }

            return listCar.stream().limit(count).collect(Collectors.toList());
        }
}
