package kr.kua.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class question_17677 { // 뉴스 클러스터링
    public static void main(String[] args) {
        int result = solution("FRANCE", "french");
        System.out.println("result : " + result);
        int result2 = solution("handshake", "shake hands");
        System.out.println("result : " + result2);
        int result3 = solution("aa1+aa2", "AAAA12");
        System.out.println("result : " + result3);
        int result4 = solution("E=M*C^2", "e=m*c^2");
        System.out.println("result : " + result4);
    }

    public static int solution(String str1, String str2) {
        List<String> splitStr1 = new ArrayList<>();
        List<String> splitStr2 = new ArrayList<>();

        for (var i = 0; i < str1.length()-1; i++) {
            String tempStr = str1.substring(i, i+2).toLowerCase();
            if (tempStr.matches("^[a-z]*$"))
                splitStr1.add(tempStr);
        }
        for (var i = 0; i < str2.length()-1; i++) {
            String tempStr = str2.substring(i, i+2).toLowerCase();
            if (tempStr.matches("^[a-z]*$"))
                splitStr2.add(tempStr);
        }

        if (splitStr1.isEmpty() || splitStr2.isEmpty()) {
            return 65536;
        } else {
            var intersection = 0;
            var hSet = new HashSet<String>();
            hSet.addAll(splitStr1);
            hSet.addAll(splitStr2);

            for (int i = 0; i < splitStr1.size(); i++) {
                int index = splitStr2.indexOf(splitStr1.get(i));
                if (index != -1) {
                    splitStr2.remove(index);
                    splitStr1.remove(i);
                    i = 0;
                    intersection++;
                }
            }

            int union = hSet.size();
            return (int)((double)intersection / union * 65536);
        }
    }
}

