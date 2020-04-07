package pl.suskia.system.vacation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.suskia.system.vacation.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserPostgresDataAccessService implements UserDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserPostgresDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        final String sql = "SELECT id, name FROM user_dev WHERE id = ?";

        User user = jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                ((resultSet, i) -> {
                    UUID userId = UUID.fromString(resultSet.getString("id"));
                    String name = resultSet.getString("name");
                    return new User(userId, name);
                }));

        return Optional.ofNullable(user);
    }

    @Override
    public List<User> getAllUsers() {
        final String sql = "SELECT id, name FROM user_dev";
        return jdbcTemplate.query(sql, ((resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new User(id, name);
        }));
    }

    @Override
    public int updateUser(UUID id, User user) {
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
