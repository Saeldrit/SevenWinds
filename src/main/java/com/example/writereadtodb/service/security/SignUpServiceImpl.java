package com.example.writereadtodb.service.security;

import com.example.writereadtodb.model.User;
import com.example.writereadtodb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Override
    public void signUpUser(User user) {
        userRepository.save(User.builder()
                .role(User.Role.USER)
                .eMail(user.getEMail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .secondName(user.getSecondName())
                .phoneNumber(user.getPhoneNumber())
                .login(user.getLogin())
                .password(passwordEncoder.encode(user.getPassword()))
                .build());
    }
}
