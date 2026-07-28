package day01;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        System.out.println("java1");
        System.out.print("java2");

        // \n 줄바꿈 , \t 들여쓰기 , \', \"
        System.out.println("\njava3\t\'\"");

        // printf("형식", "자료")
        // %자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 , 오른쪽정렬
        // %-자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 , 왼쪽정렬
        // %0자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 0으로 채움 , 오른쪽정렬
        // %전체자릿수,소수자릿수f

        System.out.printf("저는 %s이고 나이는 %d입니다.","주석암",27);
        System.out.printf("\n저는 %s 이고 나이는 %6d 입니다\n","주석암",27);
        System.out.printf("저는 %s 이고 나이는 %-6d 입니다\n", "주석암",27);
        System.out.printf("저는 %s 이고 나이는 %06d입니다\n", "주석암",27);
        System.out.printf("저는 %-6s 이고 나이는 %5.2f입니다\n", "주석암",123.15616);

        // 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력");
        String next = sc.next();
        
        System.out.print("숫자입력1");
        int nextInt = sc.nextInt();
    }
}
