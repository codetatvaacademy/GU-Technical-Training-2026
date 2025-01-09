import java.util.*;
class SpiralOrder{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int r1 =0;
        int c1 =0;
        int r2 =matrix.length-1;
        int c2 =matrix[0].length-1;
        while(r1<=r2 && c1<=c2){
            for(int c =c1; c<=c2;c++){
                ans.add(matrix[r1][c]);
            }
                for(int r = r1+1; r<=r2 ;r++){
                    ans.add(matrix[r][c2]);
                }
                    if(r1<r2 && c1<c2){
                        for(int c=c2-1; c>=c1;c--){
                            ans.add(matrix[r2][c]);
                        }
                        for(int r =r2-1; r>r1; r--){
                            ans.add(matrix[r][c1]);
                        }
                    }
                r1++;
                c1++;
                r2--;
                c2--;
                }
                return ans;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int rows = sc.nextInt();
            System.out.println("Enter the number of colums");
            int cols = sc.nextInt();
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter the number of elements of matrix");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
    
            SpiralOrder sp = new SpiralOrder();
            List<Integer> result = sp.spiralOrder(matrix);
            
            System.out.println("Spiral Order: " + result);
    
            sc.close();
        }
}
    
