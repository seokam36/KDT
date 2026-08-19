package day13;

public class Exam2 {
    public static void main(String[] args) {
        // [1] 래퍼 클래스 : 기본타입 --> 참조타입 표현, 참조타입은 상태/기능 갖는다
        // 기본 타입은 기능 X, 참조타입으로 변환해서 기능 사용
        int value1 = 100;
        // System.out.println(value1.toString());
        Integer value2 = 100;
        System.out.println(value2.toString());
    }
}
