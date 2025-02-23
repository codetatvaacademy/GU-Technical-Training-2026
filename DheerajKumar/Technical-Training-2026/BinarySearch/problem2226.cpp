/*2226. Maximum Candies Allocated to K Children
Solved
Medium

You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.

You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can be allocated candies from only one pile of candies and some piles of candies may go unused.

Return the maximum number of candies each child can get.

 

Example 1:

Input: candies = [5,8,6], k = 3
Output: 5
Explanation: We can divide candies[1] into 2 piles of size 5 and 3, and candies[2] into 2 piles of size 5 and 1. We now have five piles of candies of sizes 5, 5, 3, 5, and 1. We can allocate the 3 piles of size 5 to 3 children. It can be proven that each child cannot receive more than 5 candies.
Example 2:

Input: candies = [2,5], k = 11
Output: 0
Explanation: There are 11 children but only 7 candies in total, so it is impossible to ensure each child receives at least one candy. Thus, each child gets no candy and the answer is 0.
 

Constraints:

1 <= candies.length <= 105
1 <= candies[i] <= 107
1 <= k <= 1012*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
    bool maxCandiesPossible(vector<int>& candies, long long k, long long maximum){
        for(int i = 0; i < candies.size(); i++){            
            k -= candies[i] / maximum;
            
            if(k <= 0){
                return true;
            }
        }
        return false;
    }
public:
    int maximumCandies(vector<int>& candies, long long k) {
        long long totalCandies = 0;
        for(int i = 0; i < candies.size(); i++){
            totalCandies += candies[i];
        }

        if(k > totalCandies){
            return 0;
        }

        long long start = 1, end = totalCandies / k, maxCandies = 0,
            validCandies = 0;

        while(start <= end){
            maxCandies = start + (end - start) / 2;

            if(maxCandiesPossible(candies, k, maxCandies)){
                validCandies = maxCandies;
                start = maxCandies + 1;
            }
            else{
                end = maxCandies - 1;
            }
        }
        return validCandies;
    }
};


int main(){
    Solution test;
    vector<int> Input = {5,8,6};
    int childrens = 3;

    cout<<"The maximum number of candies each child can have is ->"<<test.maximumCandies(Input, childrens);
}