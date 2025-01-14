package ru.kata.spring.boot_security.demo.Service;


import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();

    Role getRole(long id);

    void saveRole(Role role);
}
