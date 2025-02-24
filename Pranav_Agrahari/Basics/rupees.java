

import java.util.*;

public class rupees {
    public static int paise (int a){
        int p = a*100;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Amount");
        int a = sc.nextInt();
        System.out.println("The amount in paise is:"+paise(a));
    }
}
