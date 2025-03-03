import java.util.Scanner;

public class CountNegativeInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(countNegatives(matrix));
    }
    private static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            int idx = findPositiveIndex(grid[i]);
            count += grid[i].length-idx;
        }
        return count;
    }
    private static int findPositiveIndex(int[] row){
        int start = 0;
        int end = row.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(row[mid]<0){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
