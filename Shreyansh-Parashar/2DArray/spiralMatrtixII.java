import java.util.*;
public class spiralMatrtixII {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        
        int r1 = 0;
        int c1 = 0;
        int r2 = n-1;
        int c2 = n-1;
        int val = 1;
        while(r1 <= r2 && c1 <= c2){

            for(int c = c1; c <= c2; c++){
                ans[r1][c] = val;
                val++;
            }
            for(int r = r1+1; r <= r2; r++){
                ans[r][c2]= val;
                val++;
            }
            if(r1 < r2 && c1 < c2){

                for(int c = c2 - 1; c >= c1; c--){
                    ans[r2][c]= val;
                    val++;
                }
                for(int r = r2 - 1; r > r1 ; r--){
                    ans[r][c1]= val;
                    val++;
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return ans;
    }
    public static void main(String[] args) {
        spiralMatrtixII obj = new spiralMatrtixII();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive integer: ");
        int n = sc.nextInt();

        int[][] ans = obj.generateMatrix(n);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ans[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }
}