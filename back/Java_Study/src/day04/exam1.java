package day04;

public class Exam1 {
    public static void main(String[] args) {
        /* 저장된 배열 for문으로 출력하기 */
        int []  arr = {91, 90, 48};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /* 
            향상된 for문, for(타입명 변수명 : 배열명){ } 
            콜론 기준으로 오른쪽 배열내 요소들을 왼쪽 변수에 하나씩 대입
        */
        for (int data : arr) {
            System.out.println(data); /* 인덱스 없이 자료 추출 */
        }
    }
}
