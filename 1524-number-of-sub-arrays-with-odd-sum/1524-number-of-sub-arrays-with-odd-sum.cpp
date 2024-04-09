class Solution {
public:
    int numOfSubarrays(vector<int>& arr) {
          const int mod = 1e9 + 7;
        long long odd = 0, even = 1; 
        long long result = 0, sum = 0;
          for (int& num : arr) {
            sum += num;
            // If sum is odd, increment result by the number of even sum subarrays
            // found so far since adding an odd number flips the parity
            if (sum % 2) {
                result += even;
                odd++; // This subarray contributes to an odd sum
            } else {
                result += odd;
                even++; // This subarray contributes to an even sum
            }
            result %= mod;
        }

        return result;
    }
};