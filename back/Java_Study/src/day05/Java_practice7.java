package day05;

import java.util.Arrays;
import java.util.Scanner;

class Book{
    String title;
    String author;
    int price;
}
//[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
class Pet{
    String name;
    String species;
    int age;
}
//[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
class  Rectangel{
    int width;
    int height;
}
//[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;
}
//[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
class Product{
    String name;
    int price;
}
//[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
class Member{
    String id;
    boolean isLogin;
}
//[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
class Television{
    int channel;
    int volume;
}
//[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
class  Player{
    String name;
    int power;
    int speed;
}
//[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
class MenuItem{
    String name;
    int price;
    boolean isSignature;
}
//[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
class UserProfile{
    String name;
    int age;
    String mbti;
}
public class Java_practice7 {
    public static void main(String[] args) {
        /*[문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Book 객체 2개를 생성하세요.
        2. 첫 번째 객체에는 "이것이 자바다", "신용권", 30000을, 두 번째 객체에는 "자바의 정석", "남궁성", 28000을 각각 저장하세요.
        3. 두 객체의 모든 정보를 각각 출력하세요.*/
        Book book1 = new Book();
        Book book2 = new Book();
        book1.title = "이것이 자바다";
        book1.author = "신용권";
        book1.price = 30000;
        book2.title = "자바의 정석";
        book2.author = "남궁성";
        book2.price = 28000;
        System.out.println(book1.title + book1.author + book1.price);
        System.out.println(book2.title + book2.author + book2.price);

        /*[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Pet 객체 2개를 생성하세요.
        2. 첫 번째 객체에는 "초코", "푸들", 3을, 두 번째 객체에는 "나비", "코리안숏헤어", 5를 각각 저장하세요.
        3. "이름: [이름], 종류: [품종], 나이: [나이]살" 형식으로 각 반려동물의 프로필을 출력하세요.*/
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        pet1.name = "초코";
        pet1.species = "푸들";
        pet1.age = 3;
        pet2.name = "나비";
        pet2.species = "코리안숏헤어";
        pet2.age = 5;
        System.out.println("이름 : " +pet1.name+", 종류 : "+pet1.species+", 나이 : "+pet1.age+"살");
        System.out.println("이름 : " +pet2.name+", 종류 : "+pet2.species+", 나이 : "+pet2.age+"살");

        /*[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Rectangle 객체를 하나 생성하고, width에 10, height에 5를 저장하세요.
        2. 해당 객체의 width와 height 값을 곱하여 "사각형의 넓이: [넓이]"를 출력하세요.*/
        Rectangel rectangel = new Rectangel();
        rectangel.width = 10;
        rectangel.height = 10;
        System.out.println("사각형의 넓이 : " + rectangel.width*rectangel.height);

        /*[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
        1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000으로 저장하세요.
        2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
        3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.*/
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = "111-222-3333";
        bankAccount.ownerName = "유재석";
        bankAccount.balance = 10000;
        bankAccount.balance += 5000;
        System.out.println("입금 후 잔액 : " + bankAccount.balance);
        bankAccount.balance -= 3000;
        System.out.println("출금 후 잔액 : " + bankAccount.balance);

        /*[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
        2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.*/
        Product product1 = new Product();
        Product product2 = new Product();
        product1.name = "새우깡";
        product1.price = 1500;
        product2.name = "콜라";
        product2.price = 2000;
        if(product1.price > product2.price){
            System.out.println(product1.name);
        } else {
            System.out.println(product2.name);
        }

        /*[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
        1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
        2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
        3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
        4. "로그인 후 상태: [isLogin 값]"을 출력하세요.*/
        Member member = new Member();
        member.id = "admin";
        member.isLogin = false;
        System.out.println("로그인 전 상태 : " + member.isLogin);
        member.isLogin = true;
        System.out.println("로그인 후 상태 : " + member.isLogin);

        /*[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
        2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.*/
        Television television = new Television();
        television.channel = 7; television.volume = 20;
        television.channel = 11;
        television.volume -= 2;
        System.out.println(television.channel+ " " + television.volume);

        /*[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Player 객체 2개를 생성하세요.
        2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
        3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.*/
        Player player1 = new Player();
        Player player2 = new Player();
        player1.name = "손흥민"; player1.power = 90; player1.speed = 95;
        player2.name = "이강인"; player2.power = 85; player2.speed = 92;
        if(player1.power + player1.speed > player2.power + player2.speed){
            System.out.println(player1.name + " " + player1.power + " " + player1.speed);
        } else {
            System.out.println(player2.name + " " + player2.power + " " + player2.speed);
        }
        /*[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
        1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번째는 "계란찜", 3000, false로 저장하세요.
        2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.*/
        MenuItem menu1 = new MenuItem();
        MenuItem menu2 = new MenuItem();
        MenuItem menu3 = new MenuItem();
        menu1.name = "김치찌개"; menu1.price = 8000; menu1.isSignature = true;
        menu2.name = "된장찌개"; menu2.price = 8000; menu2.isSignature = false;
        menu3.name = "계란찜"; menu3.price = 3000; menu3.isSignature = false;
        if(menu1.isSignature){
            System.out.println("[대표메뉴] "+ menu1.name + " : " + menu1.price);
        } else if (menu2.isSignature) {
            System.out.println("[대표메뉴] "+ menu2.name + " : " + menu2.price);
        } else {
            System.out.println("[대표메뉴] "+ menu3.name + " : " + menu3.price);
        }
        /*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
        1. main 함수에서 UserProfile 객체를 하나 생성하세요.
        2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
        3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
        3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.*/
        UserProfile userProfile = new UserProfile();
        Scanner sc = new Scanner(System.in);
        System.out.println("이름");
        String name = sc.next();
        System.out.println("나이");
        int age = sc.nextInt();
        System.out.println("MBTI");
        String mbti = sc.next();
        userProfile.name = name; userProfile.age = age; userProfile.mbti = mbti;
        System.out.println("----- 프로필 -----");
        System.out.println("이름 : " + userProfile.name + ", 나이 : " + userProfile.age + ", MBTI : " + userProfile.mbti);

    }
}
