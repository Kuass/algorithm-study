package kr.kua.baekjoon;

import java.util.Scanner;

public class question_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = 1;

            for (int i = 0; i < b; i++) r = (r * a) % 10;
            if (r == 0) r = 10;

            System.out.println(r);
        }
        sc.close();
    }

    // 입출력 예제는 모두 정확하게 나오지만 제출 결과가 계속 틀렸다고 나와서....
    // 위처럼 수정됨
    public static void fail_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = a;

            for (int i = 2; i <= b; i++) r = (r * a) % 10;
            if (r == 0) r = 10;

            System.out.println(r);
        }
        sc.close();
    }
}
