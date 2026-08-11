package day10;

public class Exam2 {
    public static void main(String[] args) {
        // 자바는 100% 객체지향언어이다.
        // Object(슈퍼클래스) 클래스로부터 모든 클래스는 상속관계
        // 1. A->Object => 총 2개
        A a = new A();
        // 2. B->A->Object
        B b = new B();
        // 3. C->A->Object
        C c = new C();
        // 4. D->B->A->Object
        D d = new D();
        // 5. E->C->A->Object
        E e = new E();

        // [2]자동 타입 변환 / 업캐스팅
        A a2 = b;
        Object o1 = a2;

        // [3]자동 타입 변환 / 다운캐스팅
        B b2 = (B)a2;
        // C c2 = (C) b2, 형제 타입변환 X

        // [4]타입확인, 인스턴스 instanceOf 타입명
        System.out.println(e instanceof Object);
        System.out.println(e instanceof C);
        //System.out.println(e instanceof D); 오류발생
        // 타입변환 전에 instanceOf 활용해서 타입 확인 후 타입변환



    }
}

class A{
    A(){
        System.out.println("[1]A객체 생성");
    }
}
class B extends A{
    B(){
        System.out.println("[2]B객체 생성");
    }
}
class C extends A{
    C(){
        System.out.println("[3]C객체 생성");
    }
}
class D extends B{
    D(){
        System.out.println("[4]D객체 생성");
    }
}
class E extends C{
    E(){
        System.out.println("[5]E객체 생성");
    }
}

