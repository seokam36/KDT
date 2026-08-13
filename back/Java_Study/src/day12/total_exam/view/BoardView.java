package day12.total_exam.view;


import day12.total_exam.controller.BoardController;
import day12.total_exam.model.dto.BoardDto;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance( ){ return instance; }

    private BoardController bc = BoardController.getInstance();

    Scanner sc = new Scanner(System.in);
    public void run() {
        while (true){
            try {
                System.out.println("1.등록 2.전체조회 3.개별수정 4.개별삭제 ");
                System.out.print("선택 : ");
                int ch = sc.nextInt();
                if (ch == 1){
                    save();
                } else if (ch == 2){
                    findAll();
                } else if (ch == 3) {
                    update();
                } else if (ch == 4) {
                    delete();
                }
            } catch ( InputMismatchException e){
                sc = new Scanner(System.in); // 입력(성공)했지만 타입에서 예외 이므로 입력객체 초기화
                System.out.println("[다시입력] " + e);
            }
        }
    }

    public void save(){
        System.out.print("내용 : ");
        String content = sc.next();
        System.out.print("작성자 : ");
        String writer = sc.next();
        BoardDto boardDto = new BoardDto(content,writer,0);
        // controller에게 전달해서 응답받기
        boolean result = bc.save(boardDto);
        if (result){
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void findAll(){
        ArrayList<BoardDto> result = bc.findAll();
        for (BoardDto boardDto : result) {
            System.out.println(boardDto.getNo() + ") " + boardDto.getWriter() + " : " + boardDto.getContent());
        }
    }

    public void update(){
        System.out.print("수정할 번호 : ");
        int no = sc.nextInt();
        System.out.print("수정할 내용 : ");
        String content = sc.next();
        BoardDto boardDto = new BoardDto(content, null, no);
        boolean result = bc.update(boardDto);

        if (result){
            System.out.println("수정 성공");
        } else {
            System.out.println("수정 실패(없는 번호)");
        }
    }

    public void delete(){
        System.out.print("삭제할 번호 : ");
        int no = sc.nextInt();
        boolean result = bc.delete(no);
        if(result){
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실팽(없는 번호)");
        }
    }
}