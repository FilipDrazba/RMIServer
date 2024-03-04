package pl.edu.pb.wi.fd;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Database implements IConnection {
    private final List<Car> carList = new LinkedList<>();

    public Database(){
        carList.add(new Car("A"));
        carList.add(new Car("B"));
    }

    @Override
    public List<String> findAllByName(String name) {
        return carList.stream()
                .filter(car -> car.getName().equals(name))
                .map(Car::toString)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findAll() {
        return carList.stream()
                .map(Car::toString)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return carList.toString();
    }
}
