package day09;

public class Exam2 {
    public static void main(String[] args) {
        // 싱글톤 패턴 : 프로그램 내 단 *하나의* 인스턴스 갖는 설계 구조

        View view = new View();
        System.out.println(view);
        View view1 = new View();
        System.out.println(view1);

        Singleton controller = Singleton.getInstance();
        System.out.println(controller);
        Singleton controller1 = Singleton.getInstance();
        System.out.println(controller1);
    }
}
class View{} //일반 객체 클래스
class Singleton {
    // 싱글톤 클래스
    // 1. 생성자를 private 한다. 다른 클래스에서 객체 생성 차단
    private Singleton(){}

    // 2. 클래스 내부에 단 하나의 인스턴스 생성한다
    private static final Singleton instance = new Singleton();

    // 3. 클래스 내부에 인스턴스를 간접 사용 하도록 getter 만든다
    public static Singleton getInstance(){
        return instance;
    }
}
