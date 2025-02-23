import java.util.*;
class DivideChocolate{
    public static boolean isValid(int[] sweetness,int minSweetness,int pieces){
        int sum=0;
        int count=0;
       for(int sweet : sweetness){
            sum+=sweet;
            if(sum>=minSweetness){
                count++;
                sum=0;
            }
       }
       return count>=pieces;
    }
    public static int maximizeSweetness(int[] sweetness,int k){
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int sweet : sweetness){
            max+=sweet;
            min=Math.min(min,sweet);
        }
        if(sweetness.length==0){
            return 0;
        }
        if(k==0){
            return max;
        }
        if(k>=sweetness.length){
            return min;
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(isValid(sweetness,mid,k+1)){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of chocolate chunks:");
        int n=sc.nextInt();
        int[] sweetness=new int[n];
        System.out.println("Enter the sweetness of "+n+" chunks:");
        for(int i=0;i<n;i++){
            sweetness[i]=sc.nextInt();
        }
        System.out.println("Enter number of friends:");
        int k=sc.nextInt();
        int result=maximizeSweetness(sweetness,k);
        System.out.println("Maximum sweetness of your piece is: "+result);
    }
}