package day13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam2 {
    public static void main(String[] args) {
        // [1] 래퍼 클래스 : 기본타입 --> 참조타입 표현, 참조타입은 상태/기능 갖는다
        // 기본 타입은 기능 X, 참조타입으로 변환해서 기능 사용
        int value1 = 100;
        // System.out.println(value1.toString());
        Integer value2 = 100;
        System.out.println(value2.toString());

        // 1. 언박싱 과 오토박싱
        int value3 = value2;        // Integer(참조) --> int(기본) 변환 , 언박싱
        Integer value4 = value3;    // int(기본) --> Integer(참조) , 오토박싱

        // 2. 타입변환(csv, excel, api, python, json, xml 등등)
        // XXXX.parseXXX(문자열)
        int value5 = Integer.parseInt("100");
        double value6 = Double.parseDouble("3.14");
        boolean value7 = Boolean.parseBoolean("true");
        // 기본타입 --> 문자열 , String.valueOf(리터럴)
        String s1 = 100 + "";
        String s2 = String.valueOf(100);

        // [2] 날짜,시간 클래스
        // 1. 현재 날짜
        LocalDate localDate = LocalDate.now();      // now()는 static 함수라 인스턴스 생성 X
        System.out.println(localDate);
        // 2. 현재 시간
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        // 3. 현재 날짜 시간
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // 4. 정해진 날짜,시간 객체 생성 LocalDateTime.of( 연도, 월, 일, 시, 분, 초) , 오버로딩
        LocalDateTime localDateTime2 = LocalDateTime.of(2026,8,19,11,13,30);
        System.out.println(localDateTime2);
        // 5. 정해진 형식으로 날짜/시간 표현
        // 패턴 : y연도 M월 d일 h시 m분 s초 , 날짜/시간객체.format( 패턴객체 )
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y년 M월 d일 h시m분s초");
        System.out.println(localDateTime2.format(formatter));
        // 6. 날짜 계산 , 날짜/시간객체.plusDays(수)
        System.out.println(localDateTime2.plusDays(19));
        System.out.println(localDateTime2.minusDays(19));
        // 7. 특정한 날짜/시간 추출 , .getXXX()
        System.out.println(localDateTime2.getYear());
        System.out.println(localDateTime2.getMonthValue()); // .getMonth() 영문, getMonthValue() 정수
        System.out.println(localDateTime2.getDayOfMonth());

    }
}
