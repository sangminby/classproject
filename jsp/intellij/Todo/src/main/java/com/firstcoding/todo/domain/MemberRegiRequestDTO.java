package com.firstcoding.todo.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberRegiRequestDTO {

    private String uid;
    private String pw;
    private String uname;
    private MultipartFile uphoto;

    public MemberDTO toMemberDTO() {

        MemberDTO memberDTO = MemberDTO.builder()
                .uid(this.uid)
                .pw(this.pw)
                .uname(this.uname)
                .build();

        return memberDTO;
    }

}
