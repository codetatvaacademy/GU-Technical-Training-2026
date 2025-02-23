import java.util.*;
class Problem3{
    public boolean isValid(int[] ranks, int cars, long minTime){
        int count=0;
        for(int r : ranks){
            count+=(int)Math.floor(Math.sqrt(minTime/r));
            if(count>=cars){
                return true;
            }
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        long min=1;
        long max=0;
        for(int r : ranks){
            max=Math.max(max,r);
        }
        max=max*1L*cars*cars;

        while(min<max){
            long mid=(min+max)/2;
            if(isValid(ranks,cars,mid)){
                max=mid;
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
        int[] ranks=new int[n];
        for(int i=0;i<n;i++){
            ranks[i]=sc.nextInt();
        }
        System.out.println("Enter the cars:");
        int cars=sc.nextInt();
        int result=minTimeTaken(piles,h);
        System.out.println(result);
    }
}

//Time Complexity: O(n logn)
//Space Complexity: O(1)