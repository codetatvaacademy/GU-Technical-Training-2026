package Sliding_Window;

import java.util.Scanner;

class Solution {
    public int numberOfAlternatingGroups(int[] colors) {

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
        System.out.println("Enter the array");
        int[] colors=new int[n];
        for(int i=0;i<n;i++)
        {
            colors[i]=sc.nextInt();
        }
        Solution s=new Solution();
        int ans = s.numberOfAlternatingGroups(colors);
        System.out.println(ans);
    }
}