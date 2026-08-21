package day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exam2 {
    public static void main(String[] args) {
        // 스택(stack) : 후입선출 ex) 브라우저(뒤로가기), 실행취소
        // push 삽입, pop 출력
        Stack<String> stack = new Stack<>(); // 스택 메모리 만듬
        stack.push("naver");
        stack.push("news");
        stack.push("blog"); // naver -> news -> blog

        while (!stack.isEmpty()){ // 비어있지 않으면
            System.out.println(stack.pop());
        }

        // 큐(Queue) : 선입선출 ex) 번호표(웨이팅), 프린트(인쇄)
        // offer 삽입, poll 출력
        Queue<String> queue = new LinkedList<>();
        queue.offer("1번");
        queue.offer("2번");
        queue.offer("3번");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
