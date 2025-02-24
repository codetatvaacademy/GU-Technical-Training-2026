/*You have n jobs and m workers. You are given three arrays: difficulty, profit, and worker where:

difficulty[i] and profit[i] are the difficulty and the profit of the ith job, and
worker[j] is the ability of jth worker (i.e., the jth worker can only complete a job with difficulty at most worker[j]).
Every worker can be assigned at most one job, but one job can be completed multiple times.

For example, if three workers attempt the same job that pays $1, then the total profit will be $3. If a worker cannot complete any job, their profit is $0.
Return the maximum profit we can achieve after assigning the workers to the jobs.

 

Example 1:

Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
Output: 100
Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a profit of [20,20,30,30] separately.
Example 2:

Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
Output: 0
 

Constraints:

n == difficulty.length
n == profit.length
m == worker.length
1 <= n, m <= 104
1 <= difficulty[i], profit[i], worker[i] <= 105*/

#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;
class Solution {

    int searchWork(vector<int>& difficulty, vector<int>& profit, int workerEfficiency){
        int minimum = 0, maximum = difficulty.size() - 1, mid = 0;

        if(workerEfficiency < difficulty[0]){
            return 0;
        }

        while(minimum <= maximum){
            mid = (minimum + maximum) / 2;
            if(workerEfficiency < difficulty[mid]){
                maximum = mid - 1;
            }else{
                minimum = mid + 1;
            }
        }

        return profit[maximum];
    }

    
public:
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        vector<pair<int, int>> mapper;

        for(int i = 0; i < difficulty.size(); i++){
            mapper.push_back({difficulty[i], profit[i]});
        }

        sort(mapper.begin(), mapper.end());

        for(int i = 0; i < difficulty.size(); i++){
            difficulty[i] = mapper[i].first;
            profit[i] = mapper[i].second;
        }

        for(int i = 1; i < difficulty.size(); i++){
            profit[i] = max(profit[i - 1], profit[i]);
        }

        int sum = 0;
        for (int workerEfficiency : worker) {
            sum += searchWork(difficulty, profit, workerEfficiency);
        }

        return sum;

    }
};



int  main(){
    Solution test;
    vector<int> difficulty = {23,30,35,35,43,46,47,81,83,98}, profit = {8,11,11,20,33,37,60,72,87,95}, worker = {95,46,47,97,11,35,99,56,41,92};

    cout<<"\n\tmaximum profit  = "<<test.maxProfitAssignment(difficulty, profit, worker);
    
    difficulty = {2,4,6,8,10}; profit = {10,20,30,40,50}; worker = {4,5,6,7};
    cout<<"\n\tmaximum profit  = "<<test.maxProfitAssignment(difficulty, profit, worker);

    difficulty = {85,47,57}; profit = {24,66,99}; worker = {40,25,25};
    cout<<"\n\tmaximum profit  = "<<test.maxProfitAssignment(difficulty, profit, worker);

}