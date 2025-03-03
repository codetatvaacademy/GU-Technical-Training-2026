import java.util.Scanner;

class SpiralOrder2{
    public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int r1 =0;
        int c1 =0;
        int r2 =answer.length-1;
        int c2 =answer[0].length-1;
        int value =1;
        while(r1<=r2 && c1<=c2){
            for(int c =c1; c<=c2;c++){
                answer[r1][c]=value;
                value++;
            }
                for(int r = r1+1; r<=r2 ;r++){
                    answer[r][c2] =value;
                    value++;
                    
                }
                    if(r1<r2 && c1<c2){
                        for(int c=c2-1; c>=c1;c--){
                            answer[r2][c] = value;
                            value++;
               
                        }
                        for(int r =r2-1; r>r1; r--){
                            answer[r][c1] =value;
                            value++;
                    
                        }
                    }
                r1++;
                c1++;
                r2--;
                c2--;
                }
                return answer;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of matrix");
            int n = sc.nextInt();

            SpiralOrder2 ob1 = new SpiralOrder2();
            int[][] result = ob1.generateMatrix(n);
            System.out.println("The spiral matrix is ");
            for(int i = 0; i<n;i++){
                for(int j=0; j<n;j++){
                    System.out.print(result[i][j] + "\t");
            }
            System.out.println();
                }
            }
        }
    

    