package kr.kua.programmers.recommend_newid;

public class recommend_newid {
    public recommend_newid() {
        String result = solution("...!@BaT#*..y.ab- cdef._^&ghij009klm.");
        System.out.println("result : " + result);
        String result2 = solution("ab");
        System.out.println("result : " + result2);
        String result3 = solution("z-+.^.");
        System.out.println("result : " + result3);
        String result4 = solution("=.=");
        System.out.println("result : " + result4);
        String result5 = solution("123_.def");
        System.out.println("result : " + result5);
        String result6 = solution("abcdefghijklmn.p");
        System.out.println("result : " + result6);
    }

    public String solution(String new_id) {
        new_id = new_id.replaceAll("[^a-z^A-Z^0-9^.^_^\\s-]", "").replaceAll("\\^", "").toLowerCase(); // Step 1,2
        StringBuilder sb = new StringBuilder();
        boolean keep_comma = false;
        for(int i = 0; i < new_id.length(); i++) { // Step 3
            Character cur_char = new_id.charAt(i);
            if(cur_char == 0x2E && i != new_id.length() - 1 && new_id.charAt(i + 1) == 0x2E)
                keep_comma = true;
            else
                keep_comma = false;

            if (!keep_comma) sb.append(cur_char);
        }
        if (sb.charAt(0) == 0x2E) sb.delete(0, 1); // Step 4
        if (sb.length() == 0) sb.append('a'); // Step 5
        if (sb.charAt(sb.length() - 1) == 0x2E) sb.delete(sb.length() - 1, sb.length()); // Step 4
        String str = sb.toString().replaceAll("\\p{Z}", "a"); // Step 5
        if (str.length() >= 16) str = str.substring(0, 15); // Step 6
        if (str.charAt(str.length() - 1) == 0x2E) str = str.substring(0, str.length() - 1);
        while(str.length() <= 2) str = str + str.charAt(str.length() - 1); // Step 7

        return str;
    }
}
