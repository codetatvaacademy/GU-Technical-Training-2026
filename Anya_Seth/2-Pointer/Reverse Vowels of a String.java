class Solution {
    public String reverseVowels(String s) {
       int i = 0;
       int j = s.length() - 1;
       char[] arr = s.toCharArray();
       while(i < j){
        while(i < j && !isVowels(arr[i])){
            i++;
        }
        while(i < j && !isVowels(arr[j])){
            j--;
        }
        if(i < j){
             char temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
        }
        }
        return new String(arr); 
    }
    public static boolean isVowels(char x) 
    { 
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || 
            x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            return true;
        }
        return false;
    } 
}
