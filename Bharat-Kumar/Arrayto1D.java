import java.util.Scanner;
class Arrayto1D {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        int[][] arr = new int[m][n];
        if(m*n != len){
            return new int[0][0];
        }
        int index  =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[index];
                index ++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Arrayto1D s = new Arrayto1D();
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int[] original = new int[len];
        for(int i=0;i<len;i++){
            original[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] res = s.construct2DArray(original, m, n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }   
}