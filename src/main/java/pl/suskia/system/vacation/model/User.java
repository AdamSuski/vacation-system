package pl.suskia.system.vacation.model;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class User {

    @NotNull
    private UUID id;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    private String eMail;
    private String position;
    private UserPermission userPermission;

    public User(@NotNull UUID id, @NotNull String name, @NotNull String surname, UserPermission userPermission) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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
