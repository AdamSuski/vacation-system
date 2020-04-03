package pl.suskia.system.vacation.dao;

import pl.suskia.system.vacation.model.User;

import java.util.List;
import java.util.UUID;

public interface UserDao {

    public int addUser(User user);

    public User getUser(UUID id);

    public List<User> getAllUsers();

    public int updateUser(UUID id);

    public int deleteUserById(UUID id);

    public int deleteUser(User user);

}
