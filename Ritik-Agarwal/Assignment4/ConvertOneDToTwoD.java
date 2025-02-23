import java.util.Scanner;

public class ConvertOneDToTwoD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];
        for(int i=0; i<n; i++){
            original[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        n = sc.nextInt();
        sc.close();

        int[][] ans = construct2DArray(original, m, n);

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        int size = m*n;
        if(size!=original.length){
            return new int[0][0];
        }
        int j=0;
        int k=0;
        for(int i:original){
            result[j][k] = i;
            k++;
            if(k==n){
                k=0;
                j++;
            }
        }
        return result;
    }
}