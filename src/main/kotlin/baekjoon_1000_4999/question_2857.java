package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class question_2857 { // FBI
    public static void main(String[] args) throws IOException, ParseException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var sb = new StringBuilder();
        var find = false;
        for (var i = 0; i < 5; i++)
            if (br.readLine().contains("FBI")) {
                sb.append(i + 1).append(" ");
                find = true;
            }

        System.out.print((find) ? sb.toString() : "HE GOT AWAY!");
    }
}