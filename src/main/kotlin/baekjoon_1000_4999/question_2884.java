package baekjoon_1000_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class question_2884 {
    public static void main(String[] args) throws IOException, ParseException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        var cal = Calendar.getInstance();
        cal.setTime(new SimpleDateFormat("HH:mm").parse(N[0] + ":" + N[1] + ":00"));
        cal.add(Calendar.MINUTE, -45);
        System.out.print(cal.get(Calendar.HOUR_OF_DAY) + " " + cal.get(Calendar.MINUTE));
    }
}