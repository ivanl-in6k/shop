package test;

import java.util.Collection;

/**
 * Created by ivan on 23.10.15.
 */
import java.util.List;


public interface UserDAO {
    public List<User> list();

    public User save(User user);
}