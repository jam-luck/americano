package com.toyproject.americano.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserReq {
    private String email;

    public UserReq(String email){
        this.email = email;
    }
}