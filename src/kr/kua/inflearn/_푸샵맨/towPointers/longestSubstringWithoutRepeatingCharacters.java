package kr.kua.inflearn._푸샵맨.towPointers;

import java.util.HashMap;
import java.util.Map;

public class longestSubstringWithoutRepeatingCharacters { // 단어중복없는 가장 긴 문자열
    public static void main(String args[]) {
        System.out.println(solve("abcabcd"));
    }

    static int solve(String str) {
        // 1. ds
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, counter = 0, max = 0;

        // 2.
        while (r < str.length()) {
            char c = str.charAt(r); // p
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > 1) counter++;
            r++;

            while (counter > 0) {
                char c2 = str.charAt(1);
                if (map.get(c2) > 1) counter--;
                map.put(c2, map.get(c2) - 1);
                l++;
            }
            max = Math.max(max, r-1);
        }

        return max;
    }
}
