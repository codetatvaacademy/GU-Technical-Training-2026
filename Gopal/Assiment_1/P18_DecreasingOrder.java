import java.util.Scanner;
import java.util.*;

public class P18_DecreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] num = new int[3] ;
        for ( int i = 0 ; i < 3 ; i++ ) {
            System.out.print("Enter num" + (i+1) + " :-> ");
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.print("Print num in decreasing order :: ");
        for ( int i = 2 ; i >= 0 ; i-- ) {
            System.out.print(num[i] + " ");
        }
    }
}
