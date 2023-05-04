package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.Session;

import java.util.List;

public interface UserDao {
   void saveUser(User user);

   List<User> listUsers();

   List<User> getUser(Car car);

}
