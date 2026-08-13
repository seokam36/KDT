package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.BoardDao;
import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dto.BoardDto;

public class BoardController {
    private BoardController() {
    }

    private static final BoardController instance = new BoardController();

    public static BoardController getInstance() {
        return instance;
    }

    private IBaseDao ib = BoardDao.getInstance();

    public boolean save(BoardDto boardDto) {
        return ib.save(boardDto);
    }

    public ArrayList<BoardDto> findAll() {
        ArrayList<Object> boarList = ib.findAll();
        ArrayList<BoardDto> result = new ArrayList<>();
        for (Object board : boarList) {
            result.add((BoardDto) board);
        }
        return result;
        // 받야할게 BoardDto OBJECT
    }
}