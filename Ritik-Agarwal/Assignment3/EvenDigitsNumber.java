import java.util.Scanner;

public class EvenDigitsNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (isEvenNumberDigits(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEvenNumberDigits(int nums) {
        int count = 0;
        while (nums != 0) {
            nums /= 10;
            count++;
        }
        return (count % 2 == 0);
    }
}