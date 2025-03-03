class Solution {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length() + 1];
        int d = s.length();
        int i = 0;
        int j = 0;
        for(j = 0 ; j < arr.length ; j++){
           if(j < s.length()){
           if(s.charAt(j) == 'I'){
                arr[j] = i;
                i++;
            }
            else{
                arr[j] = d;
                d--;
            }
           }
           else if(j == arr.length - 1){
            arr[j] = i;
            }
        }
        return arr;
    }
}
