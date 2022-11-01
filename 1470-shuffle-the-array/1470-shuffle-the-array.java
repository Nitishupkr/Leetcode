class Solution {
            public static void main(String [] args) {
	}
	public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[n + i];
        }
        return ans;
    }
}
