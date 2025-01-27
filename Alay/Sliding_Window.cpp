//3206
class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& colors) 
    {
        int n = colors.size();
        for(int i=0;i<n;i++)
            colors.push_back(colors[i]);
        
        int ans = 0;
        for(int i=0;i<n;i++)
            if(colors[i] == colors[i+2] and colors[i] != colors[i+1])
                ans++;
        return ans;
    }
};

//1248
class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        int count = 0, oddCount = 0, left = 0, right = 0;
        int n = nums.size();
        int prefixCount = 0;

        while (right < n) {
            if (nums[right] % 2 == 1) {
                oddCount++;
                prefixCount = 0;
            }
            while (oddCount == k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                prefixCount++;
                left++;
            }
            count += prefixCount;
            right++;
        }

        return count;
    }
};

//1343
class Solution {
 public:
  int numOfSubarrays(vector<int>& arr, int k, int threshold) {
    int ans = 0;
    int windowSum = 0;

    for (int i = 0; i < arr.size(); ++i) {
      windowSum += arr[i];
      if (i >= k)
        windowSum -= arr[i - k];
      if (i >= k - 1 && windowSum / k >= threshold)
        ++ans;
    }

    return ans;
  }
};

//1358
class Solution {
public:
    int numberOfSubstrings(string s) {
        vector<int> ans(3, -1);
        int count = 0;
        for(int i = 0; i < s.size(); ++i){
            if(s[i] == 'a'){
                ans[0] = i;
            }
            if(s[i] == 'b'){
                ans[1] = i;
            }
            if(s[i] == 'c'){
                ans[2] = i;
            }
            if(ans[0] != -1 && ans[1] != -1 && ans[2] != -1){
                count += 1 + min(ans[0], min(ans[1], ans[2]));
            }
        }
        return count;
    }
};

//1358
class Solution {
public:
    int numberOfSubstrings(string s) {
        vector<int> ans(3, -1);
        int count = 0;
        for(int i = 0; i < s.size(); ++i){
            if(s[i] == 'a'){
                ans[0] = i;
            }
            if(s[i] == 'b'){
                ans[1] = i;
            }
            if(s[i] == 'c'){
                ans[2] = i;
            }
            if(ans[0] != -1 && ans[1] != -1 && ans[2] != -1){
                count += 1 + min(ans[0], min(ans[1], ans[2]));
            }
        }
        return count;
    }
};

//2134
class Solution {
public:
    int minSwaps(vector<int>& nums) {
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }
        if (totalOnes == 0) return 0;
        int n = nums.size();
        int currentOnes = 0;
        int minSwaps = INT_MAX;
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }
        minSwaps = totalOnes - currentOnes;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == 1) {
                currentOnes--;
            }
            if (nums[(i + totalOnes - 1) % n] == 1) {
                currentOnes++;
            }
            minSwaps = min(minSwaps, totalOnes - currentOnes);
        }

        return minSwaps;

    }
};

//1052
class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int unsatisfied = 0, maxUnsatisfied = 0, satisfied = 0;

        for (int i = 0; i < minutes; i++) {
            unsatisfied += grumpy[i] * customers[i];
        }

        maxUnsatisfied = unsatisfied;

        for (int i = minutes; i < customers.size() && i >= 0; i++) {
            unsatisfied += grumpy[i] * customers[i];
            if (i - minutes >= 0) {
                unsatisfied -= grumpy[i - minutes] * customers[i - minutes];
            }
            maxUnsatisfied = max(maxUnsatisfied, unsatisfied);
        }

        satisfied = 0;

        for (int i = 0; i < customers.size(); i++) {
            satisfied += (1 - grumpy[i]) * customers[i];
        }

        return satisfied + maxUnsatisfied;
    }
};

//1004
class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int left = 0, maxLength = 0, zeroCount = 0;

        for (int right = 0; right < nums.size(); ++right) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = max(maxLength, right - left + 1);
        }

        return maxLength;
    }
};

//1456
class Solution {
public:
    int maxVowels(string s, int k) {
        int vowelCount = 0, maxVowelCount = 0;
        int start = 0;
        for (int i = 0; i < s.size(); i++) {
            vowelCount += isVowel(s[i]); 
            if (i >= k-1) {
                maxVowelCount = std::max(vowelCount, maxVowelCount);
                vowelCount -= isVowel(s[start]);
                start++;
            }
        }

        return maxVowelCount;
    }

    bool isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
};

//1695
class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int n = nums.size();
        unordered_set<int> seen;
        int left = 0, right = 0, sum = 0, max_sum = 0;
        
        while (right < n) {
            while (seen.count(nums[right])) {
                seen.erase(nums[left]);
                sum -= nums[left];
                left++;
            }
            
            seen.insert(nums[right]);
            sum += nums[right];
            max_sum = max(max_sum, sum);
            right++;
        }
        
        return max_sum;
    }
};

//1208
class Solution {
    public:
        int equalSubstring(string s, string t, int maxCost) {
            int start = 0, end = 0, maxLen = 0, cost = 0;
            while(end < s.size()){
                cost += abs(s[end] - t[end]);
                while(cost > maxCost){
                    cost -= abs(s[start] - t[start]);
                    start++;
                }
                maxLen = max(maxLen, end - start + 1);
                end++;
            }
            return maxLen;
        }
};

