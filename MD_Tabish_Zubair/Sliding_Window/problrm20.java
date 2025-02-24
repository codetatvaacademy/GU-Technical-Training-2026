import java.util.Scanner;

public class problrm20 {
    public static String minWindow(String s, String t) {
        if(t.length()>s.length() )
        return "";

        int[] St=new int[128];
        int[] Tt=new int[128];
        int c=0;
        boolean chk =false;
        for(int i=0;i<t.length();i++)
        {
            if(Tt[t.charAt(i)] == 0)
            c++;
            Tt[t.charAt(i)]++;
        }
        
        
        int start=0;
        int e=0;
        int si=0;
        int ei=0;
        int ml=s.length();
        
        while(e<s.length())
        {
            char ch=s.charAt(e);
            St[ch]++;
            if(St[ch] == Tt[ch])
            c--;
        
        while(c==0)
        {
            chk=true;
            char a=s.charAt(start);
            if(St[a]==Tt[a])
            c++;
            St[a]--;
            if(e-start+1 <= ml)
            {
                ml=e-start+1;
                si=start;
                ei=e;
            }
            start++;
            
        }
        e++;
        }
        if(chk==true)
        return s.substring(si , ei+1);
        return "";
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s=sc.nextLine();
        System.out.println("Enter the String 2");
        String t=sc.nextLine();
        
        String ans=minWindow(s, t);
        System.out.println(ans);
    }

}
