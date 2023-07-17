package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_4101 { // 크냐?
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            var N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (N[0] == 0 && N[1] == 0) break;
            System.out.println((N[0] > N[1]) ? "Yes" : "No");
        }
    }
}