//1423
class Solution {
public:
    int maxScore(std::vector<int>& cardPoints, int k) {
        int n = cardPoints.size();
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += cardPoints[i];
        }
        if (k == n) {
            return totalSum;
        }
        int windowSum = 0, minWindowSum = INT_MAX;
        for (int i = 0; i < n; i++) {
            windowSum += cardPoints[i];
            if (i >= n - k - 1) {
                minWindowSum = min(minWindowSum, windowSum);
                windowSum -= cardPoints[i - (n - k - 1)];
            }
        }
        return totalSum - minWindowSum;
    }
};

//713
class Solution {
public:
  int numSubarrayProductLessThanK(vector<int>& nums, int k) {
    int left = 0, right = 0, product = 1, count = 0;
    int n = nums.size();
    if(k <= 1) return 0;
    while (right < n) {
      product *= nums[right];
      while (product >= k) product /= nums[left++];
      count += 1 + (right - left);
      right++;
    }
    return count;
  }
};

//438
class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int s_len = s.length();
        int p_len = p.length();
        if(s.size() < p.size()) return {};
        vector<int> freq_p(26,0);
        vector<int> window(26,0);
        for(int i=0;i<p_len;i++){
            freq_p[p[i]-'a']++;
            window[s[i]-'a']++;
        }
        vector<int> ans;
        if(freq_p == window) ans.push_back(0);
        for(int i=p_len;i<s_len;i++){
            window[s[i-p_len] - 'a']--;
            window[s[i] - 'a']++;
            
            if(freq_p == window) ans.push_back(i-p_len+1);
        }
        return ans;
    }
};

//209
class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int start = 0, end = 0, minLen = nums.size() + 1, cost = 0;

        while (end < nums.size()) {
            cost += nums[end];

            while (cost >= target) {
                minLen = min(minLen, end - start + 1);
                cost -= nums[start];
                start++;
            }
            end++;
        }
        if(minLen == nums.size() + 1){
            return 0;
        }
        return minLen;
    }
};

//567
class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if (s1.length() > s2.length()) {
            return false; 
        }
        vector<int> s1_count(26, 0);
        vector<int> s2_count(26, 0);
        for (char c : s1) {
            s1_count[c - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            s2_count[s2[i] - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (s1_count == s2_count) {
                return true; 
            }
            s2_count[s2[i] - 'a']--;
            s2_count[s2[i + s1.length()] - 'a']++;
        }
        return s1_count == s2_count;
    }
};

//3208
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        int answer = 0;
        int count = 0;
        int length = colors.length;

        for (int i = 1, start = 0; i < 2 * length - 1; i++) {
            if (i == length - 1) {
                count = answer;
            }
            if (colors[i % length] == 1 && colors[(i - 1) % length] == 0) {
                if (i - start + 1 >= k) {
                    ++answer;
                }
            }
            else if (colors[i % length] == 0 && colors[(i - 1) % length] == 1) {
                if (i - start + 1 >= k) {
                    ++answer;
                }
            }
            else {
                start = i;
            }
        }

        return answer - count;
    }
}

//1658
class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
        int n = nums.size();
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum < x) {
            return -1; 
        }

        int target = totalSum - x; 
        int left = 0, right = 0, currSum = 0, maxLen = 0;

        while (right < n) {
            currSum += nums[right];

            while (left <= right && currSum > target) {
                currSum -= nums[left];
                left++;
            }

            if (currSum == target) {
                maxLen = max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen == -1 ? -1 : n - maxLen; 
    }
};

//3
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.size() == 0) return 0;
        vector<int> arr(256, 0);
        int start = 0, end = 0, maxLen = 0;
        while(end < s.size()){
            int d = s[end];
            arr[d]++;
            while(arr[d] > 1){
                int di = s[start];
                arr[di]--;
                start++;
            }
            maxLen = max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
};

//239
class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> leftMax(n), rightMax(n), result(n - k + 1);
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                leftMax[i] = nums[i];
            } else {
                leftMax[i] = max(leftMax[i - 1], nums[i]);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || (i + 1) % k == 0) {
                rightMax[i] = nums[i];
            } else {
                rightMax[i] = max(rightMax[i + 1], nums[i]);
            }
        }
        for (int i = 0; i <= n - k; i++) {
            result[i] = max(rightMax[i], leftMax[i + k - 1]);
        }
        
        return result;
    }
};

//76
class Solution {
public:
    string minWindow(string s, string t) {
        if (s.empty() || t.empty() || s.size() < t.size()) {
            return "";
        }

        int charCount[256] = {0};
        for (char c : t) {
            charCount[c]++;
        }

        int left = 0, right = 0;
        int count = t.size();
        int minLen = INT_MAX;
        int startIndex = 0;

        while (right < s.size()) {
            char rChar = s[right];
            if (charCount[rChar] > 0) {
                count--;
            }
            charCount[rChar]--;
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }

                char lChar = s[left];
                if (charCount[lChar] >= 0) {
                    count++;
                }
                charCount[lChar]++;
                left++;
            }
        }

        return minLen == INT_MAX ? "" : s.substr(startIndex, minLen);
    }
};
