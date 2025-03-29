import java.util.Scanner;
class matrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] matrix = new int[r][c];
        int index =0;
        if(m*n != r*c){
            return mat;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[index/c][index%c]=mat[i][j];
                index++;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        matrixReshape s = new matrixReshape();
        int[][] res = s.matrixReshape(mat, r, c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}