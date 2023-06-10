package br.com.cursoapi.api.services.impl;

import br.com.cursoapi.api.domain.User;
import br.com.cursoapi.api.repositories.UserRepository;
import br.com.cursoapi.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public User findById(Integer id) {

        Optional<User> obj = repository.findById(id);

        return obj.orElse(null);
    }
}