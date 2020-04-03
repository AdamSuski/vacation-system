package pl.suskia.system.vacation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.suskia.system.vacation.dao.UserDao;
import pl.suskia.system.vacation.model.User;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("userDao") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUser(UUID id) {
        return userDao.updateUser(id);
    }

    public int deleteUserById(UUID id) {
        return userDao.deleteUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}
