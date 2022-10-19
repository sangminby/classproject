-- 20221019

-- transaction : 일의 단위 -> 여러 DML 들의 묶어둔 것
-- commit : 작업의 완료 -> 데이터의 물리적 저장
-- rollback : 작업 실패 -> 마지막 물리적 저장 상태로 복귀
drop table dept02;
create table dept02
as
select * from dept;

-- DDL 작업 후 자동 commit
select * from dept02;

-- 트랜잭션 시작
insert into dept02 values(50,'개발', '서울') ;
insert into dept02 values(60,'기획', '판교') ;
update dept02 set loc='제주' where deptno=60;

rollback;
commit;

--------------------------------------------------------------------------------
-- 가상테이블 : View
-- 데이터를 제한 할 수 있고, 복잡한 sql을 단순하게 처리할 수 있다
select empno, ename, deptno from emp where deptno=30;

-- view 생성
create or replace view emp_view30
as
select empno, ename, deptno from emp where deptno=30;

select * from emp_view30 where ename='JAMES';


select view_name, text from user_views;

drop view emp_view30 ;

--------------------------------------------------------------------------------
-- sequence : 자동 숫자 생성기
create sequence seq_dept_deptno
start with 10
increment by 10 ;

create sequence seq_emp_empno;
select seq_emp_empno.nextval from dual;

-- 새로운 값을 생성 : nextval -> 다음 값을 생성해서 변환
select seq_dept_deptno.nextval from dual;
select seq_dept_deptno.currval from dual;

-- sequence 삭제
drop sequence seq_dept_deptno;

drop table dept04;

create table dept04
as
select * from dept where 1=0;
select * from dept04;

insert into dept04 values (seq_dept_deptno.nextval, '개발', '서울') ;

--------------------------------------------------------------------------------
-- index : 검색의 성능을 향상 시킬때 사용

drop table emp01;

create table emp01
as
select * from emp ;
select * from emp01;

insert into emp01 select * from emp01;

insert into emp01(empno, ename) values(1111, 'SON') ;

select * from emp01 where ename='SON' ;

-- index 생성
create index index_emp01_ename on emp01(ename) ;
drop index index_emp01_ename ;

select * from emp01 where empno=1111 and ename like '%SON%';