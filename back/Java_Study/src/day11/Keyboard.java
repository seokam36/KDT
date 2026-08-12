package day11;

public interface Keyboard {
    // 1.상수, 초기값 필수!
    String info = "인텔";
    String date = "2026-08-12";

    // 2.추상 메소드, {} 생략한 선언부만 작성
    void aKey();
    int bkey(int x);
}
