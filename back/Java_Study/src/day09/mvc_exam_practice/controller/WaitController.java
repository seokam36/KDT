package day09.mvc_exam_practice.controller;

import day09.mvc_exam_practice.model.dao.WaitDao;
import day09.mvc_exam_practice.model.dto.WaitDto;

import java.util.ArrayList;

public class WaitController {
    private WaitController(){}
    private static final WaitController instance = new WaitController();
    public static WaitController getInstance(){
        return instance;
    }
    // dao 인스턴스 호출
    private WaitDao wd = WaitDao.getInstance();

    public boolean save(WaitDto waitDto){
        boolean result = wd.save(waitDto);
        return result;
    }

    public ArrayList<WaitDto> findAll(){
        return wd.findAll();
    }

    public boolean update(String telNum, int people) {
        boolean result = wd.update(telNum,people);
        return result;
    }

    public boolean remove(String telNum) {
        boolean result = wd.remove(telNum);
        return result;
    }
}
