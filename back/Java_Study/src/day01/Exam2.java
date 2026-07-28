package day01;

public class Exam2 {
    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(3.14);
        System.out.println('가');
        System.out.println("가나다");
        System.out.println(true);

        // boolean : true or false 1byte
        boolean boo1 = true;
        System.out.println(boo1);

        // char : 2byte 유니코드
        char ch1 = 'A';
        System.out.println(ch1);

        // String : N * 2byte , 객체(문자열)
        String str1 = "ABC";
        System.out.println(str1);

        // ========= 정수 ==========
        // byte : -128 ~ 127 , 1byte
        byte b1 = 100;
        System.out.println(b1);

        // short : +-3만 정도 , 2byte
        short sh1 = 30000;
        System.out.println(sh1);

        // int : +- 21억 정도, 4byte
        int i = 200000000;
        System.out.println(i);

        // long : +- 21억 이상, 8byte
        long l1 = 20000000000L;
        System.out.println(l1);

        // =============== 실수 : 부동소수점 이용한 소수점 표현은 오차가 있음 ===============
        // float : 소수점 8자리 표현 , 4byteb , 키보드로부터 입력한 실수는 double
        float f1 = 3.154747584949494F;
        System.out.println(f1);

        // double : 소수점 16자리 표현 , 8byte
        double d1 = 3.383484923942343443;
        System.out.println(d1);
    }
}
