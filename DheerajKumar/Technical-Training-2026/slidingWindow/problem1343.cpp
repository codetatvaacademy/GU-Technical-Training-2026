/*
1343
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

 

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
Example 2:

Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 

Constraints:

1 <= arr.length <= 105
1 <= arr[i] <= 104
1 <= k <= arr.length
0 <= threshold <= 104*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
        int start = 0, end = 0, avrageOutCome = 0, sum = 0, countOfSubArray = 0, noOfElements = k;

        while(end < arr.size()){
            k--;

            while(k < 0){

                sum -= arr[start];
                start++;
                k++;
            }
            
            sum += arr[end];
            avrageOutCome = sum / noOfElements;
            
            if(k == 0 && avrageOutCome >= threshold){
                countOfSubArray++;
            }

            end++;
        }
        return countOfSubArray;
    }
};  

int main(){
    Solution test;
    vector<int> array = {2,2,2,2,5,5,5,8};
    
    int noOfElment = 3, thrushold = 4;
    cout<<"\n\t no of subarray -> "<<test.numOfSubarrays(array, noOfElment, thrushold);

    array = {11,13,17,23,29,31,7,5,2,3}; noOfElment = 3; thrushold = 5;
    cout<<"\n\t no of subarray -> "<<test.numOfSubarrays(array, noOfElment, thrushold);

}