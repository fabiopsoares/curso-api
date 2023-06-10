package br.com.cursoapi.api.services;

import br.com.cursoapi.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
