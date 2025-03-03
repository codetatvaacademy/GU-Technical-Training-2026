import java.util.*;
public class MaxNoOfVowels {
    private boolean isVowel(char c){
        return c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u';
    }

    public int maxVowels(String s, int k) {
        
        int maximumVowels = 0;
        char[] str = s.toCharArray();
        int vowels = 0;

        for(int i =0;i<str.length;i++ ){

            vowels += isVowel(str[i]) ? 1 : 0;
            if(i>=k){
                vowels -= isVowel(str[i-k]) ? 1 : 0;
            }
            maximumVowels = Math.max(maximumVowels, vowels);

        }
        return maximumVowels;
    }
    public static void main(String[] args) {
        MaxNoOfVowels obj = new MaxNoOfVowels();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter the length of k(sub string size) : ");
        int k = sc.nextInt();

        int maximumVowels = obj.maxVowels(s, k);
        System.out.println("Maximum string possible: "+maximumVowels);
    }
}
