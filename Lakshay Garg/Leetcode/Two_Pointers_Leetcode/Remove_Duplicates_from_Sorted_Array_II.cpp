class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int k=0;
        map<int,int>mp;
        for(auto it:nums) mp[it]++;
        nums.clear();
        for(auto it:mp){
            if(it.second>=2){
                nums.push_back(it.first);
                nums.push_back(it.first);
                k+=2;
            }
            if(it.second==1){
                nums.push_back(it.first);
                k++;
            }
        }
        return k;
    }
};
