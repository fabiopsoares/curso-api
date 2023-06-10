package br.com.cursoapi.api.services;

import br.com.cursoapi.api.domain.User;
import br.com.cursoapi.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}
