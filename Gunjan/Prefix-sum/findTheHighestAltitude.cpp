class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int current_alt = 0;
        int highest_point = 0;  
        for (int change : gain) {
            current_alt += change;
            highest_point = max(highest_point, current_alt);
        }

        return highest_point;
    }
};
