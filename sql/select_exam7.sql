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
select name, bookname, price, saleprice, price-saleprice as gapprice
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid 
and name='박지성' ;


-- (7) 박지성이 구매하지 않은 도서의 이름
select bookid, bookname
from book 
where bookid not in(select distinct bookid from orders o, customer c where o.custid=c.custid and name='박지성');


-- (8) 주문하지 않은 고객의 이름 (부속질의사용)
select name
from customer
where custid not in(select distinct custid from orders);

select *
from customer c
where not exists(select * from orders o where c.custid=o.custid);

select *
from customer c, orders o
where c.custid=o.custid(+) and o.orderid is null;

select *
from customer c left outer join orders o
on c.custid=o.custid
where o.orderid is null ;


-- (9) 주문금액의 총액과 주문의 평균금액
select sum(saleprice), avg(saleprice)
from orders;


-- (10) 고객의 이름과 고객별 구매액
select c.name, sum(saleprice) as total
from orders o, customer c
where o.custid=c.custid 
group by c.custid, c.name 
order by c.custid ;


-- (11) 고객의 이름과 고객이 구매한 도서목록
select name, bookname
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid ;


-- (12) 도서의가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문
select max(price-saleprice)
from orders o, book b
where o.bookid=b.bookid;

select orderid, price, saleprice, price-saleprice 
from orders o, book b 
where o.bookid=b.bookid 
and price-saleprice = (select max(price-saleprice) 
                       from orders o, book b
                       where o.bookid=b.bookid);
                       
                       
-- (13) 도서의 판매액 평균보다 
-- 자신의 구매액 평균이 더 높은 고객의 이름
select c.custid, name, avg(saleprice)
from customer c, orders o
where o.custid=c.custid
group by c.custid, name
having avg(saleprice) > (select avg(saleprice) from orders)
order by c.custid;

-- 전체 판매액 평균
select avg(saleprice) from orders;


-- (1) 박지성이 구매한 도서의 출판사와 
-- 같은 출판사에서 도서를 구매한 고객의 이름
select name
from customer c, orders o, book b
where o.custid=c.custid and o.bookid=b.bookid
and publisher in(select publisher
                 from customer c, orders o, book b
                 where o.custid=c.custid and o.bookid=b.bookid
                 and name='박지성')
and name <> '박지성' ;


-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select o.custid, name, count(distinct publisher)
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid
group by o.custid, name
having count(distinct publisher)>1;