package pl.suskia.system.vacation.dao;

import org.springframework.stereotype.Repository;
import pl.suskia.system.vacation.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("userDao")
public class UserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int addUser(User user) {
        DB.add(user);
        return 1;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return DB.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return DB;
    }

    @Override
    public int updateUser(UUID id, User userToUpdate) {
        return getUserById(id).map(u -> {
                int indexOfUserToUpdate = DB.indexOf(userToUpdate);
                if (indexOfUserToUpdate >= 0) {
                    DB.set(indexOfUserToUpdate, new User(id, userToUpdate));
                    return 1;
                }
                return 0;
            })
                .orElse(0);
    }

    @Override
    public int deleteUserById(UUID id) {
        Optional<User> userOptional = getUserById(id);
        if (userOptional.isEmpty()) {
            return 0;
        }
        DB.remove(userOptional.get());
        return 1;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}
