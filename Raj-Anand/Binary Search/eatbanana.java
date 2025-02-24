 import java.util.Scanner;
public class eatbanana {
    static boolean ispossible(int piles[],int hours,int mid){
        int h=0;
        int totalhours=0;
        for(int pile:piles){
            totalhours+=(int)Math.ceil((double)(pile)/mid);
        }
        return totalhours<=h;
    }
    public static int caneatbanana(int piles[],int hours){
        int start=1;
        int end=0;
        for(int pile:piles){
            end=Math.max(end,pile);
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(ispossible(piles,hours,mid)){
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
        int n=sc.nextInt();
        System.out.println("enter the size of array");
        int piles[]=new int[n];
        for (int i = 0; i < piles.length; i++) {
            piles[i]=sc.nextInt();
            
        }
        System.out.println("enter the array");
        int hours=sc.nextInt();
        int ans=caneatbanana(piles,hours);
        System.out.println(ans);
        


        
    }

    
}
    

