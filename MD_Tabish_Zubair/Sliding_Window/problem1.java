import java.util.Scanner;

public class problem1 {
    public static int numberOfAlternatingGroups(int[] colors) {

        int n=colors.length;
        int s=0;
        int c=0;
        while(s+2<n+2)
        {
            if(colors[s]==colors[(s+2)%n]  && colors[s]!=colors[(s+1)%n])
                c++;

            s++;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=numberOfAlternatingGroups(arr);
        System.out.println(ans);
    }
    
}
