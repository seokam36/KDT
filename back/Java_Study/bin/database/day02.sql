
DROP DATABASE if EXISTS mydb0805;
CREATE DATABASE mydb0805;
show DATABASEs;
use mydb0805;


/* ----------------------------------------- */
/* DDL : 데이터베이스 테이블 생성, 삭제, 수정 질의어 (** 트랜잭션 불가능 / 오토커밋**) */
/* 1) 테이블 생성 : 
        1. 테이블생성할 데이터베이스 활성화 (use)
        2. create table 테이블명(속성명 타입, 속성명 타입) */
CREATE Table test1(필드명1 int, 필드명2 DOUBLE, 필드명3 TEXT);

/* 2) 테이블 목록 조회 */
SHOW TABLES;

/* 3) 특정 테이블 속성 확인 */
DESCRIBE test1;

/* 4) 특정 테이블 삭제 */
DROP TABLE test1;

/* 5) 테이블 수정 */
/* 필드, 속성 추가 */
ALTER Table test1 add 필드명4 FLOAT;

/* 필드, 속성 타입 수정 */
ALTER Table test1 MODIFY 필드명3 longtext;

/* 필드/속성명 , 타입 수정 */
ALTER Table test1 CHANGE 필드명1 필드명5 BIGINT;

/* 테이블 이름 변경 */
RENAME TABLE test1 to new_test1;

/* 테이블 모든 레코드 삭제, 테이블은 유지 */
TRUNCATE Table new_test1;
/* ------------------------------------------------- */

/* 테이블의 속성,필드 타입 */
CREATE Table test2(
    정수필드1 TINYINT,
    정수필드2 SMALLINT,
    정수필드3 MEDIUMINT,
    정수필드4 INT,
    정수필드5 BIGINT,
    정수필드6 INT UNSIGNED,  /* unsigned : 부호가 없음 tinyint(1바이트 -127~128) -> 0~255  */
    실수필드1 FLOAT,
    실수필드2 DOUBLE,
    실수필드3 DECIMAL,       /* decimal : 문자타입 이면서 소수점 오차 없음 */
    날짜필드1 DATE,
    시간필드1 TIME,
    날짜시간필드 DATETIME,
    문자필드1 CHAR(3),      /* char(문자길이) : 문자 고정길이*/
    문자필드2 VARCHAR(3),   /* varchar(문자길이) : 문자 가변길이 */
    문자필드3 TEXT,
    문자필드4 longtext,      /* 사진이 포함된 게시물내용 저장시 : 4G 가능한 longtext */
    논리필드 BOOLEAN
);
DESCRIBE test2;