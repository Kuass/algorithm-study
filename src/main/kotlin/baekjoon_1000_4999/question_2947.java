package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;

public class question_2947 { // 나무 조각
    public static void main(String[] args) throws IOException, ParseException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var piece = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (Arrays.toString(piece).replaceAll("[^0-9]","").equals("12345")) System.out.print("1 2 3 4 5");
        while (!Arrays.toString(piece).replaceAll("[^0-9]","").equals("12345")) {
            for (var i = 0; i < 4; i++) {
                if (piece[i] > piece[i + 1]) {
                    var temp = piece[i];
                    piece[i] = piece[i + 1];
                    piece[i + 1] = temp;
                    System.out.println(Arrays.toString(piece).replaceAll("[^0-9 ]", ""));
                }
            }
        }
    }
}