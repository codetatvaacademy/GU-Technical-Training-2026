class Solution {
public:
    int hIndex(vector<int>& arr) {
        int n = arr.size();
        sort(arr.begin(), arr.end());
        for(int i = 0; i < n; i++) {
            int h = n - i;
            if(arr[i] >= h) {
                return h;
            }
        }
        return 0;
    }
};
