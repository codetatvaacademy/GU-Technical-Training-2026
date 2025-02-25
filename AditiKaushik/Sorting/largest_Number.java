// 179. Largest Number

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class LargestNumberComparator implements Comparator<String> {

    public int compare(String s1, String s2) {

        String str1 = s1 + s2;
        String str2 = s2 + s1;
        return str2.compareTo(str1);
    }
}
class largest_Number{
    public static String largestNumber(int[] nums) {

        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s, new LargestNumberComparator());

        if (s[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNumber = new StringBuilder();

        for (String str : s) {
            largestNumber.append(str);
        }

        return largestNumber.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println(largestNumber(nums));
        sc.close();
    }
}

//Time Complexity: O(nmlogn) where m is the max number of digits in nums
//Space Complexity: O(nm)