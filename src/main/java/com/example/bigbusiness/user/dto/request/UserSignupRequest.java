package com.example.bigbusiness.user.dto.request;

import com.example.bigbusiness.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSignupRequest {

    private String loginId;

    private String nickname;

    private String password;

    private String email;


    public User toUser(){
        return new User(
            this.getLoginId(),
            this.getNickname(),
            this.getPassword(),
            this.getEmail()
        );
    }
}
