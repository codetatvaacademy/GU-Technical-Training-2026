class Solution {
    public String reverseWords(String s) {
       char[] arr = s.toCharArray();
       int first = 0;
       int last = 0;
       int n =s.length();
       while(last < n){
        while(last < n && arr[last] != ' '){
            last++;
        }
            reverse(arr, first, last - 1);
            last++;
            first = last;
        
       }
       return new String(arr);
    }

    public void reverse(char[] arr, int first, int last){
        while(first < last){
            char temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
}
