package inflearn._푸샵맨.towPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAllAnagramInAString { // 문자열에서 모든 아나그램 찾기
    public static void main(String args[]) {
        System.out.println(solve("bacdgabcda", "abcd"));
    }

    static List<Integer> solve(String s, String p) {
        // 1. ds
        List<Integer> list = new ArrayList<>();

        // 2.
        int[] pArr = new int[26];
        for (int i = 0; i < p.length(); i++) pArr[p.charAt(i) - 'a']++; // [1,1,1,1,0,....]

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int[] sArr = new int[26];
            for (int j = 0; j < p.length(); j++) {
                // 0
                sArr[s.charAt(i + j) - 'a']++;
            }
            if (check(pArr, sArr)) list.add(i);
        }

        return list;
    }

    static boolean check(int[] pArr, int[] sArr) {
        for (int i = 0; i < pArr.length; i++) if (pArr[i] != sArr[i]) return false;
        return true;
    }
}
