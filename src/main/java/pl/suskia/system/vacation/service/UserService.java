package pl.suskia.system.vacation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.suskia.system.vacation.dao.UserDao;
import pl.suskia.system.vacation.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("postgres") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUser(UUID id, User newUser) {
        return userDao.updateUser(id, newUser);
    }

    public int deleteUserById(UUID id) {
        return userDao.deleteUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public Optional<User> getUserById(UUID id) {
        return userDao.getUserById(id);
    }

}
