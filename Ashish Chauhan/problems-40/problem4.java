// 4. WAP to take input rupees from the user and convert it into paise.
import java.util.*;

public class Solution {
    public static float rupee_converter(float rupee) {
        return (float) rupee*100;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rupees: ");
        float rupee = sc.nextFloat();

        float paise = rupee_converter(rupee);
        System.out.println(rupee+" in paise : " + paise);
        sc.close(); 
    }
}
