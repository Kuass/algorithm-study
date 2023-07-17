package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class question_2822 { // 점수 계산
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var score = new int[8];
        for (var i = 0; i < 8; i++) score[i] = Integer.parseInt(br.readLine());

        var scoreSort = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreSort, Collections.reverseOrder());
        var mostFive = Arrays.copyOfRange(scoreSort, 0, 5);

        System.out.println(Arrays.stream(mostFive).mapToInt(Integer::intValue).sum());

        var list = Arrays.stream(score).boxed().collect(Collectors.toList());
        var indexSort = new Integer[5];
        for (var i = 0; i < 5; i++) indexSort[i] = list.indexOf(mostFive[i]) + 1;
        Arrays.sort(indexSort);

        System.out.print(Arrays.toString(indexSort).replaceAll("[^0-9 ]", ""));
    }
}