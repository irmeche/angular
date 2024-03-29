package fr.rmc.repository;

import fr.rmc.domain.User;

public interface UserRepository extends Repository<User> {
    User create(User user);

    User update(User user);

    void remove(int id);

    int getNumberOfUsers();
}
