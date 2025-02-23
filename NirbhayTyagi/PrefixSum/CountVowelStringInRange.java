import java.util.Scanner;
class  CountVowelStringInRange{
    public int[] vowelStrings(String[] words, int[][] queries) {
        int count = 0;
        int[] result = new int[queries.length];
        int[] prefixSum = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
            prefixSum[i] = count;
        }
        for (int i = 0; i < queries.length; i++) {
            result[i] = prefixSum[queries[i][1]] - (queries[i][0] > 0 ? prefixSum[queries[i][0] - 1] : 0);

        }

        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        string s = sc.nextString();
        
    }
}