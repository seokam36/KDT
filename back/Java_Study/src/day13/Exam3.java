package day13;

import java.util.Arrays;

public class Exam3 {
    public static void main(String[] args) {

        // String 클래스
        // 1. 문자열은 배열
        char str1 = '유';    // char 차입은 1글자만 가능
        char[] str2 = {'유','재','석'};
        String str3 = "유재석";

        // 2. 문자 변환 , 아스키코드 + 유니코드
        char str4 = 65;
        System.out.println(str4);
        char[] str5 = {74, 65, 86, 65};
        System.out.println(str5);
        char str6 = '유';
        System.out.println((int) str6);

        // 3. 문자열 비교, 문자열A.equals(문자열B)
        System.out.println(new String("유재석") == "유재석");       // false
        System.out.println(new String("유재석").equals("유재석"));  // true

        // 4. 문자열 연결, 문자열A.concat(문자열B) , 연결된 새로운 문자열 문자열 반환(주소값 생성)
        String str7 = "자바";
        String str8 = "프로그래밍";
        System.out.println(str7.concat(str8));

        // 5. StringBuilder , append(), 문자열은 불변(수정 X) , 빌더주소값 1개지정해서 새로운 문자열
        StringBuilder builder = new StringBuilder();
        builder.append(str7);
        builder.append(str8);
        System.out.println(builder);

        // 6. chatAt(인덱스) , 문자 1개 추출
        String str9 = "Java Programming";
        System.out.println(str9.charAt(2));

        // 7. length() , 문자열 문자 개수 반환
        System.out.println(str9.length());

        // 8. replace(기존문자, 새로운문자) , 기존문자가 존재하면 새로운문자로 치환해서 반환
        System.out.println(str9.replace("Java", "Python"));

        // 9. substring(시작인덱스, 끝인덱스) , 시작인덱스 부터 끝인덱스 전까지 문자열 추출
        String str10 = "31153153-13515313";
        System.out.println(str10.substring(9));
        System.out.println(str10.substring(0,9));

        // 10. split(기준문자) , 기준문자 기준으로 문자열 분해해서 배열 반환
        System.out.println(str10.split("-"));
        String[] strAry = str10.split("-");     // [0]31153153 , [1]13515313
        System.out.println(strAry[0]);
        System.out.println(strAry[1]);

        // 11. indexOf(찾을값) , 찾을문자가 있으면 인덱스, 없으면 -1
        //     contains(찾을값) , 있으면 true 없으면 false
        System.out.println("자바 프로그래밍 언어".indexOf("프로"));
        System.out.println("자바 프로그래밍 언어".contains("프로")); // true

        // 12. getByte() , 문자열내 문자들을 바이트 배열 반환 , 파일처리/네트워크
        byte[] strArys2 = "ABC".getBytes();
        System.out.println(Arrays.toString(strArys2));
        System.out.println( new String(strArys2));

    }
}
