package kr.kua.programmers;

import java.util.Stack;

public class remove_pairs { // 짝지어 제거하기
    public remove_pairs() {
        int result = solution("baabaa");
        System.out.println("result : " + result);
        int result2 = solution("cdcd");
        System.out.println("result : " + result2);
    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
