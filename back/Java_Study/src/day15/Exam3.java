package day15;

import java.awt.*;

public class Exam3 {
    public static void main(String[] args) {
        /*
        * 프로그램 : 실행 가능한 코드들의 집합
        * 프로세스 : 실행 중인 프로그램
        * 멀티태스킹 : 두 가지 이상의 작업을 동시에 처리
        * 멀티프로세스 : 운영체재가 여러개 프로세스를 동시에 처리하는 구조
        * 멀티스레드 : 하나의 프로세스내 여러개 흐름 작업 실행하는 구조
        * 스레드 : 하나의 프로세스내 최소 작업 단위
        *   - CPU가 프로세스내 스레드를 통해 코드를 순차적으로 처리
        */
        // [1] 단일 스레드 : (컴파일된) 코드들을 실행 흐름 단위 1개
        // -> main 메소드가 main 스레드 제공 (프로그램 당 1개 이상 존재)
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // 1) 1초에 한번씩 소리 발생
        for (int i = 0; i < 6; i++) {
            toolkit.beep(); // 소리 발생하는 함수
            try {
                Thread.sleep(1000); // 현재 스레드(코드 실행하는 흐름단위) 일시정지
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 2) 1초에 한번씩 출력 발생
        for (int i = 0; i < 6; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // [2] 멀티스레드1 : 익명구현체 , new 인터페이스타입(){ 오버라이딩 };
        Runnable runnable = new Runnable() {
            // 새로운 스레드가 처리할 메소드 = run() 오버라이딩
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println(">>> 새로운 첫번째 스레드 : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread1 = new Thread(runnable);  // new Thread(익명구현체)
        thread1.start();  // 새로운 스레드가 run() 메소드 호출

        // [3] 멀티스레드2 : 구현체
        Thread2 thread2 = new Thread2();
        Thread thread22 = new Thread(thread2);
        thread22.start();

        // [4] 멀티스레드3 : 상속
        Thread3 thread3 = new Thread3();
        thread3.start();  // main / task1 / task2 / task3(4개) => 병렬처리 , 순서보장 X

    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(">>> 2번째 새로운 스레드 : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class  Thread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(">>> 3번째 새로운 스레드 : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
