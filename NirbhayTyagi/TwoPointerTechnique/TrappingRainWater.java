import java.util.Scanner;

class TrappingRainWater{
    public static int trap(int[] height) {
        int n = height.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = height[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, height[j]);
            }
            int right = height[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, height[j]);
            }
            res += Math.min(left, right) - height[i];
        }
        return res;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println("The resultant array is " + trap(height));
    }
}