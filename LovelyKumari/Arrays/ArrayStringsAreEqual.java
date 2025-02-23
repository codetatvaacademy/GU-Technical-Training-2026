package Arrays;
import java.util.Scanner;

public class ArrayStringsAreEqual {
    
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0 , m=0;
        int j=0 , n=0;

        while(i < word1.length && j < word2.length){
            if(word1[i].charAt(m) != word2[j].charAt(n)){
                return false;
            }
            m++;
            n++;

            if( m== word1[i].length()){
                i++;
                m=0;
            }

            if(n == word2[j].length()){
                j++;
                n=0;
            }
        }
        if( i < word1.length || j < word2.length) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1=sc.nextInt();
        sc.nextLine();

        String[] word1=new String[n1];
        System.out.println("Enter 1st Array elements: ");
        for(int i=0; i<n1; i++){
            word1[i]=sc.nextLine();
        }
        System.out.println("Enter n2: ");
        int n2=sc.nextInt();
        sc.nextLine();

        String[] word2=new String[n2];
        System.out.println("Enter 2nd Array elements: ");
        for(int i=0; i<n2; i++){
            word2[i]=sc.nextLine();
        }

        boolean answer= arrayStringsAreEqual(word1, word2);
        System.out.println("Output : " + answer);
    }
}
