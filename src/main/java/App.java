import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.User;
import test.UserDAO;

/**
 * Created by ivan on 22.10.15.
 */
public class App {

    public static void main(String[] s) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" }, true);

        UserDAO studDao = (UserDAO) context.getBean("userDao");
        System.out.println(studDao.list());
        for (User user : studDao.list()) {
            System.out.println(user.getUsername());
        }
        User data1 = new User();
        data1.setUsername("Alex");
        data1.setPassword("1111");
        data1.setEmail("Em");
        studDao.save(data1);
//        User data2 = new User("Bob");
//        studDao.save(data2);
//        User data3 = new User("Alice");
//        studDao.save(data3);
//        System.out.println(studDao.find("A%").size());

        ChainStore chainStore = new ChainStore();
        chainStore.createDataBase();
        Printer printer = new Printer(chainStore);
        printer.printTitle();
        InputController inputData = new InputController(System.in, printer);
        inputData.setPointFromUser();

    }
}
