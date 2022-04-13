package com.example.writereadtodb.controller.security;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/signIn")
public class SignInController {

    @GetMapping
    public String getSignIn() {
        return "registration/signIn";
    }
}
