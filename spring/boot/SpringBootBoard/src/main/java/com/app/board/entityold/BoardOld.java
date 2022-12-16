package com.app.board.entityold;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tnl_board")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BoardOld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int bno;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String writer;

    @Column
    private String photo;

    @Column
    private LocalDate regdate;

    @Column
    private LocalDate updatedate;

}
