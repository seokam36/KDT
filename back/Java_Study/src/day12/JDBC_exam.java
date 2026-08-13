package day12;

import java.sql.*;

public class JDBC_exam {
    public static void main(String[] args) {
        // JDBC -> 자바와 데이터베이스 연동 제공하는 인터페이스
        // [준비] 프로젝트내 lib 폴더에 'mysql-connector-j-26.7.0.jar' 파일 저장
        // [연동]
        try {
            // [1] MYSQL 회사에서 제공하는 Driver 동적 로드 *예외처리 필수*
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("연동 성공");

            // [2] 데이터베이스 서버 연동 *예외처리 필수*
            String url = "jdbc:mysql://localhost:3306/mydb0813";
            String user = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연동성공");

            // [3] 데이터베이스 내 DML(insert,select,update,delete) 조작
            // 1. insert 하기
            String sql = "insert into test(name) values ('유재석')";  // 자바 문자열에 SQL 작성
            PreparedStatement ps = conn.prepareStatement(sql);       // conn(연동된 인터페이스).prepareStatement(기재할 SQL)
            int result = ps.executeUpdate();                         // 1 : 성공, 0 : 실패
            System.out.println(result);
            System.out.println("레코드 등록 성공");

            // 2. select 하기
            String sql2 = "select * from test";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ResultSet rs = ps2.executeQuery();
            rs.next();                                               // 조회 결과에서 다음 레코드 이동
            System.out.println(rs.getInt("no"));          // rs.get타입("속성명")
            System.out.println(rs.getString("name"));
            System.out.println("레코드 조회 성공");

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버가 존재하지 않습니다. " + e);
        } catch (SQLException e){
            System.out.println("DB서버와 연동 실패 " + e);
        }
    }
}
