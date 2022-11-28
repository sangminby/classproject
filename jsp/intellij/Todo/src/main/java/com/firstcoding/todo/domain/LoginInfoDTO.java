package com.firstcoding.todo.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginInfoDTO {

    private String uid;
    private String uname;
    private String uphoto;

}
