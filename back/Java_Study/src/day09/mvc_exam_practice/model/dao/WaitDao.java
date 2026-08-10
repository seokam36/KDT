package day09.mvc_exam_practice.model.dao;

import day09.mvc_exam_practice.model.dto.WaitDto;

import java.util.ArrayList;

public class WaitDao {
    private WaitDao(){}
    private static final WaitDao instance = new WaitDao();
    public static WaitDao getInstance(){
        return instance;
    }
    //입력받은 값 arrayList 저장
    private ArrayList<WaitDto> waitList = new ArrayList<>();

    public boolean save(WaitDto waitDto) {
        waitList.add(waitDto);
        return true;
    }

    public ArrayList<WaitDto> findAll(){
        return waitList;
    }


    public boolean update(String telNum, int people) {
        // for문 돌아서 해당하는 전화번호 명단 찾고 setter 사용해서 받은 people로 변경
        for (int i = 0; i < waitList.size(); i++) {
            if (waitList.get(i).getTelNum().equals(telNum)){
                waitList.get(i).setPeople(people);
                return true;
            }
        }
        return false;
    }

    public boolean remove(String telNum) {
        // for문 돌아서 해당하는 전화번호 명단 찾고 삭제
        for (int i = 0; i < waitList.size(); i++) {
            if(waitList.get(i).getTelNum().equals(telNum)){
                waitList.remove(i);
                return true;
            }
        }
        return false;
    }
}
