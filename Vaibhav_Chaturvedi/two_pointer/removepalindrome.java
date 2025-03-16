
class removepalindrome{
    public int removePalindromeSub(String s) {
        int count=0;
        int start=0;
        int end =s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
             count=count+2;
             break;
            }
            start++;
            end--;
        } 
        return count==0 ? 1 : count;
    }
} 