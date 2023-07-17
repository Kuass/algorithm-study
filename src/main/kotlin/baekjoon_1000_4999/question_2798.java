package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question_2798 { // 블랙잭
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.print(search(cards, NM));
    }

    static int search(int[] cards, int[] NM) {
        var result = 0;

        for (var i = 0; i < NM[0] - 2; i++) {
            for (var j = i + 1; j < NM[0] - 1; j++) {
                for (var t = j + 1; t < NM[0]; t++) {
                    var curResult = cards[i] + cards[j] + cards[t];
                    if (NM[1] == curResult) return curResult;
                    else if (curResult > result && NM[1] > curResult) result = curResult;
                }
            }
        }

        return result;
    }
}