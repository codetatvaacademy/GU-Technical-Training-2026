import java.util.*;
class Problem2{
    public static boolean isValid(int[] piles,int h,int mid){
        int hours=0;
        for(int pile : piles){
            hours+=Math.ceil((double)pile/mid);
            if(hours>h){
                return false;
            }
        }
        return hours<=h;
    }
    public static int minBananas(int[] piles, int h){
        Arrays.sort(piles);
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int pile : piles){
            max=Math.max(pile,max);
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(isValid(piles,h,mid)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
    public static void main(String arggs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        System.out.println("Enter the piles array:");
        int[] piles=new int[n];
        for(int i=0;i<n;i++){
            piles[i]=sc.nextInt();
        }
        System.out.println("Enter the hours:");
        int h=sc.nextInt();
        int result=minBananas(piles,h);
        System.out.println(result);
    }
}

//Time Complexity: O(n logn)
//Space Complexity: O(1)