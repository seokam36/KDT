package day08;

public class Exam2 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("유재석");
        System.out.println(user1.getName());
        System.out.println(user1);
    }
}
/*
* DTO : 데이터베이스에 있는 자료 -> 프론트엔드로 이동
*   1. 멤버변수 모두 private
*   2. getter, setter 제공
*   3. toString 제공
*   4. 생성자에 기본생성자1개, 전체매개변수1개 => 2개
*/
class User{
    // 멤버변수 -> private 사용
    private String name;
    private int age;

    // 생성자 -> 빈생성자, 전체생성자 기본적으로 두개 생성 추후에 변경
    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // private 메소드에 대한 간접접근 메소드
    // getter만 존재하면 V(value) O(object) 읽기모드
    // getter,setter 존재하면 D(data)T(transfer)O(object) 읽기,쓰기
    public void setName(String name){
        // 추후에 유효성 검사 추가
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // toString
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
