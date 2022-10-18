-- 20221017 문제풀이2

-- (5) 박지성이 구매한 도서의 출판사 수
select count(distinct publisher)
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name='박지성';

select count(distinct publisher)
from orders o, book b
where o.bookid=b.bookid and custid=(select custid from customer where name='박지성');


-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이

-- (7) 박지성이 구매하지 않은 도서의 이름


-- (8) 주문하지 않은 고객의 이름 (부속질의사용)

-- (9) 주문금액의 총액과 주문의 평균금액

-- (10) 고객의 이름과 고객별 구매액

-- (11) 고객의 이름과 고객이 구매한 도서목록



