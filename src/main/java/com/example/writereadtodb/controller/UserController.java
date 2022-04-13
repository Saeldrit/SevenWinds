package com.example.writereadtodb.controller;

import com.example.writereadtodb.model.User;
import com.example.writereadtodb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String getUserList(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        return "/users";
    }

    @GetMapping("/users/{id}")
    public String getUsersPage(Model model, @PathVariable Integer id) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "/information_user";
    }

    @GetMapping("/user-add")
    public String userAdd() {
        return "/user_add";
    }

    @PostMapping("/user-add")
    public String userAdd(User user) {
        userService.addUser(user);
        return "redirect:/user-add";
    }

    @PostMapping("/users/{user-id}/delete")
    public String deleteUser(@PathVariable("user-id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @PostMapping("/user/{user-id}/update")
    public String updateUser(@PathVariable("user-id") Integer id,
                             @ModelAttribute User user) {
        userService.updateUser(id, user);
        return "redirect:/users";
    }
}
