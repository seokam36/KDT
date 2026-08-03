package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Java_DynamicArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[0];
        while (true) {
            
            System.out.println("1.요소 추가 | 2.인덱스로 삭제 | 0.종료");
            System.out.printf("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            if(num == 1){
                System.out.printf("추가할 정수 값을 입력하세요 : ");
                int addNum = sc.nextInt();
                int[] newArr = new int[arr.length+1];
                newArr[arr.length] = addNum;
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
                System.out.println(Arrays.toString(arr));
            } else if(num == 2){
                if(arr.length == 0){
                    System.out.println("삭제할 데이터가 없습니다.");
                    continue;
                }
                System.out.printf("삭제할 인덱스 번호(0~"+(arr.length-1)+")를 입력하세요 : ");
                int rmNum = sc.nextInt();
                if(rmNum < 0 || rmNum >= arr.length){
                    System.out.println("잘못된 인덱스를 입력했습니다.");
                    continue;
                }
                int[] newArr = new int[arr.length-1];
                /* 삭제된 인덱스 newArr, j로 따로 관리 */
                int j = 0;
                for (int i = 0; i < arr.length; i++) {
                    /* 삭제된 인덱스는 continue로 넘겨서 배열 복사하지 않기 */
                    if(i==rmNum){
                        continue;
                    }
                    newArr[j] = arr[i];
                    j++;
                }
                arr = newArr;
                System.out.println(Arrays.toString(arr));
            } else if(num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
