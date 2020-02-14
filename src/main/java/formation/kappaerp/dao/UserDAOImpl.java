package formation.kappaerp.dao;


import formation.kappaerp.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory factory;

    @Override
    public List<User> getUsers() {
        //current hibernate session
        Session session = factory.getCurrentSession();
        Query query = session.createQuery("from users");
        List<User> users = query.list();
        return users;
    }

    @Override
    public void saveUser(User newUser) {
        Session session = factory.getCurrentSession();
        session.save(newUser);
    }

    @Override
    public User getUser(int userId) {
        return null;
    }

    @Override
    public void deleteUser(int userId) {

    }
}
