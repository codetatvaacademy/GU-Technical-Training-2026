public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex= searchRow(matrix, target);
        if(rowIndex!=-1){
            return binarySearchOverRow(matrix, rowIndex, target);
        }else{
            return false;
        }
    }

    public static int searchRow(int[][] matrix, int target){
        int m = matrix.length;
        int n=matrix[0].length;
        int min=0;
        int max=m-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(matrix[mid][0]<=target && target<= matrix[mid][n-1]){
                return mid;
            }else if(matrix[mid][0]<target){
                min=mid+1;
            }else {
                max=mid-1;
            }
        }
        return -1;
    }

    public boolean binarySearchOverRow(int[][]matrix, int rowIndex, int target){
        int n =matrix[0].length;
        int min=0;
        int max=n-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(matrix[rowIndex][mid]==target){
                return true;
            }else if(matrix[rowIndex][mid]<target){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return false;
    }
}
