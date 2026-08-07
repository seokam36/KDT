package day08;

import day08.package1.A;

public class Exam1 {
    public static void main(String[] args) {
        /*
        * 접근제한자:
        *   public      : 프로젝트내 어디서든 호출 가능
        *   private     : 현재 클래스내에서 호출 가능
        *   default     : (생략) 같은패키지내 호출
        *   protected   : 같은패키지내 호출(상속 관계면 다른 패키지 가능)
        */

        // 1. 접근제한된 변수
        A a = new A();
        a.공개변수 = 3;
        //a.비공개변수 = 3;
        //a.일반변수 = 3;
        System.out.println(a.공개변수);

        a.공개메소드();
        //a.비공개메소드();
    }
}
