import java.util.Scanner;

public class largerst_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int num_1 = sc.nextInt();
int num_2 = sc.nextInt();
int num_3 = sc.nextInt();
if(num_1>num_2&&num_1<num_3){
    System.out.println("second largest is " + num_1);

}
else if (num_2>num_1&&num_2<num_3){
    System.out.println("num_2 is second largest" + num_2);
}
else 
System.out.println("num_3 is second largest " + num_3);
    }
    
}
