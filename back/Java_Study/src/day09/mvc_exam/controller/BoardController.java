package day09.mvc_exam.controller;

import day09.mvc_exam.model.dao.BoardDao;
import day09.mvc_exam.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    // controller에서 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

    // [1] 게시물 작성 컨트롤러
    public boolean save(BoardDto boardDto){
        // 1.view로 부터 저장할 정보 객체로 받는다
        // 유효성검사 / 타입 변환 등등
        // 2. DAO 에게 요청하고 응답하기
        boolean result = bd.save(boardDto);
        // 3. DAO 에게 받은 결과물 VIEW에게 응답하기
        return result;
    }

    // [2] 게시물 전체 조회 컨트롤러
    public ArrayList<BoardDto> findAll(){
        // 1.view에서 매개변수 받는다. 현재는 없음
        // 2.dao에게 요청하고 응답 받기
        ArrayList<BoardDto> result = bd.findAll();
        // 3.dao에게 받은 결과를 view에 반환
        return result;
    }
}
