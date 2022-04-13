package com.example.writereadtodb.controller.security;

import com.example.writereadtodb.model.User;
import com.example.writereadtodb.service.security.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/signUp")
public class SignUpController {

    private final SignUpService signUpService;

    @GetMapping
    public String getSignUpPage() {
        return "registration/signUp";
    }

    @PostMapping
    public String signUpUser(User user) {
        signUpService.signUpUser(user);
        return "redirect:/signIn";
    }
}
