package com.example.writereadtodb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FrontendController {

    @GetMapping
    public String start() {
        return "/registration/signIn";
    }
}
