package baekjoon_10000_14999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var arr = new int[26];
        Arrays.fill(arr, -1);

        var S = br.readLine();
        for(var i = 0; i < S.length(); i++) {
            var ch = S.charAt(i);
            if(arr[ch - 'a'] == -1) arr[ch - 'a'] = i;
        }

        for(int val : arr) System.out.print(val + " ");
    }
}