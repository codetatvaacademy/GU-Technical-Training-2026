package Sorting;

import java.util.*;

public class HIndex {
    public int hIndex(int[] citations) {
        int[] frequency = new int[citations.length + 1];

        for (int num : citations) {
            if (num >= citations.length) {
                frequency[citations.length]++;
            } else {
                frequency[num]++;
            }
        }

        int suffix = 0;
        for (int i = citations.length; i >= 0; i--) {
            suffix += frequency[i];
            if (suffix >= i) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in citations
        System.out.print("Enter the number of elements in citations: ");
        int n = scanner.nextInt();
        int[] citations = new int[n];

        System.out.println("Enter the elements of citations:");
        for (int i = 0; i < n; i++) {
            citations[i] = scanner.nextInt();
        }

        scanner.close();

        HIndex obj = new HIndex();
        int result = obj.hIndex(citations);

        System.out.println("H-Index: " + result);
    }
}
