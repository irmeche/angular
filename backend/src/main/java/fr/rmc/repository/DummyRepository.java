package fr.rmc.repository;

import fr.rmc.domain.User;

public interface DummyRepository extends Repository<User> {
    User getDefaultUser();
}
