package day11;

public class Interface_exam {
    public static void main(String[] args) {

    }
}

interface Buy{
    // 1) 추상메소드
    void absMethod1();

    // 2) 디폴트메소드 : 구현부가 있는 메소드
    public default void defaultMethod(){}

    // 3) 정적메소드 : static이면 인스턴스 없이 사용 메소드
    public static void staticeMethod(){}

    // 4) 비공개메소드 : 하위타입 오버라이딩 불가능한 메소드
    private void privateMethod(){}
}

interface Sell{
    void absMethod2();
}

// 인터페이스는 다른 인터페이스로부터 상속 가능
interface CustomerControl extends Buy, Sell{
    void order();
}

// implements는 여러개 인터페이스 구현 가능
class Customer implements Buy, Sell{
    // 추상메소드는 필수 오버라이딩x
    @Override
    public void absMethod1() {}

    @Override
    public void absMethod2() {}
}

class Customer2 implements CustomerControl{
    @Override
    public void order() {}

    @Override
    public void absMethod1() {}

    @Override
    public void absMethod2() {}
}
