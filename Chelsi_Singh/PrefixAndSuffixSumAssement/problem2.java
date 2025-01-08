
import java.util.Scanner;

public class problem2 {
public static int[] totalSeats(int[][] nums) {
Scanner sc=new Scanner(System.in);
int n = nums.length;
int[] seats = new int[n];
for (int i = 0; i < n; i++) {
for (int j = nums[i][0]; j <= nums[i][1]; j++) {
seats[j] = 1;
}
}
return seats;
}
}
//time complexity:  O(n^2)
//space compexity:O(2n)

