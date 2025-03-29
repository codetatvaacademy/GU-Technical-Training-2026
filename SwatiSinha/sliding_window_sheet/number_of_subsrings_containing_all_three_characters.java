class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr=new int[3];
        Arrays.fill(arr, -1);
        int count=0;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]>=0 && arr[1]>=0 && arr[2]>=0 ){
                count += Math.min(arr[0],(Math.min(arr[1], arr[2])))+1;
            }
        }
        return count;
    }
}