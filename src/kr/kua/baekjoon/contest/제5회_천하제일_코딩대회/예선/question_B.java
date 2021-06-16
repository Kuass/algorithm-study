package kr.kua.baekjoon.contest.제5회_천하제일_코딩대회.예선;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_B { // 드높은 남산 위에 우뚝 선
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Integer.parseInt(br.readLine());
        var A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var branch = false; // true = 내려가는 중
        for (int i = 1; i < N; i++) {
            if (A[i] > A[i-1]) {
                // 이번 산이 전 산보다 더 클경우

                if (branch) {
                    // 작아져야 하는데, 커지는 경우
                    System.out.print("NO");
                    return;
                }

                if (i != N - 1 && A[i] > A[i+1]) {
                    // 다음 산이 작아질 예정일 경우
                    branch = true;
                }
            } else if (A[i] == A[i-1]) {
                System.out.print("NO");
                return;
            } else {
                // 이번 산이 전 산보다 작을경우

                if (!branch) {
                    // 작아져야 하는데, 커지는 경우
                    System.out.print("NO");
                    return;
                }
            }
        }
        System.out.print("YES");
    }
}
