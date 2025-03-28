import java.util.Scanner;

class TrappingRainWater{
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;         
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];  
                } else {
                    res += leftMax - height[left];  
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];  
                } else {
                    res += rightMax - height[right];  
                }
                right--;
            }
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

//time complexity of the function is : O(n)
//space complexity of the function is : O(1)

//time complexity of the whole  program is : O(n) + O(n)
//space complexity of the whole program is : O(n)