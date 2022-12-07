package com.app.board.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardListPage {

    // 페이지 당 출력할 게시물의 개수
    private int countPerPage;

    // 현재 페이지 번호
    private int pageNum;

    // 게시물의 리스트
    private List<BoardDTO> list;

    // 전체 게시물의 개수
    private int totalCount;

    // 페이지의 시작 번호
    private int startNum;

    // 페이지의 끝 번호
    private int endNum;

    // 이전 버튼 출력 여부
    private boolean prev;

    // 다음 버튼 출력 여부
    private boolean next;


    public BoardListPage(
                         int countPerPage,
                         int pageNum,
                         List<BoardDTO> list,
                         int totalCount
    ) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;
        calPageInfo();
    }


    private void calPageInfo() {

        // 끝번호
        this.endNum = (int) (Math.ceil((this.pageNum * 1.0) / 10)) * 10;   // 11 -> 11.0 / 10 -> 1.1 -> 2.0 -> 2 * 10

        // 시작번호
        this.startNum = this.endNum-9;

        // 전체 페이지의 끝번호
        int realEndNum = (int) (Math.ceil((this.totalCount * 1.0) / countPerPage)) ;

        // 구간의 마지막 번호보다 실제 페이지 끝번호가 작으면 endNum은 실제 끝번호가 되어야 한다!!!
        this.endNum = realEndNum < this.endNum ? realEndNum : this.endNum;

        // 이전 구간으로 이용가능한 지
        this.prev = this.startNum > 1;

        // 다음 구간으로 이용가능한 지
        this.next = this.endNum < realEndNum;

    }

}
