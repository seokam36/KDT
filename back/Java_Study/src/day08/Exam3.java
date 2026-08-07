package day08;

public class Exam3 {
    public static void main(String[] args) {
        D 변수 = new D();
        //final
        //변수.고정변수 = 2;

        //static : 클래스명.정적변수, 공유가능 (전역)
        D.정적변수 = 20;
        D.정적변수 = 30;        // 총 메모리 1개

        //멤버변수 : 객체명.멤버변수
        D 변수1 = new D();
        변수1.멤버변수 = 20;
        D 변수2 = new D();
        변수2.멤버변수 = 30;      // 총 메모리 2개

        //상수 : 클래스명.상수명
        System.out.println(D.상수);
    }
}

class D{
    // final => 초기값 이후 수정 불가능
    public final int 고정변수 = 10;

    // static => (정적) 우선(프로그램 실행시)할당 변수
    public static  int 정적변수 = 10;

    // 일반적인 멤버변수
    public  int 멤버변수 = 10;

    // public static fianl => 상수
    public static final int 상수 = 30;
}
