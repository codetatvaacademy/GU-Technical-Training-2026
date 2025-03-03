//1480
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        for (int i = 1; i < nums.size(); i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
};

//1732
class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }
};

//1413
class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int prefix_sum = 0;
        int min_prefix_sum = 0;

        for (int num : nums) {
            prefix_sum += num;
            min_prefix_sum = min(min_prefix_sum, prefix_sum);
        }

        return 1 - min_prefix_sum;
    }
};

//303
class NumArray {
public:
    NumArray(vector<int>& nums) {
        prefixSum.resize(nums.size() + 1);
        prefixSum[0] = 0;
        for (int i = 0; i < nums.size(); i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

private:
    vector<int> prefixSum;
};

//1422
class Solution {
public:
    int maxScore(string s) {
        int n = s.size();
        int totalOnes = 0;
        for (char c : s) {
            if (c == '1') {
                totalOnes++;
            }
        }
        int maxScore = 0;
        int leftZeros = 0, leftOnes = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s[i] == '0') {
                leftZeros++;
            } else {
                leftOnes++;
            }
            int rightOnes = totalOnes - leftOnes;
            maxScore = max(maxScore, leftZeros + rightOnes);
        }

        return maxScore;
    }
};

//624
class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.size(); ++i) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1; 
    }
};

//1314
class Solution {
public:
    vector<vector<int>> matrixBlockSum(vector<vector<int>>& mat, int k) {
        int m = mat.size();
        int n = mat[0].size();
        vector<vector<int>> prefixSum(m + 1, vector<int>(n + 1, 0));
        
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                prefixSum[i][j] = mat[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }
        
        vector<vector<int>> result(m, vector<int>(n));
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int r1 = max(0, i - k);
                int c1 = max(0, j - k);
                int r2 = min(m - 1, i + k);
                int c2 = min(n - 1, j + k);
                result[i][j] = prefixSum[r2 + 1][c2 + 1] - prefixSum[r2 + 1][c1] - prefixSum[r1][c2 + 1] + prefixSum[r1][c1];
            }
        }
        return result;
    }
};

//1685
class Solution {
public:
    vector<int> getSumAbsoluteDifferences(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n);
    
        long long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        long long leftSum = 0;
        for (int i = 0; i < n; i++) {
            long long rightSum = totalSum - leftSum - nums[i];
            result[i] = (i * nums[i] - leftSum) + rightSum - (n - i - 1) * nums[i];
            leftSum += nums[i];
        }
        
        return result;
    }
};

//238
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> result(nums.size(), 0);
        int prefix = 1;
        for(int i = 0; i < nums.size(); ++i){
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i = nums.size() - 1; i >= 0; --i){
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
};

//848
class Solution {
public:
    string shiftingLetters(string s, vector<int>& shifts) {
        int total_shifts = 0;
        for (int i = shifts.size() - 1; i >= 0; --i) {
            total_shifts = (total_shifts + shifts[i]) % 26;
            s[i] = (s[i] - 'a' + total_shifts) % 26 + 'a';
        }
        return s;
    }
};
