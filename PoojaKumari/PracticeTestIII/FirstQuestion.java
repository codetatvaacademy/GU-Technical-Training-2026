import java.util.Scanner;
public class FirstQuestion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array and Value of k:");
        int n=sc.nextInt();
        // int k=sc.nextInt();
        int[] weights=new int[n];
        System.out.print("enter the weights value:");
        for(int i=0;i<n;i++){
            weights[i]=sc.nextInt();
        }
        sc.close();
        
    }
    
}
