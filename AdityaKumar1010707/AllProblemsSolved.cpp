#include <iostream>
#include <vector>
using namespace std;

//Problem 1
/*
 *Balancing weights
 *
 */

int findBalancingIndex(int arr[], int n) {
    //Prefix array
    std::vector<int> prefix(n, 0);

    //Populating prefix array
    prefix[0]=arr[0];
    for (int i = 1; i < n; i++) {
        prefix[i]=prefix[i-1]+arr[i];
    }

    //Calculating leftSum and rightSum
    for(int i=1;i<n-1;i++) {
        int leftSum = prefix[i-1];
        int rightSum = prefix[n-1] - prefix[i];
        if(leftSum == rightSum) {
            return i;
        }
    }
}

/*
 * Problem 2
 * Flight booking
 */

vector<int> flightBooking(int arr[][3],int size,int n) {
    //For storing answer vector/array
    vector<int> result;



    vector<int> prefix(n, 0);

    for(int i = 0; i < size; i++) {
        int left = arr[i][0];
        int right = arr[i][1];
        int val = arr[i][2];
        for(int j = left;j<=right;j++) {
            prefix[j-1] = prefix[j-1]+val;
        }

    }

    return prefix;
}

/*
 * Problem 2
 * Sum of rectangle
 */

class NumMatrix {
    int arr[][];
    int prefix[][];
    public:
    NumMatrix(int matrix[][]) {
        int rows = sizeof(matrix) / sizeof(matrix[0][0]);
        int cols = sizeof(matrix) / sizeof(matrix[0][0]);

        //Initializing arr matrix
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {

                arr[i][j] = matrix[i][j];

            }
        }


        //Initializing Prefix Matrix
        for(int i=0;i<rows;i++) {
            prefix[i][0] = matrix[i][0];
            for(int j=1;j<cols;j++) {

                prefix[i][j-1] = matrix[i][j] + prefix[i][j-1];

            }
        }
    }
    //this will yeild result in just O(n) TC
    int sumRegion(int row1, int col1, int row2, int col2) {
        int sizeRectangle = (row2 - row1) + 1;
        int totalSum = 0;


        for(int i=row1;i<=row2;i++) {
            int rowSum = prefix[i][col2] - (prefix[i][col1] - arr[i][col1]);
            totalSum += rowSum;
        }

        return totalSum;
    }
};

int main() {
    //P1-------------------

  // int arr[] = {2,3,-1,8,4};
  //   int n = sizeof(arr) / sizeof(arr[0]);
  // cout<<findBalancingIndex(arr,n);

    //P2-------------------------

    // int arr2[][3]={   {1,2,10},
    //                   {2,3,20},
    //                   {2,5,25} };
    // int n2 = sizeof(arr2) / sizeof(arr2[0]);
    // // vector<vector<int>>
    // int n = 5;
    //
    //
    //
    // vector<int> ans = flightBooking(arr2,n2,n);
    // for(auto i:ans) {
    //     cout<<i<<" ";
    // }

    //P3 -----------------------
    //Sir asked to do only function

}
