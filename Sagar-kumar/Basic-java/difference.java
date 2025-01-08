import java.util.Scanner;

public class difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        if(num_1>num_2){
            int diff  = num_1-num_2;
            System.out.println("diff is " + diff);
        }
        
        else if(num_2>num_1){

        
        int diff_2 =  num_2-num_1;
        System.out.println("diff_2 is "+ diff_2);
        }
        
    }
    
}
