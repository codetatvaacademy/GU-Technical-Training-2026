/*
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> spiralMatrix;

        if(matrix.size() == 0){
            return spiralMatrix;
        }

        int top = 0, bottem = matrix.size() - 1,
        right = matrix[0].size() - 1 , left = 0;

        while(top <= bottem && left <= right){

            for(int i = left; i <= right; i++){
                spiralMatrix.push_back(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottem; i++){
                spiralMatrix.push_back(matrix[i][right]);
            }
            right--;

            if(top <= bottem){
                for(int i = right; i >= left; i--){
                    spiralMatrix.push_back(matrix[bottem][i]);
                }
                bottem--;
            }

            if(left <= right){
                for(int i = bottem; i >= top; i--){
                    spiralMatrix.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return spiralMatrix;
    }
};