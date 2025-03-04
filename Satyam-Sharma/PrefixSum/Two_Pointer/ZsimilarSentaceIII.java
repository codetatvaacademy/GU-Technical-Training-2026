import java.util.Scanner;

public class ZsimilarSentaceIII {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() < sentence2.length()) {
            String temp = sentence1;
            sentence1 = sentence2;
            sentence2 = temp;
        }
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int i = 0, j = s1.length - 1;
        int k = 0, l = s2.length - 1;
        while (k < s2.length && i < s1.length && s2[k].equals(s1[i])) {
            k++;
            i++;
        }
        while (l >= k && s2[l].equals(s1[j])) {
            j--;
            l--;
        }

        return l < k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first sentence: ");
        String sentence1 = sc.nextLine();
        System.out.println("Enter the second sentence: ");
        String sentence2 = sc.nextLine();
        System.out.println(areSentencesSimilar(sentence1, sentence2));
    }
}
