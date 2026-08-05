package day06;

import java.util.Scanner;

public class OverallController_test {
    public static void main(String[] args) {
        Post[] posts = new Post[100];
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("-----------------------");
            System.out.println("1. 글쓰기 2. 게시물 출력");
            System.out.println("-----------------------");
            System.out.print("선택> ");
            int num = sc.nextInt();

            if(num == 1){
                System.out.print("내용 : ");
                String content = sc.next();
                System.out.print("작성자 : ");
                String writer = sc.next();
                //콘텐츠 인스턴스 생성
                Post post = new Post(content, writer);
                boolean result = false;

                //post 배열에 삽입
                for (int i = 0; i < posts.length; i++) {
                    if(posts[i] == null){
                        posts[i] = post;
                        result = true;
                        break;
                    }
                }
                if (result = true){
                    System.out.println("[안내] 글쓰기 성공");
                } else {
                    System.out.println("[안내] 글쓰기 실패");
                }
                //게시글 출력
            } else if (num == 2) {
                for (Post post : posts) {
                    if (post == null){
                        break;
                    }
                    System.out.println("작성자 : " + post.writer + ", 내용 : " + post.content);
                }
            }
        }
    }
}

class Post{
    String content;
    String writer;

    public Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}
