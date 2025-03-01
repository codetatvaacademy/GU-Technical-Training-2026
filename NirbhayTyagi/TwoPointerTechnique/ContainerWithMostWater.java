import java.util.Scanner;

class ContainerWithMostWater{
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = 0;
        while (i < j) {
            int t = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, t);
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println("The maximum amount of water a container can store is:" + maxArea(height));

    }
}

//time complexity of the function is : O(n)
//space complexity of the function is : O(1)

//time complexity of the whole program is : O(n) + O(n)
//space complexity of the whole program is : O(n)