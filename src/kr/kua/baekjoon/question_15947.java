package kr.kua.baekjoon;

import java.util.Scanner;

public class question_15947 { // 이런 문제는 contains 로 문자열 검색이 아닌 길이로 체크해서 ru 의 개수를 가늠하도록 하자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        String lyrics = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan";
        String[] arr_lyrics = lyrics.split(" ");

        int re = a % arr_lyrics.length;
        if (re == 0) System.out.println(arr_lyrics[arr_lyrics.length - 1]);
        else {
            String cur_str = arr_lyrics[re - 1];
            if (cur_str.contains("turu")) {
                int counting = a / arr_lyrics.length;
                if (cur_str.contains("tururu"))
                    if (counting >= 3) System.out.println("tu+ru*" + (counting + 2));
                    else  System.out.println(cur_str + getRuRuRu(a / arr_lyrics.length));
                else
                    if (counting >= 4) System.out.println("tu+ru*" + (counting + 1));
                    else  System.out.println(cur_str + getRuRuRu(a / arr_lyrics.length));
            } else System.out.println(cur_str);
        }
    }

    public static String getRuRuRu(int count) {
        StringBuilder sb = new StringBuilder();
        while(count-- != 0) sb.append("ru");
        return sb.toString();
    }
}