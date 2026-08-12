package day11;

public class Keyboard_interface_exam {
    public static void main(String[] args) {
        // 1. 인터페이스 : 키보드 규칙
        // 2. 규격에 따른 구현
        // 3. 키보드 타입 생성
        Keyboard myBoard;

        // 4. 스포츠게임 실행
        myBoard = new SportsGame();     // 업캐스팅
        myBoard.aKey();                 // 슈팅
        myBoard.bkey(1);             // 수비

        // 5. 액션게임 실행
        myBoard = new ActionGame();
        myBoard.aKey();                 // 공격
        myBoard.bkey(1);             // 방어
    }
}
class ActionGame implements Keyboard{

    @Override
    public void aKey() {
        System.out.println("공격");
    }

    @Override
    public int bkey(int x) {
        System.out.println("방어");
        return x;
    }
}
class SportsGame implements Keyboard{

    @Override
    public void aKey() {
        System.out.println("슈팅");
    }

    @Override
    public int bkey(int x) {
        System.out.println("수비");
        return x;
    }
}
