package pl.suskia.system.vacation.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.suskia.system.vacation.model.User;
import pl.suskia.system.vacation.service.UserService;

import java.util.UUID;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(User user) {
        userService.addUser(user);
    }

    @PutMapping
    public void updateUser(UUID id) {
        userService.updateUser(id);
    }

    @DeleteMapping
    public void deleteUser(UUID id) {
        userService.deleteUserById(id);
    }

    @GetMapping
    public void getAllUsers() {
        userService.getAllUsers();
    }
}
