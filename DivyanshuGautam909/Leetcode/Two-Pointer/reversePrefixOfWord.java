import java.util.Scanner;

public class reversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        char[] arr = word.toCharArray();
        int start = 0;
        int end = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == ch) {
                end = i;
                break;
            }
        }

        if (end == -1) {
            return word;
        }

        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        scanner.close();

        reversePrefixOfWord obj = new reversePrefixOfWord();
        String result = obj.reversePrefix(word, ch);

        System.out.println("Modified word: " + result);
    }
}
