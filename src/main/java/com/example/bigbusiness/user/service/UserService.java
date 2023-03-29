package com.example.bigbusiness.user.service;


import com.example.bigbusiness.user.dto.request.UserSignupRequest;
import com.example.bigbusiness.user.entity.User;
import com.example.bigbusiness.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void signup(UserSignupRequest userSignupRequest) {
        String loginId = userSignupRequest.getLoginId();
        String nickname = userSignupRequest.getNickname();
        String password = userSignupRequest.getPassword();
        String email = userSignupRequest.getEmail();

        userRepository.save(new User(loginId,nickname,password,email));
    }
}
