package day09.mvc_exam_practice.view;

import day09.mvc_exam_practice.controller.WaitController;
import day09.mvc_exam_practice.model.dto.WaitDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitView {
    private WaitView(){}
    private static final WaitView instance = new WaitView();
    public static WaitView getInstance(){
        return instance;
    }
    // controller 인스턴스 호출
    private WaitController wc = WaitController.getInstance();
    Scanner sc = new Scanner(System.in);

    //메인 입출력
    public void run(){
        while (true){
            System.out.print("1.대기명단 등록 / 2.대기명단 조회 / 3.대기명단 수정 / 4.대기명단 삭제 : ");
            int choice = sc.nextInt();
            if(choice == 1){
                save();
            } else if (choice == 2) {
                findAll();
            } else if (choice == 3) {
                update();
            } else if (choice == 4) {
                remove();
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void save() {
        System.out.print("전화번호 입력(010-XXXX-XXXX) : ");
        String telNum = sc.next();
        System.out.print("대기인원수 입력 : ");
        int people = sc.nextInt();
        // 객체화
        WaitDto waitDto = new WaitDto(telNum, people);
        boolean result = wc.save(waitDto);
        if(result){
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void findAll(){
        ArrayList<WaitDto> waitList = wc.findAll();
        for (WaitDto waitDto : waitList) {
            System.out.println("전화번호 : " + waitDto.getTelNum() + ", 대기인원 : " + waitDto.getPeople());
        }
    }

    public void update(){
        System.out.print("대기명단 번호 입력(010-XXXX-XXXX) : ");
        String telNum = sc.next();
        System.out.print("수정할 인원 입력 : ");
        int people = sc.nextInt();
        boolean result = wc.update(telNum,people);
        if(result){
            System.out.println("수정 완료");
        } else {
            System.out.println("수정 실패(전화번호를 확인하세요)");
        }
    }

    public void remove(){
        System.out.print("대기명단 번호 입력(010-XXXX-XXXX) : ");
        String telNum = sc.next();
        boolean result = wc.remove(telNum);
        if(result){
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제 실패(전화번호를 확인하세요)");
        }
    }
}
