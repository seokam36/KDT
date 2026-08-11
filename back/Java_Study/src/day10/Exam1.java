package day10;

public class Exam1 {
    public static void main(String[] args) {
        // 1.동물객체 생성
        동물 animal1 = new 동물();
        animal1.name = "강아지";
        animal1.show();
        // 2.조류객체 생성
        // 자식 클래스의 객체는 부모 클래스의 멤버(변수,메소드) 사용가능
        조류 bird1 = new 조류();
        bird1.name = "비둘기";
        bird1.show();
        // 3.참새객체 생성
        참새 sparrow1 = new 참새();
        sparrow1.name = "참새";
        sparrow1.show();
        // 4.닭 객체 생성
        // 상위 클래스의 객체가 먼저 생성, 하위 클래스 생성
        닭 chicken1 = new 닭();
        chicken1.name = "닭";
        chicken1.show();

        // ******* 다형성 ********
        // 하나의 자료가 다양한 형식 성질
        // 1.참새타입은 조류 타입 가능
        // 1) 상속관계(논리) 2) 참새 인스턴스 생성될때 조류+동물 인스턴스 생성
        조류 bird2 = sparrow1; // 자동타입변환 , 업캐스팅(올라가기)
        // 2.참새타입은 동물타입 가능
        동물 animal2 = sparrow1; // 업캐스팅
        // 3.동물타입에서 참새타입 불가능 X
        // 1) 변활할 타입 명시 2)
        참새 sparrow2 = (참새) animal2; // 강제타입변환, 다운캐스팅 => animal2가 실제로 가리키는 객체는 참새이므로 가능
        참새 sparrow3 = (참새) animal1; // 오류발생! => animal1은 생성할때 동물만 생성


    }
}

class 동물{ // 부모 클래스
    String name;
    동물(){}{
        System.out.println("동물 생성");
    }
    void show(){
        System.out.println("동물 뜁니다.");
    }
}

class 조류 extends 동물{ // 하위클래스명 extends 상위클래스명{ }

}

class 참새 extends 조류{

}

class 닭 extends 조류{

}
