package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> listUsers();

    List<User> getUser(Car car);
}
