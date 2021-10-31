package kr.kua.inflearn._푸샵맨.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiralMatrix {
    public static void main(String args[]) { // 나선형매트릭스
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12}
        };
        System.out.println(solve(nums));
    }

    static List<Integer> solve(int[][] matrix) {
        // 1.
        List<Integer> result = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = matrix.length - 1;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        // 2.
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // right
            for (int i = colStart; i <= colEnd; i++) result.add(matrix[rowStart][i]);
            rowStart++;

            // down
            for (int i = rowStart; i <= rowEnd; i++) result.add(matrix[i][colEnd]);
            colEnd--;

            // left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) result.add(matrix[rowEnd][i]);
                rowEnd--;
            }

            // up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) result.add(matrix[i][colStart]);
                colStart++;
            }
        }

        return result;
    }
}
