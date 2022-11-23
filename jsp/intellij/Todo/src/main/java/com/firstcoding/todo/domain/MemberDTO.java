package com.firstcoding.todo.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberDTO {

    private int idx;
    private String uid;
    private String pw;
    private String uuid;
    private String uname;
    private String uphoto;

    public LoginInfoDTO toLoginInfoDTO() {

        LoginInfoDTO loginInfoDTO = LoginInfoDTO.builder()
                                                .uid(this.uid)
                                                .uname(this.uname)
                                                .uphoto(this.uphoto)
                                                .build();

        return loginInfoDTO;
    }

}
