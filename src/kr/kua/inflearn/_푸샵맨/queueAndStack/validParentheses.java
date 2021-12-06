package kr.kua.inflearn._푸샵맨.queueAndStack;

import java.util.Stack;

public class validParentheses { // 유효한 괄호
    public static void main(String args[]) {
        String s = "()[]{}";
        validParentheses a = new validParentheses();
        System.out.println(a.solve(s));
    }

    public boolean solve(String s) {
        // 1.
        Stack<Character> stack = new Stack<>();

        // 2.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('
            || s.charAt(i) == '['
            || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else if (s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else return false;
        }

        return stack.isEmpty();
    }
}
