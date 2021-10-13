package kr.kua.inflearn._푸샵맨.sorting_searching;

import java.util.Arrays;

public class resort_logfile_data {
    public static void main(String args[]) {

    }

    /// Output : 3 2 8 5 0 0
    static String[] solution1(String[] logs) {

        Arrays.sort(logs, (s1, s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDigit2) { // 1. 모두 문자
                int comp = split1[1].compareTo(split2[1]);
                if (comp == 0) return split1[0].compareTo(split2[0]);
                else return comp;
            } else if (isDigit1 && isDigit2) // 2. 모두 숫자
                return 0;
            else if (isDigit1 && !isDigit2) // 3. 첫번째는 숫자, 두번째는 문자
                return 1;
            else return -1; // 4. 첫번째는 문자, 두번째는 숫자
        });

        return logs;
    }
}
