package programmers;

import java.util.HashMap;

public class question_42577 { // 전화번호 목록
    public static void main(String[] args) {
        boolean result = solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println("result : " + result);
        boolean result2 = solution(new String[]{"123", "456", "789"});
        System.out.println("result : " + result2);
        boolean result3 = solution(new String[]{"12", "123", "1235", "567", "88"});
        System.out.println("result : " + result3);
    }

    public static boolean solution(String[] numbers) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++)
            map.put(numbers[i], i);

        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers[i].length(); j++)
                if (map.containsKey(numbers[i].substring(0, j)))
                    return false;

        return true;
    }

    public static boolean solution_back(String[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int len = numbers[i].length();
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j].length() >= len
                        && numbers[i].hashCode() == (numbers[j].substring(0, len).hashCode()))
                    return false;
                else if (numbers[j].length() < len
                        && numbers[j].hashCode() == numbers[i].substring(0, numbers[j].length()).hashCode())
                    return false;
        }

        return true;
    }
}

