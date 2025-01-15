import java.util.Scanner;
public class carrepaired {
    public static boolean ispossible(int[] ranks, long mid, int cars) {
        long carrepaired = 0;
    
        for (int rank : ranks) {
            carrepaired += (long) Math.sqrt((double) mid / rank);
            if (carrepaired >= cars) return true; 
        }
    
        return carrepaired >= cars;
    }
    
    public static int carrepair(int []ranks,int cars){
        int  start=0;
        int end=100;
        //long result=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(ispossible(ranks,mid,cars)){
                //result=mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }
            
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        
        int ranks[]=new int[n];
        System.out.println("enter element in array: ");
        for(int i=0;i<n;i++){
            ranks[i]=sc.nextInt();
        }

        int cars=sc.nextInt();
        long ans=carrepair(ranks,cars);
        System.out.println(ans);
        
    }

    
}
    

