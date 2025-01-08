package Vikash_Kumar_Sharma.Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
	    public static void main(String[] args) {
	        Scanner sn = new Scanner(System.in);
	    	System.out.println("Enter String Name :");
	        String str =sn.nextLine(); 
	        char[] charArray = str.toCharArray();	        
	        Arrays.sort(charArray);
	        String sortedStr = new String(charArray);
	        System.out.println("Original String: " + str);
	        System.out.println("Sorted String: " + sortedStr);
	    }
	}