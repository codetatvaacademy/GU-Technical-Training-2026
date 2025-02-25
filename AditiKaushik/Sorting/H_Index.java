// 274. H-Index

import java.util.Scanner;

class H_Index{
    public static int hIndex(int[] citations) {
        int[] arr = new int[citations.length + 1];
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > citations.length) {
                arr[arr.length - 1]++;
            } else {
                arr[citations[i]]++;
            }
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] += arr[i + 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= i) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] citations = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            citations[i] = sc.nextInt();
        }
        System.out.println(hIndex(citations));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)