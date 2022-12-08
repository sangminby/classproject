package com.app.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BoardEditRequest {

    private int bno;
    private int currPageNum;
    private String title;
    private String writer;
    private String content;
    private String oldFile;
    private MultipartFile formFile;


    public BoardDTO toboardDTO() {

        return BoardDTO.builder()
                .bno(bno)
                .title(title)
                .writer(writer)
                .content(content)
                .photo(oldFile)
                .build();
    }

}
