-- 20221014 문제풀이2

-- (3) 박지성의 총구매액(박지성의 고객번호는 1번으로 놓고 작성)
select sum(saleprice) as totalpay
from orders
where custid = 1;

-- (4) 박지성이 구매한 도서의 수 (박지성의 고객번호는 1번으로 놓고 작성)
select count(*) 
from orders
where custid = 1;

-- (1) 마당서점 도서의 총개수
select count(*) from book;

-- (2) 마당서점에 도서를 출고하는 출판사의 총개수
select count(distinct publisher) from book;