package ARRAY;

import java.util.Scanner;

public class CheckIfTwoStringArraysareEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String word : word1) {
            s1.append(word);
        }

        for (String word : word2) {
            s2.append(word);
        }

        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the strings for word1 : ");   
        String input1 = sc.nextLine();     
        String[] word1 = input1.split(",");         
        System.out.println("Enter the strings for word2: "); 
        String input2 = sc.nextLine();       
        String[] word2 = input2.split(",");                 
        System.out.println("The answer for the array are equivalents:" + arrayStringsAreEqual(word1, word2));
    }
}