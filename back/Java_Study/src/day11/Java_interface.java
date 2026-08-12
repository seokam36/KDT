package day11;
/*
* 기본타입(리터럴) : byte, short, int, long, float, double, char, boolean
* 참조타입(객체) : []배열, 클래스(String, Scanner, Dto 등등), interface
* 1.인터페이스 만들기 -> interface 인터페이스명
* 2.인터페이스 주요멤버 : 상수, 추상메소드
* 추상 -> 여러 사물이나 개념에서 공통된 특성과 본질을 뽑아내어 파악하는 것
* 3.추상메소드 구현할 클래스 필요 (구현객체)
*/

interface ExamInterface{
    int a = 10; // 상수, 인터페이스에서는 public static final 생략 가능
    int b = 20; // 상수

    // 생성자 X, 인스턴스 불가능
    // **추상메소드 : 선언부만 존재하고, {} 구현부가 없는 메소드
    void method( int x );
    int method2(int x, int y);
}

// 해당 클래스가 지정한 인터페이스 구현
class ExamClass implements ExamInterface{
    // 구현은 오버라이딩 필수!, 상속은 선택!
    @Override
    public void method(int x) {
        System.out.println(x);
    }

    @Override
    public int method2(int x, int y) {
        return x + y;
    }
}
public class Java_interface {
    public static void main(String[] args) {
        // [1] 인터페이스로 인스턴스 생성 불가능
        // [2] implements 구현한 객체
        ExamClass ec = new ExamClass();
        ec.method(10);
        ec.method2(10,20);

        // [3] 다형성 : 업캐스팅
        ExamInterface ei = new ExamClass();
        // 인터페이스 타입 이더라도 오버라이딩 메소드 우선순위
        ei.method(10);
        ei.method2(10,20);
    }
}
