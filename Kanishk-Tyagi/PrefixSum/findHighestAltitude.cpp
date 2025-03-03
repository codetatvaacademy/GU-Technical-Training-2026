class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int current_altitude=0;
        int highest_altitude=0;
        for(int i=0;i<gain.size();i++){
            current_altitude += gain[i];
            highest_altitude=max(current_altitude, highest_altitude);
        }
        return highest_altitude;
    }
};
