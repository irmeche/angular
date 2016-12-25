package fr.rmc.service;

import java.util.List;

import fr.rmc.domain.User;

public interface UserService {

    List<User> getAllUsers();

    User getById(int id);

    User createNewUser(User user);

    User update(User user);

    void remove(int id);

    int getNumberOfUsers();
}
