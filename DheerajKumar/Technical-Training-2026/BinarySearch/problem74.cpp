/*
74

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size() - 1, column = matrix[0].size() - 1;

        //#Finding the Row
        int minRow = 0, maxRow = row, midRow = 0;
        while(minRow <= maxRow){
            midRow = (minRow + maxRow) / 2;

            if(target >= matrix[midRow][0] && target <= matrix[midRow][column]){
                break;
            }
            else if(target > matrix[midRow][column]){
                minRow = midRow + 1;
            }
            else{
                maxRow = midRow - 1;
            }
        }

        if(minRow > maxRow){
            return false;
        }
        
        //#Finding the element in the row;
        int minColumn = 0, maxColumn = column, midColumn = 0;
        while(minColumn <= maxColumn){
            midColumn = (minColumn + maxColumn) / 2;
            
            if(target == matrix[midRow][midColumn]){
                return true;
            }

            if(target < matrix[midRow][midColumn]){
                maxColumn = midColumn - 1;
            }
            else{
                minColumn = minColumn + 1;
            }
        }

        return false ;
    }
};

int main(){

    Solution test;

    vector<vector<int>> matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

    if(test.searchMatrix(matrix, 3)){
        cout<<"\n\telement Exist";
    }else{
        cout<<"\n\telement Does not Exist ";
    }

    if(test.searchMatrix(matrix, 13)){
        cout<<"\n\telement Exist";
    }else{
        cout<<"\n\telement Does not Exist ";
    }
}