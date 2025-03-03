//Question 20
import java.util.*;
//import java.util.Collection;
public class PrintingNumbersInDescendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter number 2:");
        int num2=sc.nextInt();
        System.out.println("Enter number 3:");
        int num3=sc.nextInt();
        Integer[] arr= {num1,num2,num3};
        Arrays.sort(arr);
        System.out.println("Numbers in descending order:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sc.close();
        }


    }
    
}
