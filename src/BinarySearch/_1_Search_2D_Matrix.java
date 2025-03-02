package BinarySearch;

import java.util.Arrays;

public class _1_Search_2D_Matrix {
}

class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;
        int left = 0, right = row - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][col - 1] >= target) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        int index = -1;
        if (left < row){
            index = Arrays.binarySearch(matrix[left], target);
        }
        return index >= 0;
    }
}
