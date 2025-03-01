import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SpiralMatrix{
    public static List<Integer> spiralOrder(int[][] matrix) {
        int r1 = 0;
        int c1 = 0;
        int r2 = matrix.length - 1;
        int c2 = matrix[0].length - 1;
        List<Integer> answer = new ArrayList<>();

        while(r1<=r2 && c1<=c2){
            for(int c=c1; c<=c2; c++){
                answer.add(matrix[r1][c]);
            }
            for(int r=r1+1; r<=r2; r++){
                answer.add(matrix[r][c2]);
            }

            if(r1<r2 && c1<c2){
                for(int c=c2-1; c>=c1; c--){
                    answer.add(matrix[r2][c]);
                }
                for(int r=r2-1; r>r1; r--){
                    answer.add(matrix[r][c1]);
                }
            }

            r1++;
            c1++;
            r2--;
            c2--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");  
        int m = sc.nextInt();
        System.out.println("Enter the no of column:");  
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the element of account: ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the matrix in spiral order is: " + spiralOrder(matrix));
    }
}


//time complexity of the function is : O(m * n)
//space complexity of the function is : O(m * n)


//time complexity of the whole program is : O(m * n)
//space complexity of the whole program is : O(m * n)