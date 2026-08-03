package day04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam2 {
    public static void main(String[] args) {
        /* 
            JAVA 배열 
            선언 : 
                - 타입[] 변수명 = new 타입명[총개수];
                - 타입[] 변수명 = {초기값, 초기값, .....};
            특징 :
                1. 동일한 타입끼리
                2. 고정 길이
                3. 요소초기값(자동) 정수:0, 실수:0.0, 논리:false, 객체:null
        */
       //[1] 배열의 선언
       int[] arr1 = new int[3];
       System.out.println(arr1);                        // 배열의 메모리 주소값 출력
       System.out.println(Arrays.toString(arr1));       // [0, 0, 0] 배열내 요소들의 자동 초기화

       String[] arr2 = {"유","강","신"};                // String 배열 초기화
       //[2] 배열의 요소 호출, 인덱스
       System.out.println(arr1[0]);
       System.out.println(arr2.length);
       System.out.println(arr2[1]);
       
    } 
}
