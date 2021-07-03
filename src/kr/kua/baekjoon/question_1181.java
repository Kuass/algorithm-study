package kr.kua.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class question_1181 { // 단어 정렬
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var count = Integer.parseInt(br.readLine());

        var strArr = new String[count];
        for (var i = 0; i < count; i++) strArr[i] = br.readLine();

        Arrays.sort(strArr, (a, b) -> {
            if (a.length() == b.length()) return a.compareTo(b);
            else return a.length() - b.length();
        });

        ArrayList<String> result = new ArrayList<>();
        for (var i = 0; i < count; i++) if (!result.contains(strArr[i])) result.add(strArr[i]);

        for (String s : result) System.out.println(s);
        br.close();
    }
}