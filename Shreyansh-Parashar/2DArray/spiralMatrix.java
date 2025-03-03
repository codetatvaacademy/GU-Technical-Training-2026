import java.util.*;
class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r1 = 0;
        int r2 = matrix.length - 1;
        int c1 = 0;
        int c2 = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();

        while(r1 <= r2 && c1 <= c2){
            for(int c = c1; c <= c2; c++){
                ans.add(matrix[r1][c]);
            }

            for(int r = r1 + 1; r <= r2; r++){
                ans.add(matrix[r][c2]);
            }

            if(r1 < r2 && c1 < c2){
                for(int c = c2 -1; c >= c1; c--){
                    ans.add(matrix[r2][c]);
                }
                for(int r = r2 - 1; r > r1; r--){
                    ans.add(matrix[r][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
    public static void main(String[] args) {
        spiralMatrix obj = new spiralMatrix();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter now of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter 2D Matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }           
        }
        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
        sc.close();
        
    }
}