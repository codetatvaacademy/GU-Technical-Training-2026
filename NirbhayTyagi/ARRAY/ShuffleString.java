package ARRAY;

import java.util.Scanner;

public class ShuffleString{
    public static String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] shuffled = new char[s.length()];
        for(int i = 0; i < n; i++){
            shuffled[indices[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int[] indices = new int[n];
        System.out.println("Enter the element of array:");
        for(int i = 0; i < n; i++){
            indices[i] = sc.nextInt();
        }
        System.out.println("The shuffled string is : " + restoreString(s, indices));
    }
}