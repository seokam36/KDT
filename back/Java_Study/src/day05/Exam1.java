package day05;

public class Exam1 {

    public static void main(String[] args) {
        /* 1. 객체 : 상태 또는 행위 정의(추상)하는것
                -> 상태(값/자료), 행위(함수/메소드)
            2. 객체지향 프로그래밍 : 개발자(주체)가 컴퓨터내 객체(대상) 만들기
            3. 객체 정의 : 클래스(설계도) 기반으로 객체 정의한다.
            4. 클래스란? 객체(추상개념)의 상태 와 행위 코드로 정의한곳
                1) 설계클래스(객체정의용도)
                2) main함수클래스(실행목적용도)
            5. 인스턴스란? 클래스로 (객체가) 정의된 기반으로 메모리 할당(물리개념)
                new 연산자 사용
        */
       Student s1 = new Student();          /* 객체 인스턴스화 */

       System.out.println(s1);
       System.out.println(s1.studentId);

       s1.studentId = 1;                    /* 객체내 멤버변수 값 수정 */
       s1.studentName = "주석암";
       System.out.println(s1.studentId + s1.studentName);
       
       Student s2 = new Student();
       Student s3 = new Student();
       Student s4 = s2;
       System.out.println(s2);          // 인스턴스 생성  101호
       System.out.println(s3);          // 인스턴스 생성  102호
        System.out.println(s4);         // 인스턴스 참조  101호
       s2.studentName = "강호동";          // 101호 멤버변수 수정
        System.out.println(s2.studentName);
        System.out.println(s4.studentName);

    }
}

class Student{ // 학생 추상 개념 -> 코드화
    /* 멤버변수(상태), 타입 */
    int studentId;          
    String studentName;
}