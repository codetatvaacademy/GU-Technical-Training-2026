import java.util.Scanner;

public class RangeSumQuery {
    int[] numArr  ;

    public void NumArray(int[] nums) {
        this.numArr=nums;
        for(int i=1;i<nums.length;i++){
            numArr[i]=numArr[i]+numArr[i-1];        }
       
    }
    
    public int sumRange(int left, int right) {
        
        return left==0?numArr[right]:numArr[right]-numArr[left-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int numArray=sc.nextInt();
        num
        for(int i=0; i<numArray;i++){

        }
        System.out.print("Enter the ");
    }
}
