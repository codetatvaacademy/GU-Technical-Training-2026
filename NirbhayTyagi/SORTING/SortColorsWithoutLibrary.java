import java.util.Scanner;

class SortColorsWithoutLibrary{
    public static void sortColors(int[] nums) {
        int red=0;
        int blue= nums.length-1;
        int i= 0;
        while(i<=blue){
            if(nums[i]==0){
                int temp= nums[i];
                nums[i]= nums[red];
                nums[red]= temp;
                i++;
                red++;
            }
            else if(nums[i]== 1){
                i++;
            }
            else{
                int temp= nums[i];
                nums[i]= nums[blue];
                nums[blue]= temp;
                blue--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in nums array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
        System.out.println("The resultant array is :");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]);
        }
    }
}

//time complexity of the function is : O(n)
//space complexity of the function is : O(1)

//time complexity of the whole program  is : O(n) + O(n)
//space complexity of the  whole program is : O(n)