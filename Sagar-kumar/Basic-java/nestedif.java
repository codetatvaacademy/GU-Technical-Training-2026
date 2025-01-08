import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int num_1 = sc.nextInt();
     int num_2 = sc.nextInt();
     int num_3 = sc.nextInt();
     if (num_1 > num_2) {
        if (num_1 > num_3) {
            System.out.println("The largest number is: " + num_1);
        } else {
            System.out.println("The largest number is: " + num_3);
        }
    } else {
        if (num_2 > num_3) {
            System.out.println("The largest number is: " + num_2);
        } else {
            System.out.println("The largest number is: " + num_3);
        }
    }
       

    }

     
     
    
}

