import java.util.Scanner;

public class problem4 {
    public static int numberOfSubstrings(String s) {
        int start=0;
        int e=0;
        int count=0;
        int[] freq= new int[3];
        int n=s.length();
        while(e<n)
        {
            
            freq[s.charAt(e)-'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0 )
            { 
                count+=n-e;
                freq[s.charAt(start)- 'a']--;
                start++;
                    
            }
                e++;
            
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        
        
        int ans=numberOfSubstrings(str);
        System.out.println(ans);
    }
}
    

