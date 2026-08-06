package day07;

public class Exam1 {
    public static void main(String[] args) {
        계산기 계산기 = new 계산기();
        double pi = 계산기.getPi();
        계산기.powerOn();
        계산기.printSum(10,3);
        System.out.println("result = " + 계산기.add(10, 5));

    }
}

class 계산기{
    // 매개변수 X, 반환값 O
    double getPi(){
        return 3.14;
    }

    // 매개변수 X, 반환값 X
    void powerOn(){
        System.out.println("On");
    }

    // 매개변수 O, 반환값 X
    void printSum(int x, int y){
        System.out.println(x + y);
    }

    // 매개변수 O, 반환값 O
    int add(int x, int y){
        return x + y;
    }
}