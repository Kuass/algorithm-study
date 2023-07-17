package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class question_2846 { // 오르막길
    public static void main(String[] args) throws IOException, ParseException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        var H = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        var list = new ArrayList<Integer>();
        var meter = 0;
        for (int i = 0; i < H.length; i++)
            if (meter == 0) {
                if (H.length == i + 1) break;
                else if (H[i] < H[i + 1]) meter = H[i + 1] - H[i];
            } else if (H.length == i + 1 || H[i] >= H[i + 1]) {
                list.add(meter);
                meter = 0;
            } else meter += H[i + 1] - H[i];

        System.out.print(list.stream().mapToInt(x -> x).max().orElse(0));
    }
}