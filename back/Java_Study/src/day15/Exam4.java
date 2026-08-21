package day15;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        // [1] 시계 구현 -> Clock 스레드
        // 1. 새로운 작업 스레드 실행
        Clock runnable1 = new Clock();
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        // [3] 타이머 구현
        Timer thread2 = null;

        // [2] 입력 구현 -> main 스레드
        while (true) {
            System.out.print("1.On , 2.OFF : ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            if (ch == 1){
                thread2 = new Timer();
                thread2.start(); // main 스레드가 timer 스레드 켠다
            }
            if (ch == 2){
                if (thread2 != null){
                    thread2.state = false;
                }
            }
        }

    }
}

class Clock implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println(LocalDateTime.now());
            try {
                Thread.sleep(998);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Timer extends Thread{
    public boolean state = true; // 타이머 작동 여부
    @Override
    public void run() {
        int time = 0;
        while (state){
            time++;
            System.out.println(">> 타이머 : " + time + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
