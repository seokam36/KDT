package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exam3 {
    public static void main(String[] args) {
        // Set 인터페이스 : 여러개 자료들을 저장하는 컬렉션, 중복허용안함(자료로 식별)
        // 1. Set 구현
        Set<String> set1 = new HashSet<>();

        // 2. add(추가할 값)
        set1.add("유재석");
        set1.add("유재석"); // Set 중복 X
        set1.add("강호동");
        set1.add(new String("유재석"));
        System.out.println(set1);

        // 3. get(인덱스) , 지원불가 -> 인덱스가 없다

        // 4. size() , 항목 개수 반환
        System.out.println(set1.size());

        // 5. remove(자료)
        set1.remove("강호동");

        // 6. indexOf(찾을값) , 지원불가 -> contain(찾을값) 사용
        set1.contains("강호동");

        // 7. clear() , 전체 삭제
        set1.clear();

        // 8. isEmpty() , 항목이 하나도 없으면 true
        set1.isEmpty();

        // 9. set 컬렉션과 반복문 관계
        // 일반 for문 불가능 -> 향상된 for문 , forEach 사용
        for (String s : set1) {
            System.out.println(s);
        }
        set1.forEach((s) -> {
            System.out.println(s);
        });

        // 10. TreeSet : 이진트리 이용한 자동 정렬
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(50);
        set2.add(70);
        set2.add(60);
        System.out.println(set2); // [50, 60, 70] 자동정렬
        System.out.println(set2.descendingSet()); // 내림차순 , Set인터페이스에서 지원 X



    }
}
