package fr.rmc.service.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import fr.rmc.domain.User;
import fr.rmc.repository.DummyRepository;
import fr.rmc.service.DummyService;

@Singleton
public class DummyServiceImpl implements DummyService {

    private final DummyRepository dummyRepository;

    @Inject
    public DummyServiceImpl(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    @Override
    public User getDefaultUser() {
        return this.dummyRepository.getDefaultUser();
    }

}
