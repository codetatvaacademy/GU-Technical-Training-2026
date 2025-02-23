import java.util.Scanner;
public class Sum2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        System.out.println("Enter the elements of 2D array: ");
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        int sum = 0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum of all elements of 2D array is: " + sum);
    }
}
