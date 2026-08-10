package day09.Total_exam.view;

import day09.Total_exam.controller.BoardController;
import day09.Total_exam.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){
        return instance;
    }
    // view에서 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
    private Scanner sc = new Scanner(System.in); // 모든 메소드에서 사용 가능한 입력 객체
    //[*] 메인 입출력
    public void run(){
        while (true){
            System.out.print("1.등록 2.전체조회 : ");
            int ch = sc.nextInt();
            if(ch == 1){
                save();
            } else if (ch == 2){
                finaAll();
            }
        }
    }

    //[1] 게시물 작성 입출력
    public void save(){
        // 1.입력
        System.out.print("내용 : ");
        String content = sc.next();
        System.out.print("작성자 : ");
        String writer = sc.next();
        // 2.객체화
        BoardDto boardDto = new BoardDto(content,writer);
        // 3.컨트롤러에게 요청하고 응답받기
        boolean result = bc.save(boardDto);
        // 4.처리하기
        if(result){
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    // [2] 게시물 전체 출력
    public void finaAll(){
        // 1.controller부터 모든 게시물 요청하고 받기
        ArrayList<BoardDto> result = bc.findAll();
        // 2.controller부터 받느 모든 게시물 출력
        for (BoardDto boardDto : result) {
            System.out.println(boardDto.getWriter() + " : " + boardDto.getContent());
        }
    }
}
