import java.util.Scanner;
public class NumberOfVowelsInSubstring {
        public boolean isVowels(char c){
            return c=='a' || c=='i'|| c=='e' ||c=='o' ||c=='u';
        }
        public int maxVowels(String s, int k) {
           int start=0;
           int end=0;
           int count=0;
           int maxLength=0;
            while(end<s.length()){
              if(isVowels(s.charAt(end))){
                count++;
              }
                while(end-start+1>k){
                   if(isVowels(s.charAt(start))){
                    count--;
                   }
                    start++;
                }
                maxLength = Math.max(maxLength,count);
                end++;
            } 
            return maxLength;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
             String s = sc.nextLine();
             int k = sc.nextInt();
             NumberOfVowelsInSubstring nv = new NumberOfVowelsInSubstring();
             System.out.println(nv.maxVowels(s,k));
        }
}
