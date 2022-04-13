package com.example.writereadtodb;

import com.example.writereadtodb.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = "test")
public class WriteReadToDbApplicationTests {

    @LocalServerPort
    protected int port;
    protected String baseUrl = "http://localhost:";

    @Autowired
    private PasswordEncoder passwordEncoder;

    @BeforeEach
    public void setUp() {
        baseUrl = baseUrl.concat(port + "");
    }

    @Test
    void contextLoads() {
    }

    protected User createTestUser() {
        return User.builder()
                .userId(1)
                .role(User.Role.ADMIN)
                .eMail("test@test.ru")
                .firstName("Alexey")
                .lastName("Pavlovskiy")
                .secondName("Vas")
                .phoneNumber(89005558822L)
                .login("test")
                .password(passwordEncoder.encode("test"))
                .build();
    }
}
