public class PalindromeStr {
    public static void main(String[] args) {
        String s= "MADAM";
        System.out.println(checkPal(s, 0));
    }
    static boolean checkPal(String s, int i){
        if(i<s.length()/2){
            return true;
        }
        if(s.charAt(i)!= s.charAt(s.length()-i-1)){
            return false;
        }
        return checkPal(s,i+1);
    }
}
