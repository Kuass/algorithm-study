package contest.제5회_천하제일_코딩대회.예선;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_A { // 선린인터넷고등학교 교가
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var length = Integer.parseInt(br.readLine());
        System.out.println(br.readLine().substring(length-5, length));
    }
}
