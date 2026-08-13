package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Exam {
    public static void main(String[] args) {
        // 예외란? 에러발생 시 고치는게 아니라 흐름 제어 , 예측하거나 유지보수
        // 예외처리 : try{예외발생코드} catch ()

        // [1] 일반예외 : 실행하기전 예외가 발생할 수 있는 코드에 대해 미리 예외
        // 1. ClassNotFoundException : 클래스 찾을 수 없다
        try {
            Class.forName("java.lang.String2");  // Class.forName("찾을클래스") 동적으로 존재하는 클래스 로드
        } catch (ClassNotFoundException e){    // 예외발생시 처리되는 코드 , e : 변수이면서 예외정보 담는 객체
            System.out.println("존재하지 않는 클래스");
        }
        // 2. InterruptedException : 스레드에 문제가 발생 하면
        try {
            Thread.sleep(1000);  // 컴파일된 코드들을 읽어드리는 흐름
        } catch (InterruptedException e){
            System.out.println("인터럽트 문제 발생" + e);
        }

        // [2] 실행예외 : 컴파일 후 예외 발생 *경험 중요*
        // 3. NullPointerException : 참조가 없는데 참조하는 경우
        try {
            String str1 = null;  // null은 참조값이 없다 -> 객체(인스턴스)가 없다
            System.out.println(str1.length());
        } catch (NullPointerException e){
            System.out.println(e);
        }
        // 4. NumberFormatException : 정수타입으로 변환이 불가능한 경우
        try {
            String str2 = "100";
            Integer.parseInt(str2); // 문자를 정수로 변환
            String str3 = "100a";
            Integer.parseInt(str3);
        } catch (NumberFormatException e){
            System.out.println(e);
        }
        // 5. ArrayIndexOutOfBoundsException : 배열내 인덱스 범위가 넘는 경우
        try {
            int[] arr = {1, 2};
            System.out.println(arr[0]);
            System.out.println(arr[5]);  // 없는 인덱스 호출
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // [3] 다중 catch : try에서 다양한 예외들을 다양하게 흐름 제어 , catch는 1번!
        // [4] finally : 예외 발생 여부 상관없이 무조건 실행 , 외부 프로그램 연동 종료 코드
        // 6. InputMismatchException : 입력 타입 예외 발생
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("정수입력 : ");
            int ch = sc.nextInt();
            Integer.parseInt("ABC");
        } catch (InputMismatchException e){
            System.out.println("정수만 입력 " + e);
        } catch (NumberFormatException e){
            System.out.println("타입변환 오류 " + e);
        } catch (Exception e){  // 다중 catch에서 마지막에 Exception 사용해서 그외 처리
            System.out.println("예외발생 : 관리자에게 문의 : " + e);
        } finally {
            System.out.println("finally 무조건 실행");
        }

        // [5] 예외 던지기 , *예외반환* : 해당 메소드를 호출한 곳으로 예외 반환
        try {
            method1(); // 예외가 반환
        } catch (Exception e){
            System.out.println("메소드 예외 발생 " + e);
        }
    }

    // 7. 예외발생시 발생한 곳에서 예외처리 하지 않고 떠넘기기
    public static void method1() throws ClassNotFoundException{
        Class.forName("java.lang.Spring"); // 예외발생
    }
}
