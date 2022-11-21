package com.firstcodingmvc.springmvc.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginRequest {

    private String uid;
    private String pw;

}
