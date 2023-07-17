package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class question_2805 { // 나무 자르기
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var N = t[0];
        var M = t[1];
        var H = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        var start = 0L;
        long end = IntStream.of(H).max().orElse(0);

        while (start <= end) {
            long mid = (start + end) / 2;
            var sum = 0L;

            for (int tree : H)
                if (tree > mid) sum += tree - mid;

            if (sum >= M) start = mid + 1;
            else end = mid - 1;
        }

        System.out.print(end);
    }

    public static void main_back(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var N = t[0];
        var M = t[1];
        var H = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        var Cur_M = 0;
        while (Cur_M < M) {
            var B = IntStream.of(H).max().orElse(0);
            for (var i = 0; i < N; i++) {
                if (H[i] == B) {
                    H[i] = --H[i];
                    Cur_M++;
                }
            }
        }
        System.out.print(IntStream.of(H).max().orElse(0));
    }
}