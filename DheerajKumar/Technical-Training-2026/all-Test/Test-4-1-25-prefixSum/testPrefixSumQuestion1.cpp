/*Problem 1:   

        .... 1991 leetCode Problem


In a small village, there’s a legendary seesaw located at the center of the town. The
villagers believe that if someone can balance the seesaw perfectly with their weights,
they will receive immense wisdom and clarity in decision-making.
One day, a curious traveler named Alex arrives in the village. He is given an array of
weights, representing villagers lined up on the seesaw. Alex’s task is to find the
middleIndex, where the seesaw is perfectly balanced. The rules for balancing the
seesaw are:
1. The sum of weights on the left side of the middleIndex must equal the sum of
weights on the right side.
2. If Alex considers the first position (index 0), the left side has no weights, so the
sum is 0.
3. Similarly, if Alex considers the last position (index n−1n - 1n−1), the right side
sum is 0.
Alex wants to find the leftmost middleIndex where the seesaw balances. If no such
index exists, he will consider the task impossible and return -1.
Input:
● Alex receives an integer array, nums, representing the weights of villagers.
Output:
● If Alex finds the seesaw's balance point, he returns the leftmost middleIndex.
● If no such index exists, he returns -1.
Example 1:
Input:
nums = [2, 3, -1, 8, 4]
Output:
3
Explanation:
● Left of index 3: 2+3+(−1)=4
● Right of index 3: 4
● The seesaw balances perfectly at index 3.
Example 2:
Input:
nums = [1, -1, 4]
Output:
2
Explanation:
● Left of index 2: 1+(−1)=0
● Right of index 2: 0
● The seesaw balances perfectly at index 2.

Example 3:
Input:
nums = [2, 5]
Output:
-1
Explanation:
● No index satisfies the balance condition.
Constraints:
1. 1≤nums.length≤1000
2. −1000≤nums[i]≤1000*/

#include<iostream>
#include<vector>
using namespace std;

class Solution{
    public:
    int middleSplit(vector<int>& nums){
        int size = nums.size();
        vector<int> prefixSum(size + 1, 0);

        if(size == 1){
            return 0;
        }

        prefixSum[0] = nums[0];
        for(int i = 1; i < size; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        if(prefixSum[0] == prefixSum[size - 1]){
            return 0;
        }

        for(int i = 1; i < size ; i++){
            if(prefixSum[i - 1] == prefixSum[size - 1] - prefixSum[i]){
                return i;
            }
        }
        return -1;
    }
};

int main(){
    Solution test1;

    vector<int> case1 = {2, 3, -1, 8, 4},
        case2 = {1, -1, 4},
        case3 = {2, 5};

    cout<<"\n\tThe middle balance -> "<< test1.middleSplit(case1);
    cout<<"\n\tThe middle balance -> "<< test1.middleSplit(case2);
    cout<<"\n\tThe middle balance -> "<< test1.middleSplit(case3);

}


/*complaxity time - O(n)
            space - O(n)*/