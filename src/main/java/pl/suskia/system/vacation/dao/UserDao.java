package pl.suskia.system.vacation.dao;

import pl.suskia.system.vacation.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    public int addUser(User user);

    public Optional<User> getUserById(UUID id);

    public List<User> getAllUsers();

    public int updateUser(UUID id, User user);

    public int deleteUserById(UUID id);

    public int deleteUser(User user);

}
