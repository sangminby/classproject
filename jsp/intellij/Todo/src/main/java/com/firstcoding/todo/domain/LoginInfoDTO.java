package com.firstcoding.todo.domain;

import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
