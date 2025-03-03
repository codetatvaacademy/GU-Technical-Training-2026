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