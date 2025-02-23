/* 122 

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 

Constraints:

1 <= prices.length <= 3 * 104
0 <= prices[i] <= 104

*/

#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int size = prices.size();
        if(size == 1){
            return 0;
        }
        int buyAt = prices[0], sellAt = prices[0], profit = 0;
        for(int i = 1; i < size; i++){
            if(sellAt > prices[i]){
                profit += (sellAt - buyAt);
                buyAt = prices[i];
                sellAt = prices[i];
            }else{
                sellAt = prices[i];
            }
        }
        
        profit = max(profit, profit + (sellAt - buyAt));
        return profit;
    }
};

int main(){
    Solution test;
    vector<int> case1 = {7,1,5,3,6,4}, case2 = {1,2,3,4,5}, case3 = {7,6,4,3,1};

    cout<<"\nMax Profit in case 1 -> "<<test.maxProfit(case1);
    cout<<"\nMax Profit in case 2 -> "<<test.maxProfit(case2);
    cout<<"\nMax Profit in case 3 -> "<<test.maxProfit(case3);
}