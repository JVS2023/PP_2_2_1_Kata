package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
   public static void main(String[] args) {
      try (AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(AppConfig.class)) {
         UserService userService = context.getBean(UserService.class);
         userService.saveUser(new User("Ivan", "Chudov", "IvanCh@gmail.com", new Car("Lada Vesta", 3)));
         userService.saveUser(new User("Petr", "Isaev", "PetrIs@yandex.ru", new Car("BMW", 7)));
         userService.saveUser(new User("Victor", "Vetrov", "Victor20@mail.ru", new Car("Mazda CX", 5)));
         userService.saveUser(new User("Olga", "Markova", "Olga16@gmail.com", new Car("UAZ Patriot", 2)));
         List<User> userList = userService.listUsers();
         userList.forEach(System.out::println);

         List<User> list = userService.getUser(new Car("Mazda CX", 5));
         list.forEach(System.out::println);
      }

   }
}
