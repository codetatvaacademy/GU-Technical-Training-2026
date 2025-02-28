import java.util.Scanner;

public class BreversePrefixOfWord {
    public static void reverse(char[] arr,int s,int e){
        while(s<=e){
            char temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    public static String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                break;
            }
        }
        if (i == arr.length)
            return word;
        reverse(arr, 0, i);
        return new String(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println(reversePrefix(word, ch));
    }
}
