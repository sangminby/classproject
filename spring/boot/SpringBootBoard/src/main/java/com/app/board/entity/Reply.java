package com.app.board.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_reply")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer rno;

    @Column
    private Integer bno;

    @Column
    private String reply;

    @Column
    private String replyer;

    @Column(insertable = false)
    private LocalDate replyDate;

    @Column(insertable = false)
    private LocalDate updateDate;

}
