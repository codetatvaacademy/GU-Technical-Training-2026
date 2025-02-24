//WAP to take input rupees from the user and convert it into paise.

import java.util.Scanner;

class rupeesIntoPaise{
    public static int convertion(int rupees){
        return rupees*100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int rupees = sc.nextInt();
        System.out.println("Amount in Paise: " + convertion(rupees));
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)