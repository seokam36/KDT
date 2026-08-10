package day09;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {
        /*
        * ArrayList :
        *   1. 컬렉션, 프레임워크, 자료 수집관련 클래스/기능 제공
        *   2. 목적 : 가변길이, 배열관련된 메소드 제공
        *   3. 사용법
        *       ArrayLsit<제네릭타입> 변수명 = new ArrayList<>();
        *       -제네릭타입 : 리스트내 저장할 요소들의 타입
        *       -주의할점 : 제네릭타입은 기본 X
        * */
        //[1] 리스트 생성
        ArrayList<String> arrayList = new ArrayList<>(); // String 타입 여러개 저장하는 리스트

        //[2] 리스트 요소 추가 => add(넣을값)
        arrayList.add("ㅁ");
        arrayList.add("ㅇ");
        arrayList.add("ㄹ");

        //[3] 리스트 전체 출력
        System.out.println("arrayList = " + arrayList);

        //[4] 리스트 중간 삽입 => add(인덱스, 넣을값)
        arrayList.add(0,"ㅎ");
        System.out.println("arrayList = " + arrayList);

        //[5] 리스트 요소 수정 => set(수정할 인덱스, 수정할값)
        arrayList.set(1,"s");
        System.out.println("arrayList = " + arrayList);

        //[6] 리스트 요소 총개수 => size()
        System.out.println(arrayList.size());

        //[7] 리스트 특정 요소 출력 => get(인덱스)
        System.out.println(arrayList.get(1));

        //[8] 리스트 요소 삭제 => remove(인덱스)
        arrayList.remove(1);
        System.out.println("arrayList = " + arrayList);

        //[9] 리스트 요소 찾기 => indexOf(찾을값), contains(찾을값)
        System.out.println(arrayList.indexOf("ㄹ")); // 찾을값의 인덱스 반환, 없으면 -1
        System.out.println(arrayList.contains("ㄹ"));// 찾을값 있으면 true, 없으면 false

        //[10] 반복문과 리스트의 관계
        //1. 일반 for문
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println();
        //2. 향상된 for문
        for (String s : arrayList) {
            System.out.print(s);
        }
        System.out.println();

        //[11] 리스트 전체 삭제 => clear()
        arrayList.clear();

        //[12] 리스트 요소 여부 확인 => isEmpty()
        System.out.println(arrayList.isEmpty()); // 리스트내 요소가 없으면 true


    }
}
