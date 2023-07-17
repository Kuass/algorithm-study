package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class question_4344 {
    public static void main(String[] args) throws IOException { // 평균은 넘겠지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var C = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(var i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine()," ");

            var N = Integer.parseInt(st.nextToken());
            var arr = new int[N];

            var sum = 0.000f;
            for(var j = 0 ; j < N ; j++) {
                var val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }

            var mean = (sum / N);
            var count = 0;
            for(int j = 0 ; j < N ; j++)
                if(arr[j] > mean) count++;

            System.out.printf("%.3f%%\n",((double)count/N)*100);
        }
    }

    public static void main_back(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var C = Integer.parseInt(br.readLine());
        for (var i = 0; i < C; i++) {
            var N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            var sum = 0.000f;
            for (var j = 1; j <= N[0]; j++)
                sum += N[j];

            sum = sum / N[0];
            var count = 0;
            for (var j = i; j <= N[0]; j++)
                if (sum < N[j]) count++;

            System.out.printf("%.3f%%%n", ((double)count/N[0]) * 100);
        }
    }
}