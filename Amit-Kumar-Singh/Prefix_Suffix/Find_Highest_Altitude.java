//Time Complexity: O(n)
//Space Compelxity: O(1)
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}