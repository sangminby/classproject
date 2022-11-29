package com.firstcoding.todo.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SearchOption {

    private String searchType;
    private String keyword;

}
