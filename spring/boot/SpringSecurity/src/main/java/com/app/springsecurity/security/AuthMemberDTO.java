package com.app.springsecurity.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class AuthMemberDTO extends User {

    private String email;
    private String name;

    public AuthMemberDTO(
                        String username,
                        String password,
                        Collection<? extends GrantedAuthority> authorities
    ) {

        super(username, password, authorities);
        this.email = email;
        this.name = name;

    }

}
