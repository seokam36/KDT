package day12.total_exam.model.dao;

import day12.total_exam.model.dto.BoardDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao extends BaseDao{
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }

    // [1] 등록
    public boolean save(BoardDto boardDto) {
        // 1.1 SQL 작성, 값에 와일드카드(?) 이용한 매개변수 대입
        String sql = "insert into board(content, writer) values (? , ?)";
        try {
            // 1.2 연동된 데이터베이스 SQL 기재
            PreparedStatement ps = conn.prepareStatement(sql);
            // 1.3 기재된 SQL문법내 ?(와일드카드) 매개변수 값 대입, ps.set타입(?번호, 값);
            ps.setString(1, boardDto.getContent());
            ps.setString(2, boardDto.getWriter());
            // 1.4 기재된 SQL 실행 , .executeUpdate() insert/update/delete 에서 사용
            int result = ps.executeUpdate();
            if(result == 1){
                return true;
            }
        } catch (SQLException e) {
            System.out.println("예외발생 : " + e);
        }
        return false;
    }

    // [2] 전제조회
    public ArrayList<BoardDto> findAll() {
        ArrayList<BoardDto> list = new ArrayList<>();  // select된 정보들을 담을 list
        // 2.1 sql 작성
        String sql = "select * from board";
        try {
            // 2.2 sql 기재
            PreparedStatement ps = conn.prepareStatement(sql);
            // 2.3 기재된 sql 실행
            ResultSet rs = ps.executeQuery();
            // 2.4 sql 결과(select 조회 결과는 테이블로 반환) -> 레코드 하나씩 타입변환
            while (rs.next()){      // rs.next() : 다음 레코드 이동 , 마지막 레코드까지 반복
                BoardDto boardDto = new BoardDto();
                boardDto.setNo(rs.getInt("no"));
                boardDto.setContent(rs.getString("content"));
                boardDto.setWriter(rs.getString("writer"));
                // 2.5 변환한 DTO -> 리스트에 담기
                list.add(boardDto);
            }
        } catch (SQLException e) {
            System.out.println("예외발생 " + e);
        }
        return list;
    }

    // [3] 개별 수정
    public boolean update(BoardDto boardDto) {
        String sql = "update board set content = ? where no = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getContent());
            ps.setInt(2, boardDto.getNo());
            int result = ps.executeUpdate();
            if(result == 1){
                return true;
            }
        } catch (SQLException e){
            System.out.println("예외발생 " + e);
        }
        return false;
    }

    public boolean delete(int no) {
        String sql = "delete from board where no = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, no);
            int result = ps.executeUpdate();
            if(result == 1){
                return true;
            }
        } catch (SQLException e){
            System.out.println("예외발생 " + e);
        }
        return false;
    }
}

