package com.firstcoding.todo.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberRegiRequestDTO {

    @NotEmpty
    private String uid;

    @NotEmpty
    private String pw;

    @NotEmpty
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
