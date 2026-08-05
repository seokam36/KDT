
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
/* ------------------------------------------------------------- */
/* 속성,필드 제약조건 */
CREATE Table test3(
    필드명1 TINYINT not null,           /* 해당 필드 null X */
    필드명2 SMALLINT UNIQUE,            /* 해당 필드 중복값 저장 X */
    필드명3 INT DEFAULT 100,            /* 해당 필드 레코드 생성시 기본값 100 설정 */
    필드명4 DATETIME DEFAULT now(),     /* 레코드(행) 삽입시 현재날짜,시간 자동 대입 */
    필드명5 BIGINT AUTO_INCREMENT/*  PRIMARY KEY */,/* 레코드 삽입시 자동 순서번호 설정 , 기본키 설정 PK (not null, unique 내장) */
    constraint PRIMARY KEY( 필드명5 )   /* 필드명5 기본키로 지정 */
);

CREATE Table test4(
    필드명1 BIGINT,
    constraint FOREIGN KEY(필드명1) REFERENCES test3(필드명5) on delete CASCADE
    /* 
    참조 옵션 : PK가 삭제, 수정된 경우 FK 어떻게 되는지
        1. on delete/update CASCADE : pk 삭제/수정되면 fk같이 삭제/수정
        2. on delete/update set null : fk null 설정
        3. on delete/update RESTRICT : 생략시 기본값, pk가 fk로부터 참조 중이면 삭제/수정 불가능
    */
);

/* 예제1) 회원제 게시판 */
DROP DATABASE IF EXISTS boardservice0805;
CREATE DATABASE boardservice0805;
use boardservice0805;
CREATE Table member(
    m_num int AUTO_INCREMENT,        /* 자동 회원번호 할당 */
    constraint PRIMARY KEY(m_num),    /* 회원번호 PK 설정 */
    m_id VARCHAR(30) not NULL UNIQUE,    /* 최대 30글자, 공백X, 중복X */
    m_pw VARCHAR(20) not NULL,
    m_name VARCHAR(10) not NULL,
    m_date DATETIME DEFAULT now()
);
CREATE Table board(
    b_num int AUTO_INCREMENT,
    constraint PRIMARY KEY(b_num),
    b_title VARCHAR(255),
    b_content longtext,
    b_date DATETIME DEFAULT now(),
    b_view int DEFAULT 0,
    m_num int,
    constraint FOREIGN KEY (m_num) REFERENCES member(m_num) on delete CASCADE
);
