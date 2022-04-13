package com.example.writereadtodb.service;

import com.example.writereadtodb.WriteReadToDbApplicationTests;
import com.example.writereadtodb.model.User;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RequiredArgsConstructor
class UserServiceImplTest extends WriteReadToDbApplicationTests {

    private final UserService userService;

    @Test
    void addUser() {
        int countBefore = userService.getAll().size();
        User user = createTestUser();
        userService.addUser(user);
        int countAfter = userService.getAll().size();

        assertNotEquals(countBefore, countAfter);
    }

    @Test
    void updateUser() {
        User user = createTestUser();
        User duplicate = createTestUser();

        user.setFirstName("Peter");
        user.setLastName("Parker");
        user.setRole(User.Role.USER);

        assertNotEquals(user, duplicate);
    }

    @Test
    @Transactional
    void getById() {
        User userByID = userService.getById(1);

        assertNotNull(userByID);
        assertNotNull(userByID.getFirstName());
        assertNotNull(userByID.getLastName());
        assertNotNull(userByID.getRole());
        assertNotNull(userByID.getLogin());
    }

    @Test
    void getAll() {
        List<User> users = userService.getAll();
        assertNotNull(users);
    }

    @Test
    void deleteUser() {
        User user = createTestUser();
        userService.addUser(user);
        int sizeBefore = userService.getAll().size();

        Integer catId = user.getUserId();
        userService.deleteUser(catId);
        int sizeAfter = userService.getAll().size();

        assertNotEquals(sizeBefore, sizeAfter);
    }
}
