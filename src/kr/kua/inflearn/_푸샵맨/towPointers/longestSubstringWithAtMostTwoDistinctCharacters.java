package kr.kua.inflearn._푸샵맨.towPointers;

import java.util.HashMap;
import java.util.Map;

public class longestSubstringWithAtMostTwoDistinctCharacters { // 최대 2개의 고유 문자가 있는 가장 긴 부분 문자열
    public static void main(String args[]) {
        System.out.println(solve("ccaabbb"));
    }

    static int solve(String str) {
        // 1. ds
        Map<Character, Integer> map = new HashMap<>();
        int l=0, r=0, counter=0, max=0;

        // 2.
        while (r < str.length()) {
            char c = str.charAt(r); // ccaabb
            map.put(c, map.getOrDefault(c, 0) + 1); // c=2, a=2, b=3
            if (map.get(c) == 1) counter++; // 3
            r++;

            while (counter > 2) {
                char c2 = str.charAt(l);
                map.put(c2, map.get(c2) - 1);
                if (map.get(c2) == 0) counter--; // 2
                l++;
            }

            max = Math.max(max, r - 1);
        }

        return max;
    }
}
