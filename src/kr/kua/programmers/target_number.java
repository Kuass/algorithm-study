package kr.kua.programmers;

public class target_number { // 타겟 넘버
    public target_number() {
        int result = solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println("result : " + result);
    }

    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    private int dfs(int[] numbers, int node, int sum, int target) {
        if (node == numbers.length) {
            if (sum == target)
                return 1;
            else return 0;
        }
        return dfs(numbers, node + 1, sum + numbers[node], target)
                + dfs(numbers, node + 1, sum - numbers[node], target);
    }
}

