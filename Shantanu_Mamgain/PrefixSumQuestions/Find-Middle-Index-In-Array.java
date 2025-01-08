import java.util.Scanner;

public class MiddleIndexInArray {


    public static int findMiddleIndex(int[] nums) {
        for(int i =1; i<nums.length; i++){
            nums[i]+= nums[i-1];
        }

        for(int i =0; i<nums.length ;i++){
            if(i==0){
                if((nums[nums.length-1]-nums[i])==0){
                    return i;
                }

            }
            else if(i==nums.length-1){
                if(nums[i-1]==0){
                    return i;
                }
            }
            else{
                if(nums[i-1]==nums[nums.length-1]-nums[i]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i =0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(findMiddleIndex(nums));
        sc.close();
    }
}
