package day13;

import day12.total_exam.model.dto.BoardDto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exam1 {
    public static void main(String[] args) {
        // 라이브러리 : 다른 사람들이 만든 클래스, 메소드 짖ㅂ합
        // [1] Object 클래스 : 자바의 최상위 클래스 *다형성*
        Object obj1 = 1;
        Object obj2 = 3.14;
        Object obj3 = "주석암";
        Object obj4 = new int[5];
        // 모든 자료들은 Object 타입 변수에 대입 가능.
        // 1. toString() : 객체의 주소값 반환, 생략가능 , 오버라이딩 이용해서 멤버변수 확인 가능
        System.out.println(obj4.toString());
        System.out.println(obj4);
        Object boardDto = new BoardDto();
        System.out.println(boardDto);
        System.out.println(boardDto);

        // 2. equals() : 객체가 참조하는 값 비교 함수
        Object obj5 = new BoardDto();
        System.out.println(obj4 == obj5);           // false
        System.out.println(obj4.equals(obj5));      // false
        String str1 = "유재석";
        String str2 = new String("유재석");
        System.out.println(str1 == str2);           // false
        System.out.println(str1 == "유재석");        // true , 리터럴문자열 == 리터럴문자열
        System.out.println(str2 == "유재석");        // false , 객체(리터럴문자열)
        // 리터럴로 정의한 문자열과 new String 으로 정의한 문자열은 다름.
        System.out.println(str1.equals(str2));      // true

        // 3. hashCode() : 객체를 식별하는 값을 정수로 반환 , 주소값은 16진수 사람은 10진수
        // 활용처 : 객체 탐지하는 경우에 주소값이 아닌 정수로된 값(키) 비교하여 속도 향상
        System.out.println(str1.hashCode());

        // [2] Class : 클래스의 정보(멤버변수, 메소드, 생성자) 담는 클래스
        // 1. getClass()
        String s = new String();
        Class aClass = s.getClass();
        System.out.println(aClass);

        // 2. Class.forName("패키지명.클래스명"), 일반예외 필수
        // ** 리플렉션 ** : 최초실행할 때 해당 클래스의 객체 생성하지 않고 실행 도중에 생성
        // 활용처 : JDBC(프로그램 시작이 아닌, DB연동시 클래스 생성), 스프링프레임워크
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println("예외 발생 " + e);
        }

        // 3. .getFields() : 클래스내 멤버변수 정보 반환
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 4. .getConstructors() : 클래스내 생성자 정보 반환
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        // 5. .getMethods() : 클래스내 메소드 정보 반환
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
