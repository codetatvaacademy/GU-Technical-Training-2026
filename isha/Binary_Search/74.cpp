class Solution {
    public:
        bool searchMatrix(vector<vector<int>>& matrix, int target) {
            int row=matrix.size();
            int start=1;
            int end=row-1;
            int column=matrix[0].size();
             for (int i = 0; i < row; i++) {
                int start = 0, end = column - 1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }else if(target>matrix[i][mid]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
            }
           return false; 
            
        }
    };