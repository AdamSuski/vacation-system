package pl.suskia.system.vacation.dao;

import org.springframework.stereotype.Repository;
import pl.suskia.system.vacation.model.User;

import java.util.List;
import java.util.UUID;

@Repository("userDao")
public class UserDataAccessService implements UserDao {
    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public User getUser(UUID id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public int updateUser(UUID id) {
        return 0;
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}
