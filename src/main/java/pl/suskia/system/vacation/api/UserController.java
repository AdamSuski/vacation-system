package pl.suskia.system.vacation.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.suskia.system.vacation.model.User;
import pl.suskia.system.vacation.service.UserService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/users")
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@Valid @NotNull @RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping(path = "{id}")
    public void updateUser(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody User userToUpdate) {
        userService.updateUser(id, userToUpdate);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable UUID id) {
        userService.deleteUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public User getUserByID(@PathVariable("id") UUID id) {
        return userService.getUserById(id).orElse(null);
    }
}
