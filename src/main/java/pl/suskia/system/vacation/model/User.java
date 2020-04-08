package pl.suskia.system.vacation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name="user")
public class User {
    @Id
    @NotNull
    private UUID id;

    @Column(name="first_name", nullable = false)//@NotBlank
    private String firstName;
    @Column(name="surname", nullable = false)//@NotBlank
    private String surname;
    @Column(name="email")
    private String eMail;
    @Column(name="position")
    private String position;
    private UserPermission userPermission;

    public User(@NotNull UUID id, @NotNull String name, @NotNull String surname, UserPermission userPermission) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.userPermission = userPermission;
    }

    public User(@NotNull UUID id, String name){
        this.id = id;
        this.name = name;
        this.surname = name;
        this.userPermission = UserPermission.EMPLOYEE;
    }

    public User(@NotNull UUID id, User user) {
        this.id = id;
        this.name = user.getName();
        this.surname = user.getSurname();
        this.userPermission = user.getUserPermission();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public UserPermission getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(UserPermission userPermission) {
        this.userPermission = userPermission;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
