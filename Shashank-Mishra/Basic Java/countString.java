import java.util.*;
public class countString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int alpha=0;
        int digit=0;
        int special=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
            {
                alpha++;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
               digit++;
            }
            else
            {
                special++;
            }
        }
        System.out.println("Ther are "+alpha+" alphabets and "+digit+" digits and "+special+" special characters");
    }
    
}
