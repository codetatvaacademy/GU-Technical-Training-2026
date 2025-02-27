import java.util.Scanner;

public class AlphabetHash2 {

    // When the String contains both uppercase and lowercase

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();


        int hash[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            (hash[s.charAt(i)])++;
        }

        int q = in.nextInt();
        while(q-->0){
            char c = in.next().charAt(0);
            System.out.println(hash[c]);


        }


    }
}
