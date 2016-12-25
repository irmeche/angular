package fr.rmc.infra;

import com.google.inject.AbstractModule;

import fr.rmc.repository.DummyRepository;
import fr.rmc.repository.UserRepository;
import fr.rmc.repository.impl.mock.DummyMockRepositoryImpl;
import fr.rmc.repository.impl.mock.UserMockRepositoryImpl;
import fr.rmc.service.DummyService;
import fr.rmc.service.UserService;
import fr.rmc.service.impl.DummyServiceImpl;
import fr.rmc.service.impl.UserServiceImpl;

public class UserModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DummyRepository.class).to(DummyMockRepositoryImpl.class);
        bind(DummyService.class).to(DummyServiceImpl.class);

        bind(UserRepository.class).to(UserMockRepositoryImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
    }
}
