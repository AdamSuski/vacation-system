package pl.suskia.system.vacation.dao;

import pl.suskia.system.vacation.model.User;

import java.util.UUID;

public interface PersonDao {

    public int addUser(UUID id, User user);

    public User getUser(UUID id);

    public int updateUser(UUID id, User user);

    public int deleteUser(UUID id, User user);

}
