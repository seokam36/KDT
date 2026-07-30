package day02;

public class Exam2 {
    public static void main(String[] args) {
        /* 자동 타입 변환 */
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;

        /* 연산중에 자동 타입변환 */
        byte b1 = 10;   short s1 = 30;
        byte b2 = 20;   int i1 = 40;    long l1 = 50L;
        int result1 = b1 + b2;
        int result2 = b2 + s1;
        int result3 = i1 + i1;
        long result4 = i1 + l1;         /* int + long = long (더 큰타입으로 변환) */


        /* 강제 타입변환 */
        
    }
}
