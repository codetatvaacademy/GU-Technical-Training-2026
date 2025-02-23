class Solution {
    public String reversePrefix(String word, char ch) {
        int swap = 0;
        char[] arr = word.toCharArray();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == ch){
               swap = i;
               break;
            }
        }
        for(int j = 0 ; j <= swap ; j++){
            if(j < swap){
            char temp = arr[j];
            arr[j] = arr[swap];
            arr[swap] = temp;
            }
            swap--;
        }
        String str = new String(arr);
        return str;
    }
}
