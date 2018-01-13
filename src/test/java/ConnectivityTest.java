import com.company.dao.DaoFactory;
import com.company.dao.UserDao;
import com.company.entity.Role;
import com.company.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConnectivityTest {

    private Connection connection;

    private UserDao dao;

    @Before
    public void before(){
        dao = DaoFactory.getInstance().createUserDao();
    }

    @After
    public void after(){
        dao.close();
    }

    @Test
    public void whenGetUserWhichExistThenReturnUser() {
        final User user = dao.read("admin");
        final User expected = new User();
        expected.setId(2);
        expected.setLogin("admin");
        expected.setPassword("admin");
        expected.setEmail("admin@gmail.com");
        expected.setRole(Role.ADMIN);
        assertThat(user, is(expected));
    }

    @Test
    public void whenUserNotExistThenAdd(){
        final User user = new User();
        user.setLogin("jenya");
        user.setPassword("666");
        user.setEmail("jenya@gmail.com");
        user.setRole(Role.ADMIN);
        try {
            dao.create(user);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
