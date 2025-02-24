//Time Complexity: O(mlogn)
//Space Compelxity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int m = matrix.length;
        int n = matrix[0].length;
        int columnLeft=0;
        int columnRight=n;
        boolean flag = false;
        for(row = 0 ; row<m ; row++){
            if((target>matrix[row][0] && target<matrix[row][n-1])){
                flag=true;
                break;
            }
            if((target==matrix[row][0] || target==matrix[row][n-1])){
                return true;
            }
        }
        if(flag==false){
            return flag;
        }
        while(columnLeft<columnRight){
            int mid= (columnLeft+columnRight+1)/2;
            if(mid>=0 && mid<n){
                int ele = matrix[row][mid];
                if(target == ele){
                    return true;
                }
                else if(target< ele){
                    columnRight = mid-1;
                }
                else if(target > ele){
                    columnLeft = mid+1;
                }
            }
            else return false;
        }
        return false;
    }
}
