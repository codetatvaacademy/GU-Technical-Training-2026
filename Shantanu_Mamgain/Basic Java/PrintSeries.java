import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms to be printed: ");
        int n = sc.nextInt();

        // 1, 3, 6, 10, 15 ___ n
        /*
        int x =0;
        for(int i = 0; i < n; i++){
            x = i+1+x;
            System.out.print(x+", ");
        }
        */

        // 11, 111, 1111 ___ n
        /* int x= 1;
        for(int i=0;i<n;i++){
            x=(x*10)+1;
            System.out.print(x+" ,");
        } */

        
        // 12, 123, 1234 ___ n
        /* int x=1;
        for(int i =1; i<=n ;i++){
            x=(x*10)+(i+1);
            System.out.print(x+ " ,");
        } */


        // 0, 7, 26, 63, ___ n
        /* int x=0;
        for(int i=1; i<=n; i++){
            x = (int)Math.pow(i,3) - 1;
            System.out.print(x+ " ,");
        } */


        // 0, 1, 1, 2, 3, 5, 8 --- n
        int first=0;
        int second=1;
        
        for(int i=0; i<n;i++){
            System.out.print(first+", ");
            int next = first + second;
            first = second;
            second = next;
        

        }

        // 0, 1, 3, 7, 15, … nth term
        /* int x =0;
        for(int i =0; i<n; i++){
            x= (int)Math.pow(2,i)-1;
            System.out.print(x);
        } */


        // x - x ^ 2 + x ^ 3 - x ^ 4 + x ^ 5 … nth term 
        /* int x= sc.nextInt();
        int total =0;
        for(int i =1 ; i<= n; i++){

            if(i%2==0){
                total -= (int)Math.pow(x,i);
            }
            else{
                total += (int)Math.pow(x,i);
            }
        }
        System.out.print(total); */


        sc.close();
    }
}
