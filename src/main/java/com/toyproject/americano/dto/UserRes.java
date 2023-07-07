package com.toyproject.americano.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRes {


    private String email;
    private String name;
    private String type; // enum 으로 바꾸는게 나을듯?

    @Builder
    public UserRes(String email, String name, String type){
        this.email = email;
        this.name = name;
        this.type = type;
    }

}
