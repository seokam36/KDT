package day11;

public class Interface_exam2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        // 한국타이어 삽입
        myCar.tire = new HankookTire();
        myCar.run();
        // 금호타이어 교체
        myCar.tire = new KumhoTire();
        myCar.run();
        // 익명(클래스없이)구현체 => 일회성 사용하는 인터페이스 구현체
        // 자체적으로 추상메소드 오버라이딩
        myCar.tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("일회성 타이어");
            }
        };
        myCar.run();
    }
}

class Car{
    Tire tire;
    void run(){
        this.tire.roll();
    }
}

interface Tire{
    void roll();
}

class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국타이어");
    }
}
class KumhoTire implements Tire{
    @Override
    public void roll() {
        System.out.println("금호타이어");
    }
}
