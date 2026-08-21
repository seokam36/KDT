package day15;

import java.util.HashMap;
import java.util.Map;

public class Exam1  {
    public static void main(String[] args) {
        // Map 인터페이스 : KEY 중복불가 / VAlUE 중복허용, 인덱스 X, HashMap, TableMap
        // [1] Map : key와 value 한쌍으로 여러개 쌍 저장하는 구조 -> JSON
        Map<String, Integer> map = new HashMap<>();

        // [2] 메소드
        // 1. put(key, value) : key/value 엔트리 추가
        map.put("주석암",95);
        map.put("ㅁ이러ㅏ",100);
        map.put("주석암",100);  // key가 존재하면 value값 수정
        System.out.println(map);

        // 2. get(key) : key에 해당한 value 호출
        System.out.println(map.get("주석암"));

        // 3. size() : 총 엔트리 수
        System.out.println(map.size());

        // 4. containsKey(찾을 키) : 찾을 키 존재하면 true / false
        //    containsValue(찾을 값) : 찾을 값 존재하면 true / false
        System.out.println(map.containsKey("주석암"));
        System.out.println(map.containsValue(95));

        // 5. keySet() : 모든 key 반환
        //    values() : 모든 value 반환
        System.out.println(map.keySet());
        System.out.println(map.values());

        // 6. remove(삭제할 키) : 해당하는 key의 엔트리 삭제
        map.remove("ㅁ이러ㅏ");

        // 7. clear() : 모든 엔트리 삭제
        // map.clear();

        // 8. isEmpty() : 엔트리 1개도 없으면 true / false
        System.out.println(map.isEmpty());

        // 9. 반복문
        // 일반 for문 불가능 , 향상된 for문 사용 key이용
        for (String key : map.keySet()) {  // 모든 키 꺼내서 반복문 이용해 키 순회
            System.out.println(key + ":" + map.get(key));
        }
        // forEach
        map.keySet().forEach((key)->{
            System.out.println(key + ":" + map.get(key));
        });
    }
}
