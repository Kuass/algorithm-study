package baekjoon_1000_4999;

import java.io.*;

public class question_1371 { // 가장 많은 글자

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        var cnt = new int[26];
        String str;
        while ((str = br.readLine()) != null)
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') cnt[str.charAt(i) - 'a']++;

        var max = 0;
        for (var i = 0; i < 26; i++) max = Math.max(max, cnt[i]);
        for (var i = 0; i < 26; i++) if (cnt[i] == max) bw.write('a' + i);

        bw.flush();
    }

    public static void main_back(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        var cnt = new int[26];
        while (!(str = br.readLine()).isEmpty()) {
            var words = str.toCharArray();
            for (char word : words) {
                if (word == 0x20) continue;
                cnt[word - 0x61]++;
            }
        }

        int max = 0;
        for (var i = 0; i < 26; i++) max = Math.max(max, cnt[i]);

        for (var i = 0; i < 26; i++)
            if (cnt[i] == max) System.out.print((char) (0x61 + i));
    }
}