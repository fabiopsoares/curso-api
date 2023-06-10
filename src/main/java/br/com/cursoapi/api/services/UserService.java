package br.com.cursoapi.api.services;

import br.com.cursoapi.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
