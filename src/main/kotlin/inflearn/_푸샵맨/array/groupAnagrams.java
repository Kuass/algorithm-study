package inflearn._푸샵맨.array;

import java.util.*;

public class groupAnagrams { // 그룹 아나그램
    public static void main(String args[]) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(solve(strs));
    }

    // sort O
    static List<List<String>> solve(String[] strs) {
        // 1.
        Map<String, List<String>> map = new HashMap<>();

        // 2. for
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr); // ['a','e','t']

            String key = String.valueOf(charArr);
            // A
//            if (map.containsKey(key)) {
//                map.get(key).add(str);
//            } else {
//                List<String> list = new ArrayList<>();
//                list.add(str);
//                map.put(key, list);
//            }

            // B
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        return new ArrayList<>(map.values());
    }

    // sort X
    static List<List<String>> solve_ascii(String[] strs) {
        // 1.
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        // 2. for
        for (String str : strs) {
            int[] count = new int[26]; // a-z
            for (int k = 0; k < str.length(); k++) count[str.charAt(k) - 'a']++; // [1,0,0,0,1.....1] 26개
            String key = Arrays.toString(count);

            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) result.add(entry.getValue());

        return result;
    }
}
