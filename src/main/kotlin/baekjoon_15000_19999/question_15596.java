package baekjoon_15000_19999;

public class question_15596 { // 정수 N개의 합
    class Test {
        long sum(int[] a) {
            long ans = 0;
            for (int j : a) ans += j;
            return ans;
        }
    }
}