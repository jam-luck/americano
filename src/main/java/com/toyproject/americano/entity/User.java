package com.toyproject.americano.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id
    @Column(nullable = false)
    private String email;
    @Column(nullable = true)
    private String name;
    @Column(nullable = false)
    private String type; // enum 으로 바꾸는게 나을듯?

    @Builder
    public User(String email, String name, String type){
        this.email = email;
        this.name = name;
        this.type = type;
    }

}
