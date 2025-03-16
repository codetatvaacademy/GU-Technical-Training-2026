import java.util.Scanner;

class ReverseString{
        public void reverseString(char[] s) {
            int i=0;
            int j = s.length-1;
            while(i<j){
              char temp = s[i];
              s[i] = s[j];
              s[j] = temp;
              i++;
              j--;
            }
        } public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            String input = sc.nextLine(); 
            char[] s = input.toCharArray(); 
    
            ReverseString rs = new ReverseString();
            rs.reverseString(s);
    
            System.out.println(new String(s));
        }
}