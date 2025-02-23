//Question 30
import java.util.*;
public class printingTableFromtakenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers:");
        int num=sc.nextInt();
        int table=1;
        for(int i=1;i<=10;i++){
            table=num*i;
            System.out.println(table);
        }
        sc.close();
    }

    
}
