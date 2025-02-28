public class ReverseLetters {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        char[] res= s.toCharArray();
        while(left<right){
            while(left<right && !Character.isLetter(res[left])){
                left++;
            }
            while(left<right && !Character.isLetter(res[right])){
                right--;
            }
            if(left<right){
                char temp=res[left];
                res[left]=res[right];
                res[right]=temp;
                left++;
                right--;
            }
        }
        return new String(res);
    }
}
