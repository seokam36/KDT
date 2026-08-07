drop DATABASE if EXISTS mydb0807;
CREATE DATABASE mydb0807;
use mydb0807;
CREATE Table test(
    num int AUTO_INCREMENT,
    constraint PRIMARY KEY (num),
    name varchar(30) not NULL UNIQUE,
    count int DEFAULT 2
);
/* DML : 조작어  
    1) insert 레코드삽입 
    2) select 레코즈조회
    3) update 레코드수정
    4) delete 레코드삭제 */
/* [1] insert : insert into 테이블명( 속성명1, 속성명2 ) values(값1, 값2) */
INSERT INTO test(num, name, count) VALUES(1,"유재석",10);
INSERT INTO test(name, count) VALUES("강호동",3);
INSERT INTO test(name) VALUES("신동엽");
INSERT INTO test VALUES(4,"ㅇㅇ",30);
INSERT into test(name)VALUES("dddd"),("dsfsa"),("asdflk");
/* [2] select : select * form 테이블명 */
SELECT * from test;         /* 테이블내 (*)모든 레코드 조회 */
SELECT name from test;      /* 테이블내 "name"속성명 검색 */
SELECT name, count from test;
SELECT * from test WHERE name = "유재석";
SELECT * from test WHERE count >= 5;

/* [3] update : update 테이블명 set 속성명 = 새로운값, 속성명2 = 새로운값2 where 조건 */
UPDATE test SET count = 10; /* 조건이 없으므로 테이블내 count속성값 모두 10 */
UPDATE test set count = 30 WHERE name = "유재석";
UPDATE test set count = 40, name = "강호동2" WHERE num = 2;

/* [4] delete : delete from 테이블명 where 조건 */
DELETE from test WHERE name = "유재석";
DELETE from test WHERE num = 2;

/*  delete :테이블내 레코드 삭제 (DML)
    truncate talbe : 테이블내 레코드 삭제 (DDL) 트랜잭션 불가, rollback 불가
    drop table : 테이블 자체 삭제 */
