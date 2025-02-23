
package Binarysearch;

import java.util.Scanner;

class countnegno {
    public static int countNegatives(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
          if(grid[i][j]<0){
            count++;
          }
        }
        }
        return count;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows=sc.nextInt();
        System.out.println("enter coloums");
        int col=sc.nextInt();
        int grid[][] = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                grid[i][j]=sc.nextInt();
            }
        } 
        int ans = countNegatives(grid);
        System.out.println(ans);
        }
} 