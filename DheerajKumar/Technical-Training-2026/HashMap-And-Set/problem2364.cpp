#include<iostream>
#include<vector>
#include<unordered_map>
#include<set>

using namespace std;

class Solution {
    public:
        long long countBadPairs(vector<int>& nums) {
            unordered_map<int, set<int>> matching_values;
            long long totalCount = 0;
            int size = nums.size();
    
            for(int i = 0; i < nums.size(); i++){
                matching_values[nums[i] - i].insert(i);
                nums[i] -= i;
            }
    
            for(int i = 0; i < nums.size(); i++){
                set<int> setOfIndesis = matching_values[nums[i]];
                totalCount += size - setOfIndesis.size();
    
                size--;
                matching_values[nums[i]].erase(i);
    
                if(matching_values[nums[i]].empty()){
                    matching_values.erase(nums[i]);
                }
            }
    
            for(auto x : matching_values){
                cout<<"\t"<<x.first<<" - ";
                set<int> setOfIndesis= x.second;
                for(auto y : setOfIndesis){
                    cout<<y<<", ";
                }
                cout<<"\n";
            }
    
            cout<<"\n\tsize of map ->> "<<matching_values.size();
            return totalCount;
        }
    };

    //Time Complaxity O(n log(n) )! TLE!
    