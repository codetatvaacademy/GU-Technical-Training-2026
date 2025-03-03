import java.util.Scanner;

public class IsStringsEquivalent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word1 = new String[n];
        for(int i=0; i<n; i++){
            word1[i] = sc.next();
        }
        n = sc.nextInt();
        String[] word2 = new String[n];
        for(int i=0; i<n; i++){
            word2[i] = sc.next();
        }
        sc.close();

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = "";
        String second = "";
        for(String s:word1){
            first+=s;
        }
        for(String s:word2){
            second+=s;
        }
        if(first.equals(second)){
            return true;
        }
        else{
            return false;
        }
    }
}