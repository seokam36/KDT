package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam2 {
    public static void main(String[] args) {
        // 제네릭 : 클래스내 타입들을 인스턴스 생성시 정한다
        /*
        * 컬렉션프레임워크
        *   정의 : 데이터 수집하는 자료구조 미리 만들어둔 클래스들
        *   목적 : 복잡한 자료들을 편리하게 사용
        *   종류 :
        *       List 인터페이스 -> 구현체 : ArrayList, Vector, LinkedList, Stack 등
        *       Set 인터페이스 -> 구현체 : HashSet, TreeSet 등
        *       Map 인터페이스 -> 구현체 : HashMap, HashTable, TreeMap 등
        *   인터페이스 -> 서로 다른 클래스들을 하나의 타입으로 조작
        *   구현체 -> 인터페이스내 추상메소드 구현한 클래스들
        *   다형성 -> (캐스팅) 하나의 자료가 서로 다른 타입으로 변환
        * */
        // [1] List 인터페이스
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list2 = new LinkedList<>(); // 다형성

        // [2] List 인터페이스 타입으로 구현체 메소드 사용가능
        list2.add("유재석");
        System.out.println(list2.get(0));
        list2.add("강호동");

        // [3] 리스트/배열 과 반복문 관계 -> 하나씩 순회해서 하나씩 꺼낸다
        // for i, 향상된for문 많이 사용했으므로 패스
        // forEach문 , 리스트객체.forEach((반복변수명) -> {})
        list2.forEach((str)->{
            System.out.println(str);
        });

        // [4] List 구현체 차이 : 사용법(메소드) 동일, 구조적 차이
        // ArrayList : 인덱스 기반의 배열 구조
        // LinkedList : 링크[header][data][tail] 기반의 배열 구조
        // Vector : ArraysList 동일한 구조 + 동기화 지원
    }
}
