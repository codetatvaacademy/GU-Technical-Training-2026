//  time complexity -> O(nlogn)
// space complexity -> O(1)

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ranks = new int[n];

        for(int i=0; i<n; i++){
            ranks[i] = sc.nextInt();
        }

        int cars = sc.nextInt();
        sc.close();

        long start = 1;
        int min = 100;
        for(int r:ranks){
            min = (min>r)?r:min;
        }
        long end = (long)cars*cars*min;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (isPossible(ranks, mid, cars)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        System.out.println(start);
    }

    private static boolean isPossible(int[] ranks, long mid, int cars) {
        long sum = 0;
        for(int i:ranks) {
            sum+=Math.sqrt(mid/i);
            if(sum>=cars){
                return true;
            }
        }
        return sum>=cars;
    }
}
