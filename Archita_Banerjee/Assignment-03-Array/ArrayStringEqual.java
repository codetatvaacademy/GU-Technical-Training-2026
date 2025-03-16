import java.util.Scanner;
public class ArrayStringEqual {
    public static  boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for(String word: word1){
            sb1.append(word);
        }
        for(String word:word2){
            sb2.append(word);
        }
        return sb1.toString().equals(sb2.toString());

    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements in the first array (word1): ");
            int n1 = sc.nextInt();
            sc.nextLine();
            String[] word1 = new String[n1];
            System.out.println("Enter the strings for word1:");
            for (int i = 0; i < n1; i++) {
                word1[i] = sc.nextLine();
            }
            System.out.print("Enter the number of elements in the second array (word2): ");
            int n2 = sc.nextInt();
            sc.nextLine();
            String[] word2 = new String[n2];
            System.out.println("Enter the strings for word2:");
            for (int i = 0; i < n2; i++) {
                word2[i] = sc.nextLine();
            }
            boolean areEqual = arrayStringsAreEqual(word1, word2);
            if (areEqual) {
                System.out.println("The two string arrays form the same string.");
            } else {
                System.out.println("The two string arrays do not form the same string.");
            }
    }
}
