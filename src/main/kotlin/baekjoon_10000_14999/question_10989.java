package baekjoon_10000_14999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class question_10989 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var cnt = new int[10001];
        var L = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++)
            cnt[Integer.parseInt(br.readLine())]++;

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10001; i++)
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }

        System.out.println(sb);
    }

    public static void main_back(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var L = Integer.parseInt(br.readLine());
        var N = new ArrayList<Integer>();

        while(L-- != 0) N.add(Integer.parseInt(br.readLine()));
        Collections.sort(N);

        while(!N.isEmpty()) {
            System.out.println(N.get(0));
            N.remove(0);
        }
    }
}