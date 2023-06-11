package br.com.cursoapi.api.config;

import br.com.cursoapi.api.domain.User;
import br.com.cursoapi.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;
    @Bean
    public void startDB(){

        User user1 = new User(null, "Fabio", "fabio@gmail.com", "123");
        User user2 = new User (null, "Elaine", "elaine@gmail.com", "123");

        repository.saveAll(List.of(user1, user2));

    }

}
