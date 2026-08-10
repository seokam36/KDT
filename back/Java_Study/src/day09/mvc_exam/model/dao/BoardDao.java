package day09.mvc_exam.model.dao;

import day09.mvc_exam.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // 데이터베이스 대신 ArrayList 사용 => 추후에 MYSQL 서버와 연동
    private ArrayList<BoardDto> boardList = new ArrayList<>();
    // [1] 게시물 작성 로직
    public boolean save(BoardDto boardDto){
        // 1.controller로 부터 저장할 정보 객체 받는다.
        // * 추후 insert 이용한 db에 저장
        // 2.리스트에 저장
        boardList.add(boardDto);
        // 3.성공반환
        return true;
    }

    // [2] 게시물 전체 조회 로직
    public ArrayList<BoardDto> findAll(){
        // 1.controller에게 매개변수 받는다. 현재는 X
        // * 추후에 select 이용한 db 조회
        // 2.리스트 전체 반환
        return boardList;
    }
}
