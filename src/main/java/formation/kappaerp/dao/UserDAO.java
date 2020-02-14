package formation.kappaerp.dao;

import formation.kappaerp.entities.User;

import java.util.List;

public interface UserDAO {
    public List<User> getUsers();

    public void saveUser(User newUser);

    public User getUser(int userId);

    public void deleteUser(int userId);
}
