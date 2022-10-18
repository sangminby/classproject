-- 20221018

-- inline view - rownum
-- from 절 뒤에 오는 서브쿼리 => inline view
-- select -> 결과도 테이블

select rownum, emp.* from emp order by hiredate ;

-- rownum : 사용자가 생성하는 컬럼이 아니다, 시스템에서 제공하는 컬럼

select rownum, t.*
from (select * from emp order by hiredate) t;

-- top3 
-- 입사일이 가장 오래된 3명을 구하자
select rownum, t.*
from (select * from emp order by hiredate) t
where rownum<=5;

--------------------------------------------------------------------------------
-- ddl : 정의 -> 객체를 정의하는 명령어

-- 데이터의 저장공간 생성 
-- create table 테이블이름 ( 
--                         컬럼이름 타입 (제약조건), 
--                         컬럼이름 타입 (제약조건)
--                         ...
--                        )

-- 테이블 생성과 제약조건
create table emp01 (
    empno number(4) constraint emp01_empno_pk primary key,
    ename varchar2(10) constraint emp01_ename_nn not null,
    job varchar2(9)constraint emp01_job_uk unique,
    sal number(7,2) constraint emp01_sal_sk check(sal between 500 and 5000),
    gender char(1) constraint emp01_gender_gk check(gender in('M', 'F')), 
    deptno number(2) constraint emp01_deptno_fk references dept(deptno),
    hiredate date default sysdate
);
insert into emp01(empno, ename, job, sal, gender, deptno) 
            values(1111, 'KING', '대표', 5000, 'M', 10);

select * from emp01;            
            
drop table emp02;

create table emp02 (
    empno number(4),
    ename varchar2(10) constraint emp02_ename_nn not null,
    job varchar2(9),
    sal number(7,2),
    gender char(1), 
    deptno number(2),
    hiredate date default sysdate,
    constraint emp02_empno_pk primary key(empno),
    constraint emp02_job_uk unique (job),
    constraint emp02_sal_ck check (sal between 500 and 5000),
    constraint emp02_gender_ck check (gender in('M', 'F')),
    constraint emp02_deptno_fk foreign key (deptno) references dept(deptno)
);

insert into emp02(empno, ename, job, sal, gender, deptno) 
            values(1111, 'KING', '대표', 5000, 'M', 10);


select * from emp02;
desc emp02;
insert into emp02 values(1112, 'SON', '대리', 500, 'M', 40, '2022-10-17');
insert into emp02 (empno, ename) values(1113, 'SCOTT'); -- 지정 입력되지 않은 컬럼에는 NULL 값이 등록 : 암묵적인 입력 방법

insert into emp02 values(1114, 'HOT', null, null, null, null, null);
insert into emp02 values(1114, 'HOT', '', '', '', '', '');

--------------------------------------------------------------------------------
-- 데이터의 수정
-- update 테이블이름 set 컬럼이름-새로운값, 컬럼이름-새로운값 where 행 선택 조건

drop table emp03;

create table emp03 as select * from emp;

select * from emp03;

-- 모든 사원의 부서번호를 30으로 변경
update emp03 set deptno=30;

-- 모든 사원의 급여를 10% 인상
update emp03 set sal = sal*1.1;

-- 모든 사원의 입사일을 오늘 날짜로 변경
update emp03 set hiredate = sysdate;

-- 부서번호가 10번인 사원의 부서번호를 30번으로 변경
update emp03 set deptno=30 where deptno=10;

-- 급여가 3000 이상인 사원들의 급여를 10% 인상
update emp03 set sal = sal*1.1 where sal>=3000;

-- scott 사원 20번 부서로 이동, 직급을 manager 로 변경
update emp03 set deptno=40, job='MANAGER' where ename='SCOTT';

-- SMITH 사원을 SCOTT 사원의 부서로 이동
update emp03 set deptno=(select deptno from emp03 where ename='SCOTT') where ename='SMITH';

 
drop table dept01;
create table dept01 as select * from dept;
select * from dept01;

-- 부서 번호가 20번인 부서의 이름과 지역은 RESEARCH와 DALLAS입니다.
-- 부서번호가 20인 부서의 부서명과 지역명을 부서 번호가 40번인 부서와 동일하게 변경
update dept01 set (dname, loc) = (select dname, loc from dept01 where deptno=40)
where deptno=20;

--------------------------------------------------------------------------------
-- 테이블의 행을 삭제
-- delete from 테이블이름 where 행선택조건

-- DELETE 문으로 부서 테이블의 모든 행을 삭제합시다. 
delete from dept01;

-- 선택 행 삭제

-- 대표사퇴
delete from emp03 where empno=7839 ;

-- 40번 부서의 모든 사원의 사퇴
delete from emp03 where deptno=40 ;

-- sales 부서의 사원이 모두 퇴사 -> 삭제
delete from emp03 where deptno=(select deptno, loc from dept where dname='SALES');