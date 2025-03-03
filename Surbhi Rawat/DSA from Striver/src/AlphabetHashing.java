import java.util.Scanner;

public class AlphabetHashing {

    // WHEN THE STRING CONTAINS ONLY LOWERCASE LETTERS

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        // pre-compute - creating a hash array of size 26
        //ASCII value of 'a' is 97 and 'f' is 102; therefore to find the index(to be stored in hash arr.)
        // we'll 102-97 = 5; therefore we'll subtract ascii value of a from each character's ascii value

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // q denotes the no. of elements we'll find in the array

        int q = in.nextInt();
        while(q-->0){
            char c = in.next().charAt(0);

            // fetching the elements

            System.out.println(hash[c-'a']);
        }
    }
}
