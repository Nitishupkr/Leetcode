/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
         int[][] matrix = new int[m][n];
    for (int i = 0; i < m; i++) {
        Arrays.fill(matrix[i], -1);
    }

    // Initialize the pointers
    int top = 0, bottom = m - 1, left = 0, right = n - 1;

    // Traverse the linked list
    int direction = 0;
    int row = 0, col = 0;
    while (head != null) {
        // Update the matrix element
        matrix[row][col] = head.val;

        // Move to the next element in the spiral order
        if (direction == 0) {
            if (col == right) {
                direction = 1;
                top++;
                row++;
            } else {
                col++;
            }
        } else if (direction == 1) {
            if (row == bottom) {
                direction = 2;
                right--;
                col--;
            } else {
                row++;
            }
        } else if (direction == 2) {
            if (col == left) {
                direction = 3;
                bottom--;
                row--;
            } else {
                col--;
            }
        } else {
            if (row == top) {
                direction = 0;
                left++;
                col++;
            } else {
                row--;
            }
        }

        // Move to the next node in the linked list
        head = head.next;
    }

    // Fill any remaining empty spaces with -1
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == -1) {
                matrix[i][j] = -1;
            }
        }
    }

    return matrix;
}
}