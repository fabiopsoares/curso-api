package br.com.cursoapi.api.resources;

import br.com.cursoapi.api.domain.User;
import br.com.cursoapi.api.domain.dto.UserDTO;
import br.com.cursoapi.api.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserResourceTest {

    public static final Integer ID = 1;
    public static final String NAME = "Fabio";
    public static final String EMAIL = "fabio@gmail.com";
    public static final String PASSWORD = "123";

    private User user;
    private UserDTO userDTO;
    @InjectMocks
    private UserResource resource;
    @Mock
    private ModelMapper mapper;
    @Mock
    private UserService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUsers();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUsers(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}