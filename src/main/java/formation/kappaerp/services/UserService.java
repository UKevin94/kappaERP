package formation.kappaerp.services;

import formation.kappaerp.entities.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();

    public void saveUser(User newUser);

    public User getUser(int userId);

    public void deleteUser(int userId);
}
