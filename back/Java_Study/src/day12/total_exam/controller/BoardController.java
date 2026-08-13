package day12.total_exam.controller;

import day12.total_exam.model.dao.BoardDao;
import day12.total_exam.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance; }
    private BoardDao bd = BoardDao.getInstance();


    public boolean save(BoardDto boardDto) {
        return bd.save(boardDto);
    }


    public ArrayList<BoardDto> findAll() {
        return bd.findAll();
    }

    public boolean update(BoardDto boardDto) {
        return bd.update(boardDto);
    }

    public boolean delete(int no) {
        return bd.delete(no);
    }
}
