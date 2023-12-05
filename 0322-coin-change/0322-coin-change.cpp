class Solution {
public:
     int minimizingCoinBottomUp(int sum, vector<int> arr){   // Bottom UP
        vector<int> dp(10005,-2);
        dp[0] = 0;

        for(int i=1; i<=sum; i++){
            int ans = INT_MAX;
            for(int j=0; j<arr.size(); j++){
                if(i-arr[j]<0) continue;
                ans = min(ans,dp[i-arr[j]]);
            }
            if(ans==INT_MAX) dp[i] = ans;
            else dp[i] = ans+1;
        }

        if(dp[sum]==INT_MAX) return -1;
        else return dp[sum];
    }

    int coinChange(vector<int>& coins, int amount) {

        return minimizingCoinBottomUp(amount,coins); 
    }
};