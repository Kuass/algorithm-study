package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_2953 { // 나는 요리사다
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var arr = new int[2];
        for (var i = 0; i < 5; i++) {
            var curSum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
            if (arr[1] < curSum) {
                arr[1] = curSum;
                arr[0] = i + 1;
            }
        }

        System.out.print(Arrays.toString(arr).replaceAll("[^0-9 ]", ""));
    }
}