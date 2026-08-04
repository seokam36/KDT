/* [1] SQL문법; */
SHOW DATABASES;
/* [2] 데이터베이스 로컬 경로 */
SHOW VARIABLES LIKE 'datadir';
/* [3] 데이터베이스 생성 주의할점 : 중복된 데이터베잇으명 불가능, 대소문자 구분 X*/
CREATE DATABASE mydb0804;
/* [4] 데이터베이스 삭제
 if exists 존재하면 삭제 */
DROP DATABASE mydb0804;
DROP DATABASE IF EXISTS mydb0804;
/* [5] 데이터베이스 활성화 : 연결된 DB서버내 여러 데이터베이스 중 조작할 DB를 선택 */
USE mydb0804;
/* [활용] : 프로젝트 데이터베이스 초기화 한다.  */
DROP DATABASE IF EXISTS test0804;
CREATE DATABASE test0804;
use test0804;
