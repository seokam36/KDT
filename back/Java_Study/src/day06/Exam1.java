package day06;

public class Exam1 {
    public static void main(String[] args) {
        /*
        * 생성자 : 인스턴스 생성할 때 사용되는 키워드
        * 선언하는 방법
        *   1)클래스 내부
        *   2)클래스명과 동일
        *   3)오버로딩 지원 : 동일한 이름으로 여러개 선언
        * 목적 : 1)빠른 초기화 2)객체생성 규칙/유효성검사
        * 종류 : 1)기본생성자(매개변수 X) 2)정의생성자
        * */

        Phone phone1 = new Phone();
        phone1.model = "갤럭시";

        Phone phone2 = new Phone("아이폰", "파랑");
        Phone phone3 = new Phone("아이폰", "black", 5000);
    }
}

class Phone{
    String model;
    String color;
    int price;

    // 생성자
    // 생성자가 1개 없으면 자동으로 기본생성자 생성
    // 생성자명은 중복이 안된다. 오버로딩( 매개변수 개수 / 타입 / 순서) 다르면 중복 가능!
    // * this : 매개변수명과 멤버변수명이 같은때 식별 (멤버변수 식별용도)

    // 1. 기본 생성자 : 매개변수 X
    Phone (){}

    //2. 정의생성자 : 매개변수 O
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }


    public Phone(String model, String color, int 가격) {
        this.model = model;
        this.color = color;
        price = 가격;
    }
}