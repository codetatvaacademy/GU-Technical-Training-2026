// 3208. Alternating Groups II

import java.util.Scanner;

class alternatingGroupsII {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0;
        int end = 1;
        int n = colors.length;
        int count = 0;
        while (end < (n + k - 1)) {
            if (colors[(end - 1) % n] == colors[end % n]) {
                start = end;
            }
            if ((end - start + 1) == k) {
                count++;
                start++;
            }
            end++;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tiles: ");
        int size = sc.nextInt();
        int[] colors = new int[size];
        System.out.println("Red = 0 or Blue = 1");
        for(int i = 0; i < size; i++){
            System.out.println("Enter the color (0 or 1) of tile " + (i + 1) + " : ");
            colors[i] = sc.nextInt();
        }
        System.out.println("Enter the number of tiles in a group: ");
        int k = sc.nextInt();
        System.out.println("The number of alternating groups : " + numberOfAlternatingGroups(colors, k));
        sc.close();
    }
}

//Time Complexity: O(n + k)
//Space Complexity: O(1